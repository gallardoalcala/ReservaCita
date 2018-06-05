package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.proyecto.citas.model.DiasLibres;

import java.util.List;

/**
 * The persistence utility for the dias libres service. This utility wraps {@link DiasLibresPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasLibresPersistence
 * @see DiasLibresPersistenceImpl
 * @generated
 */
public class DiasLibresUtil {
    private static DiasLibresPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(DiasLibres diasLibres) {
        getPersistence().clearCache(diasLibres);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<DiasLibres> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DiasLibres> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DiasLibres> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DiasLibres update(DiasLibres diasLibres)
        throws SystemException {
        return getPersistence().update(diasLibres);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DiasLibres update(DiasLibres diasLibres,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(diasLibres, serviceContext);
    }

    /**
    * Caches the dias libres in the entity cache if it is enabled.
    *
    * @param diasLibres the dias libres
    */
    public static void cacheResult(
        com.proyecto.citas.model.DiasLibres diasLibres) {
        getPersistence().cacheResult(diasLibres);
    }

    /**
    * Caches the dias libreses in the entity cache if it is enabled.
    *
    * @param diasLibreses the dias libreses
    */
    public static void cacheResult(
        java.util.List<com.proyecto.citas.model.DiasLibres> diasLibreses) {
        getPersistence().cacheResult(diasLibreses);
    }

    /**
    * Creates a new dias libres with the primary key. Does not add the dias libres to the database.
    *
    * @param dia the primary key for the new dias libres
    * @return the new dias libres
    */
    public static com.proyecto.citas.model.DiasLibres create(
        java.lang.String dia) {
        return getPersistence().create(dia);
    }

    /**
    * Removes the dias libres with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param dia the primary key of the dias libres
    * @return the dias libres that was removed
    * @throws com.proyecto.citas.NoSuchDiasLibresException if a dias libres with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiasLibres remove(
        java.lang.String dia)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiasLibresException {
        return getPersistence().remove(dia);
    }

    public static com.proyecto.citas.model.DiasLibres updateImpl(
        com.proyecto.citas.model.DiasLibres diasLibres)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(diasLibres);
    }

    /**
    * Returns the dias libres with the primary key or throws a {@link com.proyecto.citas.NoSuchDiasLibresException} if it could not be found.
    *
    * @param dia the primary key of the dias libres
    * @return the dias libres
    * @throws com.proyecto.citas.NoSuchDiasLibresException if a dias libres with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiasLibres findByPrimaryKey(
        java.lang.String dia)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiasLibresException {
        return getPersistence().findByPrimaryKey(dia);
    }

    /**
    * Returns the dias libres with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param dia the primary key of the dias libres
    * @return the dias libres, or <code>null</code> if a dias libres with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiasLibres fetchByPrimaryKey(
        java.lang.String dia)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(dia);
    }

    /**
    * Returns all the dias libreses.
    *
    * @return the dias libreses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiasLibres> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.proyecto.citas.model.DiasLibres> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the dias libreses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasLibresModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dias libreses
    * @param end the upper bound of the range of dias libreses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of dias libreses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiasLibres> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the dias libreses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of dias libreses.
    *
    * @return the number of dias libreses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DiasLibresPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DiasLibresPersistence) PortletBeanLocatorUtil.locate(com.proyecto.citas.service.ClpSerializer.getServletContextName(),
                    DiasLibresPersistence.class.getName());

            ReferenceRegistry.registerReference(DiasLibresUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DiasLibresPersistence persistence) {
    }
}
