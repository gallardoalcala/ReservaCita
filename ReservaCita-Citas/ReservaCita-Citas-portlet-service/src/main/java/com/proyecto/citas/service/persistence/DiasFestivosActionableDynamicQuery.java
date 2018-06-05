package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.citas.model.DiasFestivos;
import com.proyecto.citas.service.DiasFestivosLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DiasFestivosActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DiasFestivosActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DiasFestivosLocalServiceUtil.getService());
        setClass(DiasFestivos.class);

        setClassLoader(com.proyecto.citas.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idFestivo");
    }
}
