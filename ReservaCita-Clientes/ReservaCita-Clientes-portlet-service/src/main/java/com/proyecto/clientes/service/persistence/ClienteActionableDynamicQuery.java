package com.proyecto.clientes.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.clientes.model.Cliente;
import com.proyecto.clientes.service.ClienteLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ClienteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ClienteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ClienteLocalServiceUtil.getService());
        setClass(Cliente.class);

        setClassLoader(com.proyecto.clientes.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idCliente");
    }
}
