<%@page import="com.proyecto.citas.service.DiaLibreLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.DiaLibre"%>
<%@page import="com.proyecto.citas.service.DiasLibresLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.DiasLibres"%>
<%@page import="com.proyecto.citas.service.HorarioTrabajoLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.HorarioTrabajo"%>
<%@page import="com.proyecto.citas.service.DiaFestivoLocalServiceUtil"%>
<%@page import="com.proyecto.citas.model.DiaFestivo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>
<link href="<%=request.getContextPath()%>/css/responsive-calendar.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" />

<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/responsive-calendar.js"></script>
<%
	Date fechaActual = new Date();
	SimpleDateFormat formatDay = new SimpleDateFormat("dd");	
	SimpleDateFormat formatMonth = new SimpleDateFormat("MM");
	SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
	SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
	
	HorarioTrabajo horario = HorarioTrabajoLocalServiceUtil.getHorarioTrabajo(1);
	String[] horaInicio = horario.getHoraInicio().split(":");
	String[] horaFin = horario.getHoraFin().split(":");
	String[] horaInicioTarde = horario.getHoraInicioTarde().split(":");
	String[] horaFinTarde = horario.getHoraFinTarde().split(":");
	
	String dayT = formatDay.format(fechaActual);
	String monthT = formatMonth.format(fechaActual);
	String yearT = formatYear.format(fechaActual);	
	String fechaHoy = yearT+"-"+monthT+"-"+dayT;
	
	String linea = "";
	
	List<DiaFestivo> listaFestivos = DiaFestivoLocalServiceUtil.getDiaFestivos(0, DiaFestivoLocalServiceUtil.getDiaFestivosCount());
	for(DiaFestivo festivo : listaFestivos){
		Date fechaFestivo = festivo.getFechaFestivo();
		linea = linea +  ",'"+formatDate.format(fechaFestivo)+"': {\"class\": \"festivo\"}";				
	}
	
%>

<style>
	.container{
		display: inline-flex;
	}
	.containerCalendar{
	    width: 57% !important;
	    height: 100%;
	    border: 1px solid lightgray;
	    padding: 1%;
	    margin-left: 1%!important;
	    box-shadow: 2px 2px 7px 0px grey;
	}
	.day.festivo.today > a {
	    border: 2px solid blue !important;
	}
	
	.day.festivo {
	    background-color: red !important;
	    color: white;
	    border: 0.5px solid white;
	}
	.day.festivo > a {
	    background-color: red !important;
	    color: white;
	}
	
	#divForm{
/* 		display: inline-flex; */
	}
	.horario{
		 margin-top: 10% !important;
		 margin-bottom: 4% !important;
		 color: black !important;
	}
	
	div.horario>span>input{
		width: 65px !important; 
		text-align: center !important; 
		color: black !important;		
	}

</style>

<!-- Defining the resourceURL -->
<portlet:resourceURL var="sendData" id="sendData" />
<portlet:resourceURL var="sendDiaLibre" id="sendDiaLibre" />

