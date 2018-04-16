package com.proyecto.citas.portlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.proyecto.citas.model.Cita;
import com.proyecto.citas.service.CitaLocalServiceUtil;

public class CitasPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(CitasPortlet.class);

	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException{		
		super.render(renderRequest, renderResponse);
	}

	//Método para visualizar un dia en la agenda
	public void verDiaAgenda(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{	
		String daySelect = request.getParameter("daySelect");					
		String mesSelect = request.getParameter("mesSelect");	
		String anioSelect = request.getParameter("anioSelect");	
        response.setRenderParameter("jspPage","/html/agenda.jsp");
        response.setRenderParameter("daySelect", daySelect);
        response.setRenderParameter("mesSelect", mesSelect);
        response.setRenderParameter("anioSelect", anioSelect);
        
        SessionMessages.add(request, "warning");
			
	}
	
	public void nuevaCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String idCliente = request.getParameter("idCliente");
		String descripcion = request.getParameter("descripcion");
		
		hora = hora+":00:00";
		String fechaString = fecha + " " + hora;
		Date fechaFinal = null;
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		fechaFinal = sd.parse(fechaString);
		
		System.out.println(fechaFinal);
		System.out.println(idCliente);
		System.out.println(descripcion);
		
		Cita nuevaCita = CitaLocalServiceUtil.createCita(CitaLocalServiceUtil.getCitasCount()+1);
		nuevaCita.setIdCliente(Integer.parseInt(idCliente));
		nuevaCita.setFechaCita(fechaFinal);
		nuevaCita.setDescripcion(descripcion);
		nuevaCita.persist();
		SessionMessages.add(request, "success");
	}
	
	
}
