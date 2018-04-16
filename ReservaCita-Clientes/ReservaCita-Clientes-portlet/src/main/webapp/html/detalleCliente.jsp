<%@page import="com.proyecto.clientes.service.CitaLocalServiceUtil"%>
<%@page import="com.proyecto.clientes.model.Cita"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ include file="/html/init.jsp" %>

<%
	int idCliente = Integer.parseInt(renderRequest.getParameter("idCliente"));
	String url = renderRequest.getParameter("urlBack");
	
	User cliente = UserLocalServiceUtil.getUser(Long.parseLong(renderRequest.getParameter("idCliente")));
	String nombreCompleto = cliente.getFirstName()+" "+cliente.getMiddleName()+" "+cliente.getLastName();
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	List<Cita> listCitas = new ArrayList<Cita>();
	listCitas = CitaLocalServiceUtil.getCitas(0, CitaLocalServiceUtil.getCitasCount());

%>
	<portlet:renderURL var="back">
	    <portlet:param name="mvcPath" value="<%= url %>" />
	    <portlet:param name="idCliente" value="<%= String.valueOf(idCliente)%>"/>
	</portlet:renderURL>
	<aui:button type="cancel" value="Volver" href="<%= back.toString() %>" style="float: right;"/>
	</br>
	<h3><%= nombreCompleto %></h3>
	<p><b>Email:</b> <%= cliente.getEmailAddress() %></p>
	</br>
	<liferay-ui:search-container
		   emptyResultsMessage="No se encuentran Citas relacionadas con este cliente."
		   delta="5">
			<liferay-ui:search-container-results
				results="<%= listCitas %>"
				total="<%= listCitas.size() %>"/>					
			<liferay-ui:search-container-row
				className="com.proyecto.clientes.model.Cita"
				keyProperty="idCita"
				modelVar="cita">		
				<%
					if(cita.getIdCliente()==idCliente){
				%>
		     	<liferay-ui:search-container-column-text cssClass="column-center" name="Últimas Citas"
		         value="<%= sd.format(cita.getFechaCita()) %>" 
		         />
		         <%
					}
		         %>
			</liferay-ui:search-container-row>		
			<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
	<aui:button type="cancel" value="Volver" href="<%= back.toString() %>" style="float: right;"/>
	
	