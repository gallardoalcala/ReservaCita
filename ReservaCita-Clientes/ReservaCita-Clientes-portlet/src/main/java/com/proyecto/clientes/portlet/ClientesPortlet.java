package com.proyecto.clientes.portlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.proyecto.clientes.model.Cliente;
import com.proyecto.clientes.service.ClienteLocalServiceUtil;

public class ClientesPortlet extends MVCPortlet {

	private Log s_log = LogFactoryUtil.getLog(ClientesPortlet.class);
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException{		
		super.render(renderRequest, renderResponse);
	}

	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		if(resourceRequest.getResourceID().equals("activarCliente")){
			try {
				String idCliente = ParamUtil.getString(resourceRequest, "idCliente");
				
				Cliente updC = ClienteLocalServiceUtil.updateCliente(ClienteLocalServiceUtil.getCliente(Long.parseLong(idCliente)));
				updC.setActivado(1);
				updC.persist();
						
			} catch (Exception e) {
				s_log.error("Exception Error "+e);
				SessionMessages.add(resourceRequest, "error");
			}
		}else if(resourceRequest.getResourceID().equals("denegarCliente")){
			try {
				String idCliente = ParamUtil.getString(resourceRequest, "idCliente");
				
				Cliente updC = ClienteLocalServiceUtil.updateCliente(ClienteLocalServiceUtil.getCliente(Long.parseLong(idCliente)));
				updC.setDenegado(1);
				updC.persist();
						
			} catch (Exception e) {
				s_log.error("Exception Error "+e);
				SessionMessages.add(resourceRequest, "error");
			}
		}else{
			s_log.error("ERROR -> NOT RESOURCE ID");
			SessionMessages.add(resourceRequest, "error");
		}
		SessionMessages.add(resourceRequest, "success");
		super.serveResource(resourceRequest, resourceResponse);
	}
	
}
