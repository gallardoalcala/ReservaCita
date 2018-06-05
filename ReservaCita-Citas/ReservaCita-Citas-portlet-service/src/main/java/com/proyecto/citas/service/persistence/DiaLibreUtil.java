package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.proyecto.citas.model.DiaLibre;

import java.util.List;

/**
 * The persistence utility for the dia libre service. This utility wraps {@link DiaLibrePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaLibrePersistence
 * @see DiaLibrePersistenceImpl
 * @generated
 */
public class DiaLibreUtil {
    private static DiaLibrePersistence _persistence;

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
    public static void clearCache(DiaLibre diaLibre) {
        getPersistence().clearCache(diaLibre);
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
    public static List<DiaLibre> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DiaLibre> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DiaLibre> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DiaLibre update(DiaLibre diaLibre) throws SystemException {
        return getPersistence().update(diaLibre);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DiaLibre update(DiaLibre diaLibre,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(diaLibre, serviceContext);
    }

    /**
    * Caches the dia libre in the entity cache if it is enabled.
    *
    * @param diaLibre the dia libre
    */
    public static void cacheResult(com.proyecto.citas.model.DiaLibre diaLibre) {
        getPersistence().cacheResult(diaLibre);
    }

    /**
    * Caches the dia libres in the entity cache if it is enabled.
    *
    * @param diaLibres the dia libres
    */
    public static void cacheResult(
        java.util.List<com.proyecto.citas.model.DiaLibre> diaLibres) {
        getPersistence().cacheResult(diaLibres);
    }

    /**
    * Creates a new dia libre with the primary key. Does not add the dia libre to the database.
    *
    * @param idLibre the primary key for the new dia libre
    * @return the new dia libre
    */
    public static com.proyecto.citas.model.DiaLibre create(int idLibre) {
        return getPersistence().create(idLibre);
    }

    /**
    * Removes the dia libre with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idLibre the primary key of the dia libre
    * @return the dia libre that was removed
    * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiaLibre remove(int idLibre)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiaLibreException {
        return getPersistence().remove(idLibre);
    }

    public static com.proyecto.citas.model.DiaLibre updateImpl(
        com.proyecto.citas.model.DiaLibre diaLibre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(diaLibre);
    }

    /**
    * Returns the dia libre with the primary key or throws a {@link com.proyecto.citas.NoSuchDiaLibreException} if it could not be found.
    *
    * @param idLibre the primary key of the dia libre
    * @return the dia libre
    * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiaLibre findByPrimaryKey(
        int idLibre)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiaLibreException {
        return getPersistence().findByPrimaryKey(idLibre);
    }

    /**
    * Returns the dia libre with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idLibre the primary key of the dia libre
    * @return the dia libre, or <code>null</code> if a dia libre with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiaLibre fetchByPrimaryKey(
        int idLibre) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idLibre);
    }

    /**
    * Returns all the dia libres.
    *
    * @return the dia libres
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiaLibre> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the dia libres.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiaLibreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dia libres
    * @param end the upper bound of the range of dia libres (not inclusive)
    * @return the range of dia libres
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiaLibre> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the dia libres.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiaLibreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dia libres
    * @param end the upper bound of the range of dia libres (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of dia libres
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiaLibre> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the dia libres from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of dia libres.
    *
    * @return the number of dia libres
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DiaLibrePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DiaLibrePersistence) PortletBeanLocatorUtil.locate(com.proyecto.citas.service.ClpSerializer.getServletContextName(),
                    DiaLibrePersistence.class.getName());

            ReferenceRegistry.registerReference(DiaLibreUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DiaLibrePersistence persistence) {
    }
}
