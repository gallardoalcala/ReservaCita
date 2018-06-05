package com.proyecto.citas.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.proyecto.citas.model.DiaFestivo;

/**
 * The persistence interface for the dia festivo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaFestivoPersistenceImpl
 * @see DiaFestivoUtil
 * @generated
 */
public interface DiaFestivoPersistence extends BasePersistence<DiaFestivo> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DiaFestivoUtil} to access the dia festivo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the dia festivo in the entity cache if it is enabled.
    *
    * @param diaFestivo the dia festivo
    */
    public void cacheResult(com.proyecto.citas.model.DiaFestivo diaFestivo);

    /**
    * Caches the dia festivos in the entity cache if it is enabled.
    *
    * @param diaFestivos the dia festivos
    */
    public void cacheResult(
        java.util.List<com.proyecto.citas.model.DiaFestivo> diaFestivos);

    /**
    * Creates a new dia festivo with the primary key. Does not add the dia festivo to the database.
    *
    * @param idFestivo the primary key for the new dia festivo
    * @return the new dia festivo
    */
    public com.proyecto.citas.model.DiaFestivo create(int idFestivo);

    /**
    * Removes the dia festivo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idFestivo the primary key of the dia festivo
    * @return the dia festivo that was removed
    * @throws com.proyecto.citas.NoSuchDiaFestivoException if a dia festivo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiaFestivo remove(int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiaFestivoException;

    public com.proyecto.citas.model.DiaFestivo updateImpl(
        com.proyecto.citas.model.DiaFestivo diaFestivo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the dia festivo with the primary key or throws a {@link com.proyecto.citas.NoSuchDiaFestivoException} if it could not be found.
    *
    * @param idFestivo the primary key of the dia festivo
    * @return the dia festivo
    * @throws com.proyecto.citas.NoSuchDiaFestivoException if a dia festivo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiaFestivo findByPrimaryKey(int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiaFestivoException;

    /**
    * Returns the dia festivo with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idFestivo the primary key of the dia festivo
    * @return the dia festivo, or <code>null</code> if a dia festivo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiaFestivo fetchByPrimaryKey(int idFestivo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the dia festivos.
    *
    * @return the dia festivos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.citas.model.DiaFestivo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the dia festivos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiaFestivoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dia festivos
    * @param end the upper bound of the range of dia festivos (not inclusive)
    * @return the range of dia festivos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.citas.model.DiaFestivo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the dia festivos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiaFestivoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of dia festivos
    * @param end the upper bound of the range of dia festivos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of dia festivos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.citas.model.DiaFestivo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the dia festivos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of dia festivos.
    *
    * @return the number of dia festivos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