<h3>Configuración de la Agenda</h3>
<div class="container">
	<div class="divCalendar" style="height: 100%;">
		<h4>Días Festivos o sin Cita</h4>
		<div class="containerCalendar">		
		   <!-- Responsive calendar - START -->
		    	<div class="responsive-calendar">
		        <div class="controls">
	            <a class="pull-left" data-go="prev"><div class="btn btn-primary"><<</div></a>
	            <h4><span data-head-month></span>  <span data-head-year></span></h4>
	            <a class="pull-right" data-go="next"><div class="btn btn-primary">>></div></a>
	        </div><hr/>
	        <div class="day-headers">
	          <div class="day header">Lun</div>
	          <div class="day header">Mar</div>
	          <div class="day header">Mie</div>
	          <div class="day header">Jue</div>
	          <div class="day header">Vie</div>
	          <div class="day header">Sab</div>
	          <div class="day header">Dom</div>
	        </div>
	        <div class="days" data-group="days">	          
	        </div>
	      </div>
		  <!-- Responsive calendar - END -->
		</div> 
	</div>
	<div class="formulario">
		<h4>Horario de trabajo</h4>
		<portlet:actionURL var="horarioURL" windowState="normal" name="horarioCita">
		</portlet:actionURL>
		
		<aui:form action="<%=horarioURL%>" id="horarioForm" name="horarioForm"  method="POST">			
			<div id="divForm">
				<div class="horario">
					<label style="background-color: lightblue; color: black; padding: 2%;">Horario de mañana</label>
					<liferay-ui:input-time name="horaInicio" amPmParam="endAmPm" hourParam="endHour" minuteParam="endMinute" minuteInterval="30"
		                        hourValue="<%=Integer.parseInt(horaInicio[0]) %>"
		                        minuteValue="<%=Integer.parseInt(horaInicio[1]) %>">Hora Inicio</liferay-ui:input-time>
		            <liferay-ui:input-time name="horaFin" amPmParam="endAmPm" hourParam="endHour" minuteParam="endMinute" minuteInterval="30"
		                        hourValue="<%=Integer.parseInt(horaFin[0]) %>"
		                        minuteValue="<%=Integer.parseInt(horaFin[1]) %>">Hora Fin</liferay-ui:input-time>
				</div>
				<div class="horario">
				<label style="background-color: lightblue; color: black; padding: 2%;">Horario de tarde</label>
					<liferay-ui:input-time name="horaInicioTarde" amPmParam="endAmPm" hourParam="endHour" minuteParam="endMinute" minuteInterval="30"
		                        hourValue="<%=Integer.parseInt(horaInicioTarde[0]) %>"
		                        minuteValue="<%=Integer.parseInt(horaInicioTarde[1]) %>">Hora Inicio</liferay-ui:input-time>
		            <liferay-ui:input-time name="horaFinTarde" amPmParam="endAmPm" hourParam="endHour" minuteParam="endMinute" minuteInterval="30"
		                        hourValue="<%=Integer.parseInt(horaFinTarde[0]) %>"
		                        minuteValue="<%=Integer.parseInt(horaFinTarde[1]) %>">Hora Fin</liferay-ui:input-time>
				</div>
				<div id="listaDias" style="margin-left: 10;">
				</div>
				<label style="background-color: lightgreen; color: black; padding: 2%;">Duración de las Citas</label>
				<select name="duracionCitas" id="duracionCitas">
				<%
					if(horario.getDuracionCitas()==0){
				%>
						<option value="0" selected>30 min</option>
						<option value="1">1 h</option>
				<%	
					}else{
				%>
						<option value="0">30 min</option>
						<option value="1" selected>1 h</option>
				<%			
					}
				%>
				</select>
			</div>
		 	<aui:button type="submit" name="guardarHorario" value="Guardar" style="display: block;"></aui:button>
		</aui:form>		
	</div>
	<div id="diasFestivos" style="margin-left: 8%; width: 25%;">
		<h4>Día Libre</h4>

		<%
			List<DiaLibre> listaDias = DiaLibreLocalServiceUtil.getDiaLibres(0, DiaLibreLocalServiceUtil.getDiaLibresCount());
			for(DiaLibre dia : listaDias){
				if(dia.getLibre()==1){
			%>
				<input type="checkbox" name="<%= dia.getDia() %>" style="margin: 2%;" onchange="javascript:sendDiaLibre(<%= dia.getIdLibre() %>)" checked><%= dia.getDia() %></input><br/>
			<%			
				}else{
			%>
				<input type="checkbox" name="<%= dia.getDia() %>" style="margin: 2%;" onchange="javascrip:sendDiaLibre(<%= dia.getIdLibre() %>)"><%= dia.getDia() %></input><br/>
			<%						
				}
			}
		%>
	
	</div>
</div>	
<script type="text/javascript">

	function sendDataToServer(diaFestivo, mesFestivo, anioFestivo){	
		AUI().use(
			'aui-io-request', 
			function(A) {
				A.io.request(
					'<%=sendData%>',
					{
						method : 'post',
						// Sending three parameters.
						data : {
							diaFestivo : diaFestivo,
							mesFestivo : mesFestivo,
							anioFestivo: anioFestivo
						}
					}
				);
			}
		);
	}

	function sendDiaLibre(idDia){
		  AUI().use(
					'aui-io-request', 
					function(A) {							
						A.io.request(
							'<%=sendDiaLibre%>',
							{
								method : 'post',
								// Sending three parameters.
								data : {
									idDia : idDia
								}
							}
						);
					}
				); 
	}
	
	$(document).ready(function () {	  	
	  $(".responsive-calendar").responsiveCalendar({
	    time: '<%= yearT %>-<%= monthT %>',
	    events: {
	  	"<%=fechaHoy%>" : {"url": "#"}
	      <%= linea %>
	     },
	     onDayClick: function() {
				//Rellenamos los campos del formulario y enviamos para mostrar la agenda segun el dia selecionado en el calendario	
				sendDataToServer( $(this).data('day'), $(this).data('month'), $(this).data('year'));
				setTimeout(function(){location.reload();},300);			
	  	},
	  });
	});  
  </script>  