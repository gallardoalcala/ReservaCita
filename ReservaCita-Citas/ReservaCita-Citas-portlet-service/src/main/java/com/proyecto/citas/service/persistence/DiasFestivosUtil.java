package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.proyecto.citas.model.DiasFestivos;

import java.util.List;

/**
 * The persistence utility for the dias festivos service. This utility wraps {@link DiasFestivosPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivosPersistence
 * @see DiasFestivosPersistenceImpl
 * @generated
 */
public class DiasFestivosUtil {
    private static DiasFestivosPersistence _persistence;

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
    public static void clearCache(DiasFestivos diasFestivos) {
        getPersistence().clearCache(diasFestivos);
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
    public static List<DiasFestivos> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DiasFestivos> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DiasFestivos> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DiasFestivos update(DiasFestivos diasFestivos)
        throws SystemException {
        return getPersistence().update(diasFestivos);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DiasFestivos update(DiasFestivos diasFestivos,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(diasFestivos, serviceContext);
    }

    /**
    * Caches the dias festivos in the entity cache if it is enabled.
    *
    * @param diasFestivos the dias festivos
    */
    public static void cacheResult(
        com.proyecto.citas.model.DiasFestivos diasFestivos) {
        getPersistence().cacheResult(diasFestivos);
    }

    /**
    * Caches the dias festivoses in the entity cache if it is enabled.
    *
    * @param diasFestivoses the dias festivoses
    */
    public static void cacheResult(
        java.util.List<com.proyecto.citas.model.DiasFestivos> diasFestivoses) {
        getPersistence().cacheResult(diasFestivoses);
    }

    /**
    * Creates a new dias festivos with the primary key. Does not add the dias festivos to the database.
    *
    * @param idFestivo the primary key for the new dias festivos
    * @return the new dias festivos
    */
    public static com.proyecto.citas.model.DiasFestivos create(int idFestivo) {
        return getPersistence().create(idFestivo);
    }

    /**
    * Removes the dias festivos with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos that was removed
    * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiasFestivos remove(int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiasFestivosException {
        return getPersistence().remove(idFestivo);
    }

    public static com.proyecto.citas.model.DiasFestivos updateImpl(
        com.proyecto.citas.model.DiasFestivos diasFestivos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(diasFestivos);
    }

    /**
    * Returns the dias festivos with the primary key or throws a {@link com.proyecto.citas.NoSuchDiasFestivosException} if it could not be found.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos
    * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiasFestivos findByPrimaryKey(
        int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiasFestivosException {
        return getPersistence().findByPrimaryKey(idFestivo);
    }

    /**
    * Returns the dias festivos with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos, or <code>null</code> if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.citas.model.DiasFestivos fetchByPrimaryKey(
        int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idFestivo);
    }

    /**
    * Returns all the dias festivoses.
    *
    * @return the dias festivoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiasFestivos> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.proyecto.citas.model.DiasFestivos> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the dias festivoses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasFestivosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dias festivoses
    * @param end the upper bound of the range of dias festivoses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of dias festivoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.citas.model.DiasFestivos> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the dias festivoses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of dias festivoses.
    *
    * @return the number of dias festivoses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DiasFestivosPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DiasFestivosPersistence) PortletBeanLocatorUtil.locate(com.proyecto.citas.service.ClpSerializer.getServletContextName(),
                    DiasFestivosPersistence.class.getName());

            ReferenceRegistry.registerReference(DiasFestivosUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DiasFestivosPersistence persistence) {
    }
}
