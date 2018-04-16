package com.proyecto.clientes.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.proyecto.clientes.model.Cita;
import com.proyecto.clientes.service.base.CitaLocalServiceBaseImpl;

/**
 * The implementation of the cita local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.proyecto.clientes.service.CitaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.proyecto.clientes.service.base.CitaLocalServiceBaseImpl
 * @see com.proyecto.clientes.service.CitaLocalServiceUtil
 */
public class CitaLocalServiceImpl extends CitaLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.proyecto.clientes.service.CitaLocalServiceUtil} to access the cita local service.
     */
	public List<Cita> findByIdCliente(int idCliente) throws SystemException{  
		  
		  return this.citaPersistence.findByidCliente(idCliente);
		 }
}
