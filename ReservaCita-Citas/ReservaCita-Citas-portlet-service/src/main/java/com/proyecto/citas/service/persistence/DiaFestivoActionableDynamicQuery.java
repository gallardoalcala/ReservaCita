package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.citas.model.DiaFestivo;
import com.proyecto.citas.service.DiaFestivoLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DiaFestivoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DiaFestivoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DiaFestivoLocalServiceUtil.getService());
        setClass(DiaFestivo.class);

        setClassLoader(com.proyecto.citas.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idFestivo");
    }
}
