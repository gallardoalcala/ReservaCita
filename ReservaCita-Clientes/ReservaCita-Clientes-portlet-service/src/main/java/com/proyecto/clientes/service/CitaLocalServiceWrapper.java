package com.proyecto.clientes.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CitaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CitaLocalService
 * @generated
 */
public class CitaLocalServiceWrapper implements CitaLocalService,
    ServiceWrapper<CitaLocalService> {
    private CitaLocalService _citaLocalService;

    public CitaLocalServiceWrapper(CitaLocalService citaLocalService) {
        _citaLocalService = citaLocalService;
    }

    /**
    * Adds the cita to the database. Also notifies the appropriate model listeners.
    *
    * @param cita the cita
    * @return the cita that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cita addCita(
        com.proyecto.clientes.model.Cita cita)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.addCita(cita);
    }

    /**
    * Creates a new cita with the primary key. Does not add the cita to the database.
    *
    * @param idCita the primary key for the new cita
    * @return the new cita
    */
    @Override
    public com.proyecto.clientes.model.Cita createCita(int idCita) {
        return _citaLocalService.createCita(idCita);
    }

    /**
    * Deletes the cita with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idCita the primary key of the cita
    * @return the cita that was removed
    * @throws PortalException if a cita with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cita deleteCita(int idCita)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.deleteCita(idCita);
    }

    /**
    * Deletes the cita from the database. Also notifies the appropriate model listeners.
    *
    * @param cita the cita
    * @return the cita that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cita deleteCita(
        com.proyecto.clientes.model.Cita cita)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.deleteCita(cita);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _citaLocalService.dynamicQuery();
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
        return _citaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.CitaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _citaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.CitaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _citaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _citaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _citaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.proyecto.clientes.model.Cita fetchCita(int idCita)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.fetchCita(idCita);
    }

    /**
    * Returns the cita with the primary key.
    *
    * @param idCita the primary key of the cita
    * @return the cita
    * @throws PortalException if a cita with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cita getCita(int idCita)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.getCita(idCita);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the citas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.CitaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of citas
    * @param end the upper bound of the range of citas (not inclusive)
    * @return the range of citas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.proyecto.clientes.model.Cita> getCitas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.getCitas(start, end);
    }

    /**
    * Returns the number of citas.
    *
    * @return the number of citas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCitasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.getCitasCount();
    }

    /**
    * Updates the cita in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param cita the cita
    * @return the cita that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.clientes.model.Cita updateCita(
        com.proyecto.clientes.model.Cita cita)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _citaLocalService.updateCita(cita);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _citaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _citaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _citaLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CitaLocalService getWrappedCitaLocalService() {
        return _citaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCitaLocalService(CitaLocalService citaLocalService) {
        _citaLocalService = citaLocalService;
    }

    @Override
    public CitaLocalService getWrappedService() {
        return _citaLocalService;
    }

    @Override
    public void setWrappedService(CitaLocalService citaLocalService) {
        _citaLocalService = citaLocalService;
    }
}
