package com.proyecto.citas.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorarioTrabajoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HorarioTrabajoLocalService
 * @generated
 */
public class HorarioTrabajoLocalServiceWrapper
    implements HorarioTrabajoLocalService,
        ServiceWrapper<HorarioTrabajoLocalService> {
    private HorarioTrabajoLocalService _horarioTrabajoLocalService;

    public HorarioTrabajoLocalServiceWrapper(
        HorarioTrabajoLocalService horarioTrabajoLocalService) {
        _horarioTrabajoLocalService = horarioTrabajoLocalService;
    }

    /**
    * Adds the horario trabajo to the database. Also notifies the appropriate model listeners.
    *
    * @param horarioTrabajo the horario trabajo
    * @return the horario trabajo that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.HorarioTrabajo addHorarioTrabajo(
        com.proyecto.citas.model.HorarioTrabajo horarioTrabajo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.addHorarioTrabajo(horarioTrabajo);
    }

    /**
    * Creates a new horario trabajo with the primary key. Does not add the horario trabajo to the database.
    *
    * @param idHorario the primary key for the new horario trabajo
    * @return the new horario trabajo
    */
    @Override
    public com.proyecto.citas.model.HorarioTrabajo createHorarioTrabajo(
        int idHorario) {
        return _horarioTrabajoLocalService.createHorarioTrabajo(idHorario);
    }

    /**
    * Deletes the horario trabajo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idHorario the primary key of the horario trabajo
    * @return the horario trabajo that was removed
    * @throws PortalException if a horario trabajo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.HorarioTrabajo deleteHorarioTrabajo(
        int idHorario)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.deleteHorarioTrabajo(idHorario);
    }

    /**
    * Deletes the horario trabajo from the database. Also notifies the appropriate model listeners.
    *
    * @param horarioTrabajo the horario trabajo
    * @return the horario trabajo that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.HorarioTrabajo deleteHorarioTrabajo(
        com.proyecto.citas.model.HorarioTrabajo horarioTrabajo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.deleteHorarioTrabajo(horarioTrabajo);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _horarioTrabajoLocalService.dynamicQuery();
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
        return _horarioTrabajoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.HorarioTrabajoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _horarioTrabajoLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.HorarioTrabajoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _horarioTrabajoLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _horarioTrabajoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _horarioTrabajoLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.proyecto.citas.model.HorarioTrabajo fetchHorarioTrabajo(
        int idHorario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.fetchHorarioTrabajo(idHorario);
    }

    /**
    * Returns the horario trabajo with the primary key.
    *
    * @param idHorario the primary key of the horario trabajo
    * @return the horario trabajo
    * @throws PortalException if a horario trabajo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.HorarioTrabajo getHorarioTrabajo(
        int idHorario)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.getHorarioTrabajo(idHorario);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the horario trabajos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.HorarioTrabajoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of horario trabajos
    * @param end the upper bound of the range of horario trabajos (not inclusive)
    * @return the range of horario trabajos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.proyecto.citas.model.HorarioTrabajo> getHorarioTrabajos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.getHorarioTrabajos(start, end);
    }

    /**
    * Returns the number of horario trabajos.
    *
    * @return the number of horario trabajos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHorarioTrabajosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.getHorarioTrabajosCount();
    }

    /**
    * Updates the horario trabajo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param horarioTrabajo the horario trabajo
    * @return the horario trabajo that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.HorarioTrabajo updateHorarioTrabajo(
        com.proyecto.citas.model.HorarioTrabajo horarioTrabajo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _horarioTrabajoLocalService.updateHorarioTrabajo(horarioTrabajo);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _horarioTrabajoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _horarioTrabajoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _horarioTrabajoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HorarioTrabajoLocalService getWrappedHorarioTrabajoLocalService() {
        return _horarioTrabajoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHorarioTrabajoLocalService(
        HorarioTrabajoLocalService horarioTrabajoLocalService) {
        _horarioTrabajoLocalService = horarioTrabajoLocalService;
    }

    @Override
    public HorarioTrabajoLocalService getWrappedService() {
        return _horarioTrabajoLocalService;
    }

    @Override
    public void setWrappedService(
        HorarioTrabajoLocalService horarioTrabajoLocalService) {
        _horarioTrabajoLocalService = horarioTrabajoLocalService;
    }
}
