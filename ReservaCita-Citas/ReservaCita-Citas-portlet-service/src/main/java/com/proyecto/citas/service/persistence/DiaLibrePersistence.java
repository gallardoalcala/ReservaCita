package com.proyecto.citas.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.proyecto.citas.model.DiaLibre;

/**
 * The persistence interface for the dia libre service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaLibrePersistenceImpl
 * @see DiaLibreUtil
 * @generated
 */
public interface DiaLibrePersistence extends BasePersistence<DiaLibre> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DiaLibreUtil} to access the dia libre persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the dia libre in the entity cache if it is enabled.
    *
    * @param diaLibre the dia libre
    */
    public void cacheResult(com.proyecto.citas.model.DiaLibre diaLibre);

    /**
    * Caches the dia libres in the entity cache if it is enabled.
    *
    * @param diaLibres the dia libres
    */
    public void cacheResult(
        java.util.List<com.proyecto.citas.model.DiaLibre> diaLibres);

    /**
    * Creates a new dia libre with the primary key. Does not add the dia libre to the database.
    *
    * @param idLibre the primary key for the new dia libre
    * @return the new dia libre
    */
    public com.proyecto.citas.model.DiaLibre create(int idLibre);

    /**
    * Removes the dia libre with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idLibre the primary key of the dia libre
    * @return the dia libre that was removed
    * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiaLibre remove(int idLibre)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiaLibreException;

    public com.proyecto.citas.model.DiaLibre updateImpl(
        com.proyecto.citas.model.DiaLibre diaLibre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the dia libre with the primary key or throws a {@link com.proyecto.citas.NoSuchDiaLibreException} if it could not be found.
    *
    * @param idLibre the primary key of the dia libre
    * @return the dia libre
    * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiaLibre findByPrimaryKey(int idLibre)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.citas.NoSuchDiaLibreException;

    /**
    * Returns the dia libre with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idLibre the primary key of the dia libre
    * @return the dia libre, or <code>null</code> if a dia libre with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.citas.model.DiaLibre fetchByPrimaryKey(int idLibre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the dia libres.
    *
    * @return the dia libres
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.citas.model.DiaLibre> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.proyecto.citas.model.DiaLibre> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.proyecto.citas.model.DiaLibre> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the dia libres from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of dia libres.
    *
    * @return the number of dia libres
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
