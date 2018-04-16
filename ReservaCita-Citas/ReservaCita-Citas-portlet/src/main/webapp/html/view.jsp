<%@page import="com.proyecto.citas.service.CitaLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.Cita"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>

<portlet:defineObjects />	   

<liferay-ui:success key="success" message="Se ha creado la cita correctamente"/>

<%@ include file="/html/calendar.jspf" %>












