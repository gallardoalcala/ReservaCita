package com.proyecto.clientes.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ClienteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClienteLocalService
 * @generated
 */
public class ClienteLocalServiceWrapper implements ClienteLocalService,
    ServiceWrapper<ClienteLocalService> {
    private ClienteLocalService _clienteLocalService;

    public ClienteLocalServiceWrapper(ClienteLocalService clienteLocalService) {
        _clienteLocalService = clienteLocalService;
    }

    /**
    * Adds the cliente to the database. Also notifies the appropriate model listeners.
    *
    * @param cliente the cliente
    * @return the cliente that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cliente addCliente(
        com.proyecto.clientes.model.Cliente cliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.addCliente(cliente);
    }

    /**
    * Creates a new cliente with the primary key. Does not add the cliente to the database.
    *
    * @param idCliente the primary key for the new cliente
    * @return the new cliente
    */
    @Override
    public com.proyecto.clientes.model.Cliente createCliente(long idCliente) {
        return _clienteLocalService.createCliente(idCliente);
    }

    /**
    * Deletes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idCliente the primary key of the cliente
    * @return the cliente that was removed
    * @throws PortalException if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cliente deleteCliente(long idCliente)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.deleteCliente(idCliente);
    }

    /**
    * Deletes the cliente from the database. Also notifies the appropriate model listeners.
    *
    * @param cliente the cliente
    * @return the cliente that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cliente deleteCliente(
        com.proyecto.clientes.model.Cliente cliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.deleteCliente(cliente);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _clienteLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.proyecto.clientes.model.Cliente fetchCliente(long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.fetchCliente(idCliente);
    }

    /**
    * Returns the cliente with the primary key.
    *
    * @param idCliente the primary key of the cliente
    * @return the cliente
    * @throws PortalException if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cliente getCliente(long idCliente)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.getCliente(idCliente);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the clientes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @return the range of clientes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.proyecto.clientes.model.Cliente> getClientes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.getClientes(start, end);
    }

    /**
    * Returns the number of clientes.
    *
    * @return the number of clientes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getClientesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.getClientesCount();
    }

    /**
    * Updates the cliente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param cliente the cliente
    * @return the cliente that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cliente updateCliente(
        com.proyecto.clientes.model.Cliente cliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.updateCliente(cliente);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _clienteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _clienteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _clienteLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.proyecto.clientes.model.Cliente> findByIdCliente(
        long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.findByIdCliente(idCliente);
    }

    @Override
    public java.util.List<com.proyecto.clientes.model.Cliente> findByactivado(
        int activado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _clienteLocalService.findByactivado(activado);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ClienteLocalService getWrappedClienteLocalService() {
        return _clienteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedClienteLocalService(
        ClienteLocalService clienteLocalService) {
        _clienteLocalService = clienteLocalService;
    }

    @Override
    public ClienteLocalService getWrappedService() {
        return _clienteLocalService;
    }

    @Override
    public void setWrappedService(ClienteLocalService clienteLocalService) {
        _clienteLocalService = clienteLocalService;
    }
}
