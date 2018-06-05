package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.citas.model.HorarioTrabajo;
import com.proyecto.citas.service.HorarioTrabajoLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class HorarioTrabajoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public HorarioTrabajoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(HorarioTrabajoLocalServiceUtil.getService());
        setClass(HorarioTrabajo.class);

        setClassLoader(com.proyecto.citas.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idHorario");
    }
}
