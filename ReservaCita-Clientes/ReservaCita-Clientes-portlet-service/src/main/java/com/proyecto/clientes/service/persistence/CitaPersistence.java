package com.proyecto.clientes.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.proyecto.clientes.model.Cita;

/**
 * The persistence interface for the cita service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitaPersistenceImpl
 * @see CitaUtil
 * @generated
 */
public interface CitaPersistence extends BasePersistence<Cita> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CitaUtil} to access the cita persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the citas where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @return the matching citas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.clientes.model.Cita> findByidCliente(
        int idCliente)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the citas where idCliente = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.CitaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idCliente the id cliente
    * @param start the lower bound of the range of citas
    * @param end the upper bound of the range of citas (not inclusive)
    * @return the range of matching citas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.clientes.model.Cita> findByidCliente(
        int idCliente, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the citas where idCliente = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.CitaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idCliente the id cliente
    * @param start the lower bound of the range of citas
    * @param end the upper bound of the range of citas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching citas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.clientes.model.Cita> findByidCliente(
        int idCliente, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first cita in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cita
    * @throws com.proyecto.clientes.NoSuchCitaException if a matching cita could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita findByidCliente_First(
        int idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchCitaException;

    /**
    * Returns the first cita in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cita, or <code>null</code> if a matching cita could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita fetchByidCliente_First(
        int idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last cita in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cita
    * @throws com.proyecto.clientes.NoSuchCitaException if a matching cita could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita findByidCliente_Last(
        int idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchCitaException;

    /**
    * Returns the last cita in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cita, or <code>null</code> if a matching cita could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita fetchByidCliente_Last(
        int idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the citas before and after the current cita in the ordered set where idCliente = &#63;.
    *
    * @param idCita the primary key of the current cita
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next cita
    * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita[] findByidCliente_PrevAndNext(
        int idCita, int idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchCitaException;

    /**
    * Removes all the citas where idCliente = &#63; from the database.
    *
    * @param idCliente the id cliente
    * @throws SystemException if a system exception occurred
    */
    public void removeByidCliente(int idCliente)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of citas where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @return the number of matching citas
    * @throws SystemException if a system exception occurred
    */
    public int countByidCliente(int idCliente)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the cita in the entity cache if it is enabled.
    *
    * @param cita the cita
    */
    public void cacheResult(com.proyecto.clientes.model.Cita cita);

    /**
    * Caches the citas in the entity cache if it is enabled.
    *
    * @param citas the citas
    */
    public void cacheResult(
        java.util.List<com.proyecto.clientes.model.Cita> citas);

    /**
    * Creates a new cita with the primary key. Does not add the cita to the database.
    *
    * @param idCita the primary key for the new cita
    * @return the new cita
    */
    public com.proyecto.clientes.model.Cita create(int idCita);

    /**
    * Removes the cita with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idCita the primary key of the cita
    * @return the cita that was removed
    * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita remove(int idCita)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchCitaException;

    public com.proyecto.clientes.model.Cita updateImpl(
        com.proyecto.clientes.model.Cita cita)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the cita with the primary key or throws a {@link com.proyecto.clientes.NoSuchCitaException} if it could not be found.
    *
    * @param idCita the primary key of the cita
    * @return the cita
    * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita findByPrimaryKey(int idCita)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchCitaException;

    /**
    * Returns the cita with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idCita the primary key of the cita
    * @return the cita, or <code>null</code> if a cita with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.proyecto.clientes.model.Cita fetchByPrimaryKey(int idCita)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the citas.
    *
    * @return the citas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.clientes.model.Cita> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.proyecto.clientes.model.Cita> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the citas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.CitaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of citas
    * @param end the upper bound of the range of citas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of citas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.proyecto.clientes.model.Cita> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the citas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of citas.
    *
    * @return the number of citas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
