package com.proyecto.clientes.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.proyecto.clientes.model.Cita;
import com.proyecto.clientes.model.Cliente;
import com.proyecto.clientes.service.base.ClienteLocalServiceBaseImpl;

/**
 * The implementation of the cliente local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.proyecto.clientes.service.ClienteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.proyecto.clientes.service.base.ClienteLocalServiceBaseImpl
 * @see com.proyecto.clientes.service.ClienteLocalServiceUtil
 */
public class ClienteLocalServiceImpl extends ClienteLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.proyecto.clientes.service.ClienteLocalServiceUtil} to access the cliente local service.
     */
	public List<Cliente> findByIdCliente(long idCliente) throws SystemException{  
		  
		  return this.clientePersistence.findByidCliente(idCliente);
	}
	
	public List<Cliente> findByactivado(int activado) throws SystemException{
		return this.clientePersistence.findByactivado(activado);
	}

}
