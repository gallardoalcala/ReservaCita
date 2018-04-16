<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<portlet:defineObjects />
<% 

//HAY QUE RECOGER EL ROL CON NOMBRE "ROLCLIENTE"
List<User> users = UserLocalServiceUtil.getRoleUsers(22309);
%>

<b>Clientes</b>.
<liferay-ui:search-container
		   emptyResultsMessage="No se encuentran Clientes"
		   delta="50">
			<liferay-ui:search-container-results
				results="<%= users %>"
				total="<%= users.size() %>"
			/>
		
			<liferay-ui:search-container-row
				className="com.liferay.portal.model.User"
				keyProperty="userId"
				modelVar="user"
			>		
		      	<liferay-ui:search-container-column-text name="Id"
		       	 value="<%= String.valueOf(user.getUserId()) %>"/>
		     	<liferay-ui:search-container-column-text name="Nombre"
		         value="<%= String.valueOf(user.getFirstName()) %>" />
				<liferay-ui:search-container-column-text name="Apellidos"		
		         value="<%= String.valueOf(user.getMiddleName()) %>" /> 
		        <liferay-ui:search-container-column-text name="Email"
		         value="<%= String.valueOf(user.getEmailAddress()) %>" />
		        <portlet:renderURL var="ver">
		    			<portlet:param name="mvcPath" value="/html/detalleCliente.jsp" />
						<portlet:param name="idCliente" value="<%= String.valueOf(user.getUserId())%>"/>
						<portlet:param name="urlBack" value="/html/viewClientes.jsp" />
				</portlet:renderURL>
		    	<liferay-ui:search-container-column-text cssClass="column-center">
		        	<aui:button href="<%= ver.toString() %>" name="ver" value="Ver"></aui:button>
		        </liferay-ui:search-container-column-text>  
			</liferay-ui:search-container-row>
		
			<liferay-ui:search-iterator />
</liferay-ui:search-container>
