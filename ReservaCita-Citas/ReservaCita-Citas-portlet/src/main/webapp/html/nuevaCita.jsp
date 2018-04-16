<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ include file="/html/init.jsp" %>
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" /> 

<portlet:defineObjects />
<%
	String fecha = renderRequest.getParameter("fecha");
	String hora = renderRequest.getParameter("hora");	

%>
<liferay-ui:success key="warning" message="<%= fecha %>"/>
<portlet:actionURL var="nuevaCitaURL" windowState="normal" name="nuevaCita">
</portlet:actionURL>
<h3>Crear nueva Cita - <%= fecha %> - <%= hora %>:00</h3>
	<aui:form action="<%=nuevaCitaURL%>" name="<portlet:namespace />nuevaCitaForm"  method="POST">	
		<div class="button-holder">		
				<aui:button type="submit" name="nuevaCita" id="nuevaCita"></aui:button>	
				<aui:button type="cancel" value="Volver" onClick="javascript:history.back()"/>			
		</div>	
	
		<aui:input type="hidden" name="fecha" value="<%= fecha %>"/>
		<aui:input type="hidden" name="hora" value="<%= hora %>"/>
		<aui:select  name="idCliente" label="Cliente">
			<%
				List<User> users = UserLocalServiceUtil.getRoleUsers(22309);
				for(User us : users){
			%>
     		<aui:option value="<%= String.valueOf(us.getUserId()) %>"><%= us.getFirstName()%> <%=us.getLastName() %></aui:option>
     		<%
				}
     		%>
     	</aui:select>
		<aui:input label="Descripcion de la cita" name="descripcion" type="textarea" style="width: 300px; height: 100px;"></aui:input>
	
		<div class="button-holder">		
				<aui:button type="submit" name="nuevaCita" id="nuevaCita"></aui:button>	
				<aui:button type="cancel" value="Volver" onClick="javascript:history.back()"/>			
		</div>
	</aui:form>