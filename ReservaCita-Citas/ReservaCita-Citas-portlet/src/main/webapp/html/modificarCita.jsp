<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.model.Role" %>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil" %>
<%@ include file="/html/init.jsp" %>
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" /> 

<portlet:defineObjects />
<%
	String idCita = renderRequest.getParameter("idCita");
	String fecha = renderRequest.getParameter("fecha");
	String hora = renderRequest.getParameter("hora");	
	ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	List<Role> userRoles=RoleLocalServiceUtil.getRoles(0, RoleLocalServiceUtil.getRolesCount());
	long rolId = 0;
	for(Role role : userRoles){
		if(role.getName().equals("RolCliente")){
			rolId = role.getRoleId();
		}
	}
%>
<liferay-ui:success key="warning" message="<%= fecha %>"/>
<portlet:actionURL var="modificarCitaURL" windowState="normal" name="modificarCita">
</portlet:actionURL>
<h3>Modificar Cita - <%= fecha %> - <%= hora %>:00</h3>
	<aui:form action="<%=modificarCitaURL%>" name="<portlet:namespace />modificarCitaForm"  method="POST">	
		<div class="button-holder">		
				<aui:button type="submit" name="modificarCita" id="modificarCita"></aui:button>	
				<aui:button type="cancel" value="Volver" onClick="javascript:history.back()"/>			
		</div>	
		<aui:input type="hidden" name="idCita" value="<%= idCita %>"/>
		<aui:input type="hidden" name="fecha" value="<%= fecha %>"/>
		<aui:input type="hidden" name="hora" value="<%= hora %>"/>
		<aui:select  name="idCliente" label="Cliente">
			<%
				List<User> users = UserLocalServiceUtil.getRoleUsers(rolId);
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