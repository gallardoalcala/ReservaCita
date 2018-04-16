package com.proyecto.clientes.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.clientes.model.Cita;
import com.proyecto.clientes.service.CitaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CitaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CitaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CitaLocalServiceUtil.getService());
        setClass(Cita.class);

        setClassLoader(com.proyecto.clientes.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idCita");
    }
}
