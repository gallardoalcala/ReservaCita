package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.citas.model.DiaLibre;
import com.proyecto.citas.service.DiaLibreLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DiaLibreActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DiaLibreActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DiaLibreLocalServiceUtil.getService());
        setClass(DiaLibre.class);

        setClassLoader(com.proyecto.citas.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idLibre");
    }
}
