<%@page import="com.proyecto.citas.beans.CitaBean"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.proyecto.citas.service.CitaLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.Cita"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
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
%>
<portlet:renderURL var="back">
	    	<portlet:param name="mvcPath" value="/html/view.jsp" />
</portlet:renderURL>

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
						    	<div class="col-sm-2" style=" border-right: 1px solid grey; color: black;text-align: center; padding-bottom: 1%;padding-top: 1%;"><%=i%>:00</div>
						    	<div class="col-sm-10" style="color: black;">
									<p style="padding-top: 1%;"><%= UserLocalServiceUtil.getUser(Long.parseLong(c.getIdCliente()+"")).getFirstName() %> <%= UserLocalServiceUtil.getUser(Long.parseLong(c.getIdCliente()+"")).getLastName() %> - <%= c.getDescripcion() %></p>
						    	</div>
						  	</div>
						<%
						}else{
						%>	
							<div class="row" style="border: 1px solid grey; background-color: lightgoldenrodyellow; margin: 0.5%;padding-bottom: 1%;padding-top: 1%;">
						    	<div class="col-sm-2" style=" border-right: 1px solid grey; color: black; text-align: center; "><%=i%>:00</div>
						    	<div class="col-sm-10" style="color: black;">
							    	<portlet:renderURL var="nuevaCita">
										<portlet:param name="mvcPath" value="/html/nuevaCita.jsp" />
										<portlet:param name="fecha" value="<%=fechaString%>"/>
										<portlet:param name="hora" value="<%= String.valueOf(i) %>"/>									
									</portlet:renderURL>
									<aui:button type="cancel" value="Nueva Cita" href="<%=  nuevaCita.toString() %>" style="float: right;"/>
						    	</div>
						  	</div>
						<%	
						}	
					}
					if(i==14){
					%>
						<div style="background-color: grey; padding-bottom: 1%;"></div>
					<%
					}
				}
		  	%>
</div>