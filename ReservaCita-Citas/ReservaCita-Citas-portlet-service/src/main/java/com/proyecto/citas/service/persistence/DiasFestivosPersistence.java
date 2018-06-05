package com.proyecto.citas.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.proyecto.citas.model.DiasFestivos;

/**
 * The persistence interface for the dias festivos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivosPersistenceImpl
 * @see DiasFestivosUtil
 * @generated
 */
public interface DiasFestivosPersistence extends BasePersistence<DiasFestivos> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DiasFestivosUtil} to access the dias festivos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the dias festivos in the entity cache if it is enabled.
    *
    * @param diasFestivos the dias festivos
    */
    public void cacheResult(com.proyecto.citas.model.DiasFestivos diasFestivos);

    /**
    * Caches the dias festivoses in the entity cache if it is enabled.
    *
    * @param diasFestivoses the dias festivoses
    */
    public void cacheResult(
        java.util.List<com.proyecto.citas.model.DiasFestivos> diasFestivoses);

    /**
    * Creates a new dias festivos with the primary key. Does not add the dias festivos to the database.
    *
    * @param idFestivo the primary key for the new dias festivos
    * @return the new dias festivos
    */
    public com.proyecto.citas.model.DiasFestivos create(int idFestivo);

    /**
    * Removes the dias festivos with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos that was removed
    * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiasFestivos remove(int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiasFestivosException;

    public com.proyecto.citas.model.DiasFestivos updateImpl(
        com.proyecto.citas.model.DiasFestivos diasFestivos)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the dias festivos with the primary key or throws a {@link com.proyecto.citas.NoSuchDiasFestivosException} if it could not be found.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos
    * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiasFestivos findByPrimaryKey(int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiasFestivosException;

    /**
    * Returns the dias festivos with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idFestivo the primary key of the dias festivos
    * @return the dias festivos, or <code>null</code> if a dias festivos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiasFestivos fetchByPrimaryKey(
        int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the dias festivoses.
    *
    * @return the dias festivoses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.citas.model.DiasFestivos> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.proyecto.citas.model.DiasFestivos> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.proyecto.citas.model.DiasFestivos> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the dias festivoses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of dias festivoses.
    *
    * @return the number of dias festivoses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
