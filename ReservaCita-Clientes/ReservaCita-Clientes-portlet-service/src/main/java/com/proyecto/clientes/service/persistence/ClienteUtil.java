package com.proyecto.clientes.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.proyecto.clientes.model.Cliente;

import java.util.List;

/**
 * The persistence utility for the cliente service. This utility wraps {@link ClientePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientePersistence
 * @see ClientePersistenceImpl
 * @generated
 */
public class ClienteUtil {
    private static ClientePersistence _persistence;

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
    public static void clearCache(Cliente cliente) {
        getPersistence().clearCache(cliente);
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
    public static List<Cliente> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Cliente> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Cliente> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Cliente update(Cliente cliente) throws SystemException {
        return getPersistence().update(cliente);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Cliente update(Cliente cliente, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(cliente, serviceContext);
    }

    /**
    * Returns all the clientes where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @return the matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findByidCliente(
        long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByidCliente(idCliente);
    }

    /**
    * Returns a range of all the clientes where idCliente = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idCliente the id cliente
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @return the range of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findByidCliente(
        long idCliente, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByidCliente(idCliente, start, end);
    }

    /**
    * Returns an ordered range of all the clientes where idCliente = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idCliente the id cliente
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findByidCliente(
        long idCliente, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByidCliente(idCliente, start, end, orderByComparator);
    }

    /**
    * Returns the first cliente in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findByidCliente_First(
        long idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence()
                   .findByidCliente_First(idCliente, orderByComparator);
    }

    /**
    * Returns the first cliente in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchByidCliente_First(
        long idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByidCliente_First(idCliente, orderByComparator);
    }

    /**
    * Returns the last cliente in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findByidCliente_Last(
        long idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence()
                   .findByidCliente_Last(idCliente, orderByComparator);
    }

    /**
    * Returns the last cliente in the ordered set where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchByidCliente_Last(
        long idCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByidCliente_Last(idCliente, orderByComparator);
    }

    /**
    * Removes all the clientes where idCliente = &#63; from the database.
    *
    * @param idCliente the id cliente
    * @throws SystemException if a system exception occurred
    */
    public static void removeByidCliente(long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByidCliente(idCliente);
    }

    /**
    * Returns the number of clientes where idCliente = &#63;.
    *
    * @param idCliente the id cliente
    * @return the number of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static int countByidCliente(long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByidCliente(idCliente);
    }

    /**
    * Returns all the clientes where activado = &#63;.
    *
    * @param activado the activado
    * @return the matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findByactivado(
        int activado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByactivado(activado);
    }

    /**
    * Returns a range of all the clientes where activado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param activado the activado
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @return the range of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findByactivado(
        int activado, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByactivado(activado, start, end);
    }

    /**
    * Returns an ordered range of all the clientes where activado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param activado the activado
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findByactivado(
        int activado, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByactivado(activado, start, end, orderByComparator);
    }

    /**
    * Returns the first cliente in the ordered set where activado = &#63;.
    *
    * @param activado the activado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findByactivado_First(
        int activado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence().findByactivado_First(activado, orderByComparator);
    }

    /**
    * Returns the first cliente in the ordered set where activado = &#63;.
    *
    * @param activado the activado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchByactivado_First(
        int activado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByactivado_First(activado, orderByComparator);
    }

    /**
    * Returns the last cliente in the ordered set where activado = &#63;.
    *
    * @param activado the activado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findByactivado_Last(
        int activado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence().findByactivado_Last(activado, orderByComparator);
    }

    /**
    * Returns the last cliente in the ordered set where activado = &#63;.
    *
    * @param activado the activado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchByactivado_Last(
        int activado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByactivado_Last(activado, orderByComparator);
    }

    /**
    * Returns the clientes before and after the current cliente in the ordered set where activado = &#63;.
    *
    * @param idCliente the primary key of the current cliente
    * @param activado the activado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente[] findByactivado_PrevAndNext(
        long idCliente, int activado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence()
                   .findByactivado_PrevAndNext(idCliente, activado,
            orderByComparator);
    }

    /**
    * Removes all the clientes where activado = &#63; from the database.
    *
    * @param activado the activado
    * @throws SystemException if a system exception occurred
    */
    public static void removeByactivado(int activado)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByactivado(activado);
    }

    /**
    * Returns the number of clientes where activado = &#63;.
    *
    * @param activado the activado
    * @return the number of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static int countByactivado(int activado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByactivado(activado);
    }

    /**
    * Returns all the clientes where denegado = &#63;.
    *
    * @param denegado the denegado
    * @return the matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findBydenegado(
        int denegado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBydenegado(denegado);
    }

    /**
    * Returns a range of all the clientes where denegado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param denegado the denegado
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @return the range of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findBydenegado(
        int denegado, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBydenegado(denegado, start, end);
    }

    /**
    * Returns an ordered range of all the clientes where denegado = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param denegado the denegado
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findBydenegado(
        int denegado, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBydenegado(denegado, start, end, orderByComparator);
    }

    /**
    * Returns the first cliente in the ordered set where denegado = &#63;.
    *
    * @param denegado the denegado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findBydenegado_First(
        int denegado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence().findBydenegado_First(denegado, orderByComparator);
    }

    /**
    * Returns the first cliente in the ordered set where denegado = &#63;.
    *
    * @param denegado the denegado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchBydenegado_First(
        int denegado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBydenegado_First(denegado, orderByComparator);
    }

    /**
    * Returns the last cliente in the ordered set where denegado = &#63;.
    *
    * @param denegado the denegado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findBydenegado_Last(
        int denegado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence().findBydenegado_Last(denegado, orderByComparator);
    }

    /**
    * Returns the last cliente in the ordered set where denegado = &#63;.
    *
    * @param denegado the denegado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchBydenegado_Last(
        int denegado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBydenegado_Last(denegado, orderByComparator);
    }

    /**
    * Returns the clientes before and after the current cliente in the ordered set where denegado = &#63;.
    *
    * @param idCliente the primary key of the current cliente
    * @param denegado the denegado
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente[] findBydenegado_PrevAndNext(
        long idCliente, int denegado,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence()
                   .findBydenegado_PrevAndNext(idCliente, denegado,
            orderByComparator);
    }

    /**
    * Removes all the clientes where denegado = &#63; from the database.
    *
    * @param denegado the denegado
    * @throws SystemException if a system exception occurred
    */
    public static void removeBydenegado(int denegado)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBydenegado(denegado);
    }

