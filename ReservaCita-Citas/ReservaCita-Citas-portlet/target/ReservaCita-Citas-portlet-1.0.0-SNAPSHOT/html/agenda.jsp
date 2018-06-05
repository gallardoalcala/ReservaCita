<%@page import="com.proyecto.citas.beans.CitaBean"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.proyecto.citas.service.CitaLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.Cita"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.model.Role" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>

<%
//Recogemos la fecha a mostrar en la agende del request	
	String daySelect = request.getParameter("daySelect");					
	String mesSelect = request.getParameter("mesSelect");	
	String anioSelect = request.getParameter("anioSelect");
	String fechaString = daySelect+"/"+mesSelect+"/"+anioSelect;
	Date fechaFinal = null;
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	fechaFinal = sd.parse(fechaString);
	Calendar cal = Calendar.getInstance();
	cal.setTime(fechaFinal);
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
	List<Cita> listCitas = CitaLocalServiceUtil.getCitas(0, CitaLocalServiceUtil.getCitasCount());
	List<CitaBean> citasMostrar = new ArrayList<CitaBean>();
	
	Calendar calList = Calendar.getInstance();
	for(Cita cita : listCitas){				
		calList.setTime(cita.getFechaCita());
		int yearList = calList.get(Calendar.YEAR);
		int monthList = calList.get(Calendar.MONTH);
		int dayList = calList.get(Calendar.DAY_OF_MONTH);
		int hourList = calList.get(Calendar.HOUR_OF_DAY);
		int minutesList = calList.get(Calendar.MINUTE);
		
		if(year == yearList){
			if(month==monthList){
				if(day==dayList){
					citasMostrar.add(new CitaBean(cita.getIdCita(), cita.getIdCliente(), cita.getDescripcion(), dayList, monthList, yearList, hourList, minutesList));
				}
			}	
		}
	}
	ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	List<Role> userRoles=RoleLocalServiceUtil.getRoles(0, RoleLocalServiceUtil.getRolesCount());
	long rolId = 0;
	for(Role role : userRoles){
		if(role.getName().equals("RolCliente")){
			rolId = role.getRoleId();
		}
	}
	long  roleIds [] = themeDisplay.getUser().getRoleIds();
	boolean mostrar = true;
	for(int i=0; i < roleIds.length; i++){
		if(roleIds[i]==rolId){		
			mostrar = false;
		}
	}
	if(mostrar==false){
		
	}else{
%>
<portlet:renderURL var="back">
	    	<portlet:param name="mvcPath" value="/html/view.jsp" />
</portlet:renderURL>
<portlet:actionURL var="deleteCitaURL" name="deleteCita"></portlet:actionURL>

<aui:button type="cancel" value="Volver" href="<%=  back.toString() %>" />

<h3>Agenda del día <%= fechaString %></h3>

<div class="container-striped" style="width: 70%; margin-left: 10%;">	
			<%
				for(int i=9; i<20; i++){
					if(i<14 || i >=17){	
						CitaBean c = null;
						for(CitaBean bean : citasMostrar){
							if(bean.getHora() == i){
								c = bean;
							}
						}
					
						if(c != null && c.getHora() == i){
						%>	
							<div class="row" style="border: 1px solid grey; background-color: lightgreen; margin: 0.5%;">
						    	<div class="col-sm-1" style=" border-right: 1px solid grey; color: black;text-align: center; padding-bottom: 1%;padding-top: 1%;"><%=i%>:00</div>
						    	<div class="col-sm-8" style="color: black;">
									<%
										if(c.getDescripcion().length()>=40){
									%>
									<p style="padding-top: 7px;" title="<%= c.getDescripcion() %>"><%= UserLocalServiceUtil.getUser(Long.parseLong(c.getIdCliente()+"")).getFirstName() %> <%= UserLocalServiceUtil.getUser(Long.parseLong(c.getIdCliente()+"")).getLastName() %> - <%= c.getDescripcion().substring(0,40) %></p>
						    		<%
										}else{
						    		%>
						    		<p style="padding-top: 7px;"><%= UserLocalServiceUtil.getUser(Long.parseLong(c.getIdCliente()+"")).getFirstName() %> <%= UserLocalServiceUtil.getUser(Long.parseLong(c.getIdCliente()+"")).getLastName() %> - <%= c.getDescripcion() %></p>
						    		<%
										}
						    		%>						    		
						    	</div>
						    	<div class="iconos col-sm-3" style="padding-top: 7px;">
						    		<form action='<%=deleteCitaURL%>' method='post' onsubmit="return confirm('¿Desea borrar ésta cita?');" style="margin: 0 !important; padding-left: 50%;">
										<input type='hidden' name='citaId' value='<%= String.valueOf(c.getIdCita()) %>'></input>
										<button type="submit" class="btn btn-danger icon-trash"></button>
										<portlet:renderURL var="modificarCita">
											<portlet:param name="mvcPath" value="/html/modificarCita.jsp" />
											<portlet:param name="idCita" value="<%=String.valueOf(c.getIdCita())%>"/>
											<portlet:param name="fecha" value="<%=fechaString%>"/>
											<portlet:param name="hora" value="<%= String.valueOf(i) %>"/>									
										</portlet:renderURL>
										<aui:button type="button" cssClass="btn btn-primary icon-pencil" href="<%= modificarCita.toString() %>" style="background-color:#4e4ebd;"></aui:button>
									</form>						    		
						    	</div>
						  	</div>
						<%
						}else{
						%>	
							<div class="row" style="border: 1px solid grey; background-color: #fbf8f8; margin: 0.5%;padding-bottom: 1%;padding-top: 1%;">
						    	<div class="col-sm-1" style=" border-right: 1px solid grey; color: black; text-align: center; "><%=i%>:00</div>
						    	<div class="col-sm-11" style="color: black;">
							    	<portlet:renderURL var="nuevaCita">
										<portlet:param name="mvcPath" value="/html/nuevaCita.jsp" />
										<portlet:param name="fecha" value="<%=fechaString%>"/>
										<portlet:param name="hora" value="<%= String.valueOf(i) %>"/>									
									</portlet:renderURL>
									<aui:button type="cancel" value="Nueva Cita" href="<%= nuevaCita.toString() %>" style="float: right;"/>
						    	</div>
						  	</div>
						<%	
						}	
					}
					if(i==14){
					%>
						<div style="background-color: lightgrey; padding-bottom: 1%;"></div>
					<%
					}
				}
		  	%>
</div>
					<%
					}
		  	%>