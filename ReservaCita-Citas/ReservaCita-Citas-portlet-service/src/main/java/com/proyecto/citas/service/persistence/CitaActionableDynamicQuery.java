package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.citas.model.Cita;
import com.proyecto.citas.service.CitaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CitaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CitaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CitaLocalServiceUtil.getService());
        setClass(Cita.class);

        setClassLoader(com.proyecto.citas.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idCita");
    }
}