    /**
    * Returns the number of clientes where denegado = &#63;.
    *
    * @param denegado the denegado
    * @return the number of matching clientes
    * @throws SystemException if a system exception occurred
    */
    public static int countBydenegado(int denegado)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBydenegado(denegado);
    }

    /**
    * Caches the cliente in the entity cache if it is enabled.
    *
    * @param cliente the cliente
    */
    public static void cacheResult(com.proyecto.clientes.model.Cliente cliente) {
        getPersistence().cacheResult(cliente);
    }

    /**
    * Caches the clientes in the entity cache if it is enabled.
    *
    * @param clientes the clientes
    */
    public static void cacheResult(
        java.util.List<com.proyecto.clientes.model.Cliente> clientes) {
        getPersistence().cacheResult(clientes);
    }

    /**
    * Creates a new cliente with the primary key. Does not add the cliente to the database.
    *
    * @param idCliente the primary key for the new cliente
    * @return the new cliente
    */
    public static com.proyecto.clientes.model.Cliente create(long idCliente) {
        return getPersistence().create(idCliente);
    }

    /**
    * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idCliente the primary key of the cliente
    * @return the cliente that was removed
    * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente remove(long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence().remove(idCliente);
    }

    public static com.proyecto.clientes.model.Cliente updateImpl(
        com.proyecto.clientes.model.Cliente cliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(cliente);
    }

    /**
    * Returns the cliente with the primary key or throws a {@link com.proyecto.clientes.NoSuchClienteException} if it could not be found.
    *
    * @param idCliente the primary key of the cliente
    * @return the cliente
    * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente findByPrimaryKey(
        long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.proyecto.clientes.NoSuchClienteException {
        return getPersistence().findByPrimaryKey(idCliente);
    }

    /**
    * Returns the cliente with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idCliente the primary key of the cliente
    * @return the cliente, or <code>null</code> if a cliente with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.proyecto.clientes.model.Cliente fetchByPrimaryKey(
        long idCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idCliente);
    }

    /**
    * Returns all the clientes.
    *
    * @return the clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the clientes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @return the range of clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the clientes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.clientes.model.impl.ClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of clientes
    * @param end the upper bound of the range of clientes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of clientes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.proyecto.clientes.model.Cliente> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the clientes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of clientes.
    *
    * @return the number of clientes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ClientePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ClientePersistence) PortletBeanLocatorUtil.locate(com.proyecto.clientes.service.ClpSerializer.getServletContextName(),
                    ClientePersistence.class.getName());

            ReferenceRegistry.registerReference(ClienteUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ClientePersistence persistence) {
    }
}
