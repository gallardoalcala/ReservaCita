<%@page import="com.proyecto.citas.service.CitaLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.Cita"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.model.Role" %>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>  

<liferay-ui:success key="success" message="Se ha creado la cita correctamente"/>

<%
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
	if(mostrar==true){
%>
	<%@ include file="/html/calendar.jspf" %>	
<%
	}else{
%>
	<%@ include file="/html/viewReservas.jspf" %>
<% 
	}	
%>











