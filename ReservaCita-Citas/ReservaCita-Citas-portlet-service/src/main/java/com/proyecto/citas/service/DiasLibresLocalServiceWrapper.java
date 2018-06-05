package com.proyecto.citas.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DiasLibresLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DiasLibresLocalService
 * @generated
 */
public class DiasLibresLocalServiceWrapper implements DiasLibresLocalService,
    ServiceWrapper<DiasLibresLocalService> {
    private DiasLibresLocalService _diasLibresLocalService;

    public DiasLibresLocalServiceWrapper(
        DiasLibresLocalService diasLibresLocalService) {
        _diasLibresLocalService = diasLibresLocalService;
    }

    /**
    * Adds the dias libres to the database. Also notifies the appropriate model listeners.
    *
    * @param diasLibres the dias libres
    * @return the dias libres that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasLibres addDiasLibres(
        com.proyecto.citas.model.DiasLibres diasLibres)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.addDiasLibres(diasLibres);
    }

    /**
    * Creates a new dias libres with the primary key. Does not add the dias libres to the database.
    *
    * @param dia the primary key for the new dias libres
    * @return the new dias libres
    */
    @Override
    public com.proyecto.citas.model.DiasLibres createDiasLibres(
        java.lang.String dia) {
        return _diasLibresLocalService.createDiasLibres(dia);
    }

    /**
    * Deletes the dias libres with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param dia the primary key of the dias libres
    * @return the dias libres that was removed
    * @throws PortalException if a dias libres with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasLibres deleteDiasLibres(
        java.lang.String dia)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.deleteDiasLibres(dia);
    }

    /**
    * Deletes the dias libres from the database. Also notifies the appropriate model listeners.
    *
    * @param diasLibres the dias libres
    * @return the dias libres that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasLibres deleteDiasLibres(
        com.proyecto.citas.model.DiasLibres diasLibres)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.deleteDiasLibres(diasLibres);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _diasLibresLocalService.dynamicQuery();
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
        return _diasLibresLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasLibresModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _diasLibresLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasLibresModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _diasLibresLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _diasLibresLocalService.dynamicQueryCount(dynamicQuery);
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
        return _diasLibresLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.proyecto.citas.model.DiasLibres fetchDiasLibres(
        java.lang.String dia)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.fetchDiasLibres(dia);
    }

    /**
    * Returns the dias libres with the primary key.
    *
    * @param dia the primary key of the dias libres
    * @return the dias libres
    * @throws PortalException if a dias libres with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasLibres getDiasLibres(
        java.lang.String dia)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.getDiasLibres(dia);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the dias libreses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasLibresModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dias libreses
    * @param end the upper bound of the range of dias libreses (not inclusive)
    * @return the range of dias libreses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.proyecto.citas.model.DiasLibres> getDiasLibreses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.getDiasLibreses(start, end);
    }

    /**
    * Returns the number of dias libreses.
    *
    * @return the number of dias libreses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDiasLibresesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.getDiasLibresesCount();
    }

    /**
    * Updates the dias libres in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param diasLibres the dias libres
    * @return the dias libres that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.proyecto.citas.model.DiasLibres updateDiasLibres(
        com.proyecto.citas.model.DiasLibres diasLibres)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _diasLibresLocalService.updateDiasLibres(diasLibres);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _diasLibresLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _diasLibresLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _diasLibresLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DiasLibresLocalService getWrappedDiasLibresLocalService() {
        return _diasLibresLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDiasLibresLocalService(
        DiasLibresLocalService diasLibresLocalService) {
        _diasLibresLocalService = diasLibresLocalService;
    }

    @Override
    public DiasLibresLocalService getWrappedService() {
        return _diasLibresLocalService;
    }

    @Override
    public void setWrappedService(DiasLibresLocalService diasLibresLocalService) {
        _diasLibresLocalService = diasLibresLocalService;
    }
}
