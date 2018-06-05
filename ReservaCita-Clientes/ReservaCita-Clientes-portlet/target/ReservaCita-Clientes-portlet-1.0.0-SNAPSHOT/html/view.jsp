<%@page import="com.proyecto.clientes.service.CitaLocalServiceUtil"%>
<%@page import="com.proyecto.clientes.model.Cita"%>
<%@page import="com.proyecto.clientes.service.ClienteLocalServiceUtil"%>
<%@page import="com.proyecto.clientes.model.Cliente"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>

<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" />

<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<portlet:defineObjects />

	<!-- Defining the resourceURL -->
	<portlet:resourceURL var="sendData" id="activarCliente" />
	<portlet:resourceURL var="sendDenegar" id="denegarCliente" />
	
	<script type="text/javascript">		
		function sendDataToServer(idCliente){	
			AUI().use(
				'aui-io-request', 
				function(A) {
					A.io.request(
						'<%=sendData%>',
						{
							method : 'post',
							// Sending three parameters.
							data : {
								idCliente : idCliente
							}
						}
					);
				}
			);
			
			setTimeout(function(){ location.reload(); }, 500);		
			
		}
		
		function sendDataToServerDenegar(idCliente){	
			AUI().use(
				'aui-io-request', 
				function(A) {
					A.io.request(
						'<%=sendDenegar%>',
						{
							method : 'post',
							// Sending three parameters.
							data : {
								idCliente : idCliente
							}
						}
					);
				}
			);
			
			setTimeout(function(){ location.reload(); }, 500);		
			
		}
	</script>

<liferay-ui:success key="success" message="Success"/>	
<liferay-ui:error key="error" message="Error" />

<%

	//Recorremos todos los usuarios registrados en el sistema, y si no estvieran en nuestra tabla Cliente, los incluimos.	

	List<Cliente> listClientes = ClienteLocalServiceUtil.getClientes(0, ClienteLocalServiceUtil.getClientesCount());
	List<User> listUsers = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
	for(User user : listUsers){
		if(ClienteLocalServiceUtil.findByIdCliente(user.getUserId())==null || ClienteLocalServiceUtil.findByIdCliente(user.getUserId()).isEmpty()){
			if(!user.getFirstName().equals("Test")){
				Cliente newC = ClienteLocalServiceUtil.createCliente(user.getUserId());
				newC.setActivado(0);
				newC.setDenegado(0);
				newC.persist();		
			}
		}							
	}
	
	List<Cliente> noActivados = new ArrayList<Cliente>();
	for(Cliente cliente : listClientes){		
		if(cliente.getActivado()==0){
			noActivados.add(cliente);
		}
	}
	
	if(noActivados.size()>0){	
		
%>
			<h4>Hay usuarios pendientes de activación:</h4>
			<div class="container" style="width: 60%; max-height: 250px; overflow-x: scroll; border: 1px solid lightgrey;">
<%
		for(Cliente cliente : noActivados){
%>			
				<div class="row" style="width: 60%;margin-left: 10%;">
				    <div class="col-sm-4" style=""><%= UserLocalServiceUtil.getUser(cliente.getIdCliente()).getFirstName()%> <%= UserLocalServiceUtil.getUser(cliente.getIdCliente()).getLastName()%></div>
				    <div class="col-sm-4" style=""><%= UserLocalServiceUtil.getUser(cliente.getIdCliente()).getEmailAddress()%></div>
				    <div class="col-sm-4" ><button class="btn" onclick="sendDataToServer(<%= cliente.getIdCliente() %>)">Activar</button><button class="btn" onclick="sendDataToServerDenegar(<%= cliente.getIdCliente() %>)">Denegar</button></div>
				</div>			
<%	
		}
%>
			</div>
<%
	}else{
%>

<%@ include file="/html/viewClientes.jsp" %>

<% 
	}
%>