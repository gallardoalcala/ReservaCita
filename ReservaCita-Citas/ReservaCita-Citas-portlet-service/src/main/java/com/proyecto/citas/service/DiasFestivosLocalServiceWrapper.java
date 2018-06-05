package com.proyecto.citas.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DiasFestivosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivosLocalService
 * @generated
 */
public class DiasFestivosLocalServiceWrapper implements DiasFestivosLocalService,
    ServiceWrapper<DiasFestivosLocalService> {
    private DiasFestivosLocalService _diasFestivosLocalService;

    public DiasFestivosLocalServiceWrapper(
        DiasFestivosLocalService diasFestivosLocalService) {
        _diasFestivosLocalService = diasFestivosLocalService;
    }

    /**
    * Adds the dias festivos to the database. Also notifies the appropriate model listeners.
    *
    * @param diasFestivos the dias festivos
    * @return the dias festivos that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasFestivos addDiasFestivos(
        com.proyecto.citas.model.DiasFestivos diasFestivos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.addDiasFestivos(diasFestivos);
    }

    /**
    * Creates a new dias festivos with the primary key. Does not add the dias festivos to the database.
    *
    * @param idFestivo the primary key for the new dias festivos
    * @return the new dias festivos
    */
    @Override
    public com.proyecto.citas.model.DiasFestivos createDiasFestivos(
        int idFestivo) {
        return _diasFestivosLocalService.createDiasFestivos(idFestivo);
    }

    /**
    * Deletes the dias festivos with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos that was removed
    * @throws PortalException if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasFestivos deleteDiasFestivos(
        int idFestivo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.deleteDiasFestivos(idFestivo);
    }

    /**
    * Deletes the dias festivos from the database. Also notifies the appropriate model listeners.
    *
    * @param diasFestivos the dias festivos
    * @return the dias festivos that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasFestivos deleteDiasFestivos(
        com.proyecto.citas.model.DiasFestivos diasFestivos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.deleteDiasFestivos(diasFestivos);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _diasFestivosLocalService.dynamicQuery();
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
        return _diasFestivosLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasFestivosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _diasFestivosLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasFestivosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _diasFestivosLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _diasFestivosLocalService.dynamicQueryCount(dynamicQuery);
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
        return _diasFestivosLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.proyecto.citas.model.DiasFestivos fetchDiasFestivos(
        int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.fetchDiasFestivos(idFestivo);
    }

    /**
    * Returns the dias festivos with the primary key.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos
    * @throws PortalException if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasFestivos getDiasFestivos(int idFestivo)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.getDiasFestivos(idFestivo);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the dias festivoses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasFestivosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dias festivoses
    * @param end the upper bound of the range of dias festivoses (not inclusive)
    * @return the range of dias festivoses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.proyecto.citas.model.DiasFestivos> getDiasFestivoses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.getDiasFestivoses(start, end);
    }

    /**
    * Returns the number of dias festivoses.
    *
    * @return the number of dias festivoses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDiasFestivosesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.getDiasFestivosesCount();
    }

    /**
    * Updates the dias festivos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param diasFestivos the dias festivos
    * @return the dias festivos that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasFestivos updateDiasFestivos(
        com.proyecto.citas.model.DiasFestivos diasFestivos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasFestivosLocalService.updateDiasFestivos(diasFestivos);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _diasFestivosLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _diasFestivosLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _diasFestivosLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DiasFestivosLocalService getWrappedDiasFestivosLocalService() {
        return _diasFestivosLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDiasFestivosLocalService(
        DiasFestivosLocalService diasFestivosLocalService) {
        _diasFestivosLocalService = diasFestivosLocalService;
    }

    @Override
    public DiasFestivosLocalService getWrappedService() {
        return _diasFestivosLocalService;
    }

    @Override
    public void setWrappedService(
        DiasFestivosLocalService diasFestivosLocalService) {
        _diasFestivosLocalService = diasFestivosLocalService;
    }
}
