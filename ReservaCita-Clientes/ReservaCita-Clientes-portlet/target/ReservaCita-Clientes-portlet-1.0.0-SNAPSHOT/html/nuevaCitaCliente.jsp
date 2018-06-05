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
	<h4><b>Cliente:</b> <%= nombreCompleto %></h4>
	<p><b>Email:</b> <%= cliente.getEmailAddress() %></p>
	</br>
	<aui:input label="Descripcion de la cita" name="descripcion" type="textarea" style="width: 300px; height: 100px;"></aui:input>
	
	<aui:button type="cancel" value="Volver" href="<%= back.toString() %>" style="float: right;"/>
	
	