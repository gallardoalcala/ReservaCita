package com.proyecto.citas.portlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.proyecto.citas.model.Cita;
import com.proyecto.citas.model.DiaFestivo;
import com.proyecto.citas.model.DiaLibre;
import com.proyecto.citas.model.DiasFestivos;
import com.proyecto.citas.model.HorarioTrabajo;
import com.proyecto.citas.service.CitaLocalServiceUtil;
import com.proyecto.citas.service.DiaFestivoLocalServiceUtil;
import com.proyecto.citas.service.DiaLibreLocalServiceUtil;
import com.proyecto.citas.service.HorarioTrabajoLocalServiceUtil;


public class CitasPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(CitasPortlet.class);

	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException{		
		super.render(renderRequest, renderResponse);
	}

	//Método para VER un dia en la agenda en la vista propietario
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
	
	//Método para VER un dia en la agenda en la vista cliente
	public void verDiaAgendaCliente(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{	
		String daySelect = request.getParameter("daySelect");					
		String mesSelect = request.getParameter("mesSelect");	
		String anioSelect = request.getParameter("anioSelect");	
        response.setRenderParameter("jspPage","/html/view.jsp");
        response.setRenderParameter("daySelect", daySelect);
        response.setRenderParameter("mesSelect", mesSelect);
        response.setRenderParameter("anioSelect", anioSelect);
        
        SessionMessages.add(request, "warning");
			
	}
	
	//Método para RESERVAR una cita desde la vista cliente
	public void reservarCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{	
		String daySelect = request.getParameter("daySelect");					
		String mesSelect = request.getParameter("mesSelect");	
		String anioSelect = request.getParameter("anioSelect");	
		String horaCita = request.getParameter("horaCita");	
        response.setRenderParameter("jspPage","/html/view.jsp");
        response.setRenderParameter("daySelect", daySelect);
        response.setRenderParameter("mesSelect", mesSelect);
        response.setRenderParameter("anioSelect", anioSelect);
        response.setRenderParameter("horaCita", horaCita);		
	}
	
	//Método para crear una cita
	public void createCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{
		String fecha = request.getParameter("fechaCita");
		String hora = request.getParameter("horaCita");
		String idCliente = request.getParameter("userId");
		String descripcion = request.getParameter("descripcionCita");
		
		hora = hora+":00:00";
		String fechaString = fecha + " " + hora;
		Date fechaFinal = null;
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fechaFinal = sd.parse(fechaString);
		
		Cita nuevaCita = CitaLocalServiceUtil.createCita(CitaLocalServiceUtil.getCitasCount()+1);
		nuevaCita.setIdCliente(Integer.parseInt(idCliente));
		nuevaCita.setFechaCita(fechaFinal);
		nuevaCita.setDescripcion(descripcion);
		nuevaCita.persist();
		SessionMessages.add(request, "success");
	}
	
	//Metodo para borrar una cita
	public void cancelCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{
		int idCita = Integer.parseInt(request.getParameter("idCitaPendiente"));
		CitaLocalServiceUtil.deleteCita(idCita);
		response.setRenderParameter("jspPage","/html/view.jsp");
	}
	
	public void nuevaCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String idCliente = request.getParameter("idCliente");
		String descripcion = request.getParameter("descripcion");
		
		hora = hora+":00:00";
		String fechaString = fecha + " " + hora;
		Date fechaFinal = null;
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fechaFinal = sd.parse(fechaString);
		
		Cita nuevaCita = CitaLocalServiceUtil.createCita(CitaLocalServiceUtil.getCitasCount()+1);
		nuevaCita.setIdCliente(Integer.parseInt(idCliente));
		nuevaCita.setFechaCita(fechaFinal);
		if(descripcion.length()>=75){
			descripcion = descripcion.substring(0,74);
		}
		nuevaCita.setDescripcion(descripcion);
		nuevaCita.persist();
		SessionMessages.add(request, "success");
	}
	
	public void modificarCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{
		String idCita = request.getParameter("idCita");
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String idCliente = request.getParameter("idCliente");
		String descripcion = request.getParameter("descripcion");
		
		hora = hora+":00:00";
		String fechaString = fecha + " " + hora;
		Date fechaFinal = null;
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fechaFinal = sd.parse(fechaString);
		
		Cita modifCita = CitaLocalServiceUtil.updateCita(CitaLocalServiceUtil.getCita(Integer.parseInt(idCita)));
		modifCita.setIdCliente(Integer.parseInt(idCliente));
		modifCita.setFechaCita(fechaFinal);
		if(descripcion.length()>=75){
			descripcion = descripcion.substring(0,74);
		}
		modifCita.setDescripcion(descripcion);
		modifCita.persist();
		SessionMessages.add(request, "success");
	}
	
	public void deleteCita(ActionRequest request, ActionResponse response) throws NumberFormatException, SystemException, PortalException{
		String citaId = request.getParameter("citaId");		
		List<Cita> citas = CitaLocalServiceUtil.getCitas(0, CitaLocalServiceUtil.getCitasCount());
		for(Cita c : citas){
			if (c.getIdCita() == Integer.parseInt(citaId)) {
				CitaLocalServiceUtil.deleteCita(c.getPrimaryKey());
			}
		}
	}
	
	//Método para guardar un horario laboral en la configuración del propietario
	public void horarioCita(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException, SystemException, ParseException{
		String horaInicio = request.getParameter("horaInicio");
		String horaFin = request.getParameter("horaFin");
		String horaInicioTarde = request.getParameter("horaInicioTarde");
		String horaFinTarde = request.getParameter("horaFinTarde");
		int duracionCitas = Integer.parseInt(request.getParameter("duracionCitas"));
		
		HorarioTrabajo horario = HorarioTrabajoLocalServiceUtil.updateHorarioTrabajo(HorarioTrabajoLocalServiceUtil.getHorarioTrabajo(1));
		horario.setHoraInicio(horaInicio);
		horario.setHoraFin(horaFin);
		horario.setHoraInicioTarde(horaInicioTarde);
		horario.setHoraFinTarde(horaFinTarde);
		horario.setDuracionCitas(duracionCitas);
		horario.persist();
	}
	
	//Método que usa la metodología ajax para el envio de datos a la bd, para los dias libres o festivos
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		if(resourceRequest.getResourceID().equals("sendData")){
			try {
				//Recogemos las variables por parametros 
				String diaFestivo = ParamUtil.getString(resourceRequest, "diaFestivo");
				String mesFestivo = ParamUtil.getString(resourceRequest, "mesFestivo");
				String anioFestivo = ParamUtil.getString(resourceRequest, "anioFestivo");
				ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
				User user = themeDisplay.getUser();
				SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");				
				Date fechaFestivo = formatDate.parse(diaFestivo+"/"+mesFestivo+"/"+anioFestivo);
				
				//Reocorremos la tabla de dias festivos para comprobar si se encuentra la fecha seleccionada
				List<DiaFestivo> listaFestivos = DiaFestivoLocalServiceUtil.getDiaFestivos(0, DiaFestivoLocalServiceUtil.getDiaFestivosCount());
				int idFestivo = 0;
				for(DiaFestivo festivo : listaFestivos){
					if(festivo.getFechaFestivo().compareTo(fechaFestivo) == 0){
						idFestivo = festivo.getIdFestivo();
					}
				}
				
				if(idFestivo!=0){	
					DiaFestivoLocalServiceUtil.deleteDiaFestivo(idFestivo);					
				}else{
					DiaFestivo festivo = DiaFestivoLocalServiceUtil.createDiaFestivo(DiaFestivoLocalServiceUtil.getDiaFestivosCount()+1);
					festivo.setFechaFestivo(fechaFestivo);
					festivo.persist();
				}
				
			} catch (Exception e) {
				System.out.println("Exception Error " + e);
			}			
		}else if(resourceRequest.getResourceID().equals("sendDiaLibre")){
			try {
				//Recogemos las variables por parametros 
				String idDia = ParamUtil.getString(resourceRequest, "idDia");
				DiaLibre diaLibre = DiaLibreLocalServiceUtil.getDiaLibre(Integer.parseInt(idDia));
				
				if(diaLibre.getLibre()==1){
					diaLibre.setLibre(0);
				}else{
					diaLibre.setLibre(1);
				}
				diaLibre.persist();
				
			} catch (Exception e) {
				System.out.println("Exception Error " + e);
			}			
		}
	}
	
}
