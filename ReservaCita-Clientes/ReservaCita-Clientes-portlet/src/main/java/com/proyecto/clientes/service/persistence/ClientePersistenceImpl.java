package com.proyecto.clientes.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.proyecto.clientes.NoSuchClienteException;
import com.proyecto.clientes.model.Cliente;
import com.proyecto.clientes.model.impl.ClienteImpl;
import com.proyecto.clientes.model.impl.ClienteModelImpl;
import com.proyecto.clientes.service.persistence.ClientePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the cliente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientePersistence
 * @see ClienteUtil
 * @generated
 */
public class ClientePersistenceImpl extends BasePersistenceImpl<Cliente>
    implements ClientePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ClienteUtil} to access the cliente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ClienteImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDCLIENTE =
        new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByidCliente",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE =
        new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidCliente",
            new String[] { Long.class.getName() },
            ClienteModelImpl.IDCLIENTE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_IDCLIENTE = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByidCliente",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_IDCLIENTE_IDCLIENTE_2 = "cliente.idCliente = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVADO = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByactivado",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVADO =
        new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByactivado",
            new String[] { Integer.class.getName() },
            ClienteModelImpl.ACTIVADO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVADO = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByactivado",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_ACTIVADO_ACTIVADO_2 = "cliente.activado = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DENEGADO = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydenegado",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DENEGADO =
        new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, ClienteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydenegado",
            new String[] { Integer.class.getName() },
            ClienteModelImpl.DENEGADO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DENEGADO = new FinderPath(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydenegado",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_DENEGADO_DENEGADO_2 = "cliente.denegado = ?";
    private static final String _SQL_SELECT_CLIENTE = "SELECT cliente FROM Cliente cliente";
    private static final String _SQL_SELECT_CLIENTE_WHERE = "SELECT cliente FROM Cliente cliente WHERE ";
    private static final String _SQL_COUNT_CLIENTE = "SELECT COUNT(cliente) FROM Cliente cliente";
    private static final String _SQL_COUNT_CLIENTE_WHERE = "SELECT COUNT(cliente) FROM Cliente cliente WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "cliente.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Cliente exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Cliente exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ClientePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idCliente", "activado", "denegado"
            });
    private static Cliente _nullCliente = new ClienteImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Cliente> toCacheModel() {
                return _nullClienteCacheModel;
            }
        };

    private static CacheModel<Cliente> _nullClienteCacheModel = new CacheModel<Cliente>() {
            @Override
            public Cliente toEntityModel() {
                return _nullCliente;
            }
        };

    public ClientePersistenceImpl() {
        setModelClass(Cliente.class);
    }

    /**
     * Returns all the clientes where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @return the matching clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Cliente> findByidCliente(long idCliente)
        throws SystemException {
        return findByidCliente(idCliente, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Cliente> findByidCliente(long idCliente, int start, int end)
        throws SystemException {
        return findByidCliente(idCliente, start, end, null);
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
    @Override
    public List<Cliente> findByidCliente(long idCliente, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE;
            finderArgs = new Object[] { idCliente };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDCLIENTE;
            finderArgs = new Object[] { idCliente, start, end, orderByComparator };
        }

        List<Cliente> list = (List<Cliente>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Cliente cliente : list) {
                if ((idCliente != cliente.getIdCliente())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CLIENTE_WHERE);

            query.append(_FINDER_COLUMN_IDCLIENTE_IDCLIENTE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ClienteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idCliente);

                if (!pagination) {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Cliente>(list);
                } else {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Cliente findByidCliente_First(long idCliente,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchByidCliente_First(idCliente, orderByComparator);

        if (cliente != null) {
            return cliente;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idCliente=");
        msg.append(idCliente);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchClienteException(msg.toString());
    }

    /**
     * Returns the first cliente in the ordered set where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchByidCliente_First(long idCliente,
        OrderByComparator orderByComparator) throws SystemException {
        List<Cliente> list = findByidCliente(idCliente, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Cliente findByidCliente_Last(long idCliente,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchByidCliente_Last(idCliente, orderByComparator);

        if (cliente != null) {
            return cliente;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idCliente=");
        msg.append(idCliente);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchClienteException(msg.toString());
    }

    /**
     * Returns the last cliente in the ordered set where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchByidCliente_Last(long idCliente,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByidCliente(idCliente);

        if (count == 0) {
            return null;
        }

        List<Cliente> list = findByidCliente(idCliente, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the clientes where idCliente = &#63; from the database.
     *
     * @param idCliente the id cliente
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByidCliente(long idCliente) throws SystemException {
        for (Cliente cliente : findByidCliente(idCliente, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(cliente);
        }
    }

    /**
     * Returns the number of clientes where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @return the number of matching clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByidCliente(long idCliente) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_IDCLIENTE;

        Object[] finderArgs = new Object[] { idCliente };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CLIENTE_WHERE);

            query.append(_FINDER_COLUMN_IDCLIENTE_IDCLIENTE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idCliente);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the clientes where activado = &#63;.
     *
     * @param activado the activado
     * @return the matching clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Cliente> findByactivado(int activado) throws SystemException {
        return findByactivado(activado, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Cliente> findByactivado(int activado, int start, int end)
        throws SystemException {
        return findByactivado(activado, start, end, null);
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
    @Override
    public List<Cliente> findByactivado(int activado, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVADO;
            finderArgs = new Object[] { activado };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVADO;
            finderArgs = new Object[] { activado, start, end, orderByComparator };
        }

        List<Cliente> list = (List<Cliente>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Cliente cliente : list) {
                if ((activado != cliente.getActivado())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CLIENTE_WHERE);

            query.append(_FINDER_COLUMN_ACTIVADO_ACTIVADO_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ClienteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(activado);

                if (!pagination) {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Cliente>(list);
                } else {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Cliente findByactivado_First(int activado,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchByactivado_First(activado, orderByComparator);

        if (cliente != null) {
            return cliente;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("activado=");
        msg.append(activado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchClienteException(msg.toString());
    }

    /**
     * Returns the first cliente in the ordered set where activado = &#63;.
     *
     * @param activado the activado
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchByactivado_First(int activado,
        OrderByComparator orderByComparator) throws SystemException {
        List<Cliente> list = findByactivado(activado, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Cliente findByactivado_Last(int activado,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchByactivado_Last(activado, orderByComparator);

        if (cliente != null) {
            return cliente;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("activado=");
        msg.append(activado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchClienteException(msg.toString());
    }

    /**
     * Returns the last cliente in the ordered set where activado = &#63;.
     *
     * @param activado the activado
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchByactivado_Last(int activado,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByactivado(activado);

        if (count == 0) {
            return null;
        }

        List<Cliente> list = findByactivado(activado, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Cliente[] findByactivado_PrevAndNext(long idCliente, int activado,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = findByPrimaryKey(idCliente);

        Session session = null;

        try {
            session = openSession();

            Cliente[] array = new ClienteImpl[3];

            array[0] = getByactivado_PrevAndNext(session, cliente, activado,
                    orderByComparator, true);

            array[1] = cliente;

            array[2] = getByactivado_PrevAndNext(session, cliente, activado,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Cliente getByactivado_PrevAndNext(Session session,
        Cliente cliente, int activado, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CLIENTE_WHERE);

        query.append(_FINDER_COLUMN_ACTIVADO_ACTIVADO_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ClienteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(activado);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(cliente);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Cliente> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the clientes where activado = &#63; from the database.
     *
     * @param activado the activado
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByactivado(int activado) throws SystemException {
        for (Cliente cliente : findByactivado(activado, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(cliente);
        }
    }

    /**
     * Returns the number of clientes where activado = &#63;.
     *
     * @param activado the activado
     * @return the number of matching clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByactivado(int activado) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVADO;

        Object[] finderArgs = new Object[] { activado };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CLIENTE_WHERE);

            query.append(_FINDER_COLUMN_ACTIVADO_ACTIVADO_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(activado);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the clientes where denegado = &#63;.
     *
     * @param denegado the denegado
     * @return the matching clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Cliente> findBydenegado(int denegado) throws SystemException {
        return findBydenegado(denegado, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Cliente> findBydenegado(int denegado, int start, int end)
        throws SystemException {
        return findBydenegado(denegado, start, end, null);
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
    @Override
    public List<Cliente> findBydenegado(int denegado, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DENEGADO;
            finderArgs = new Object[] { denegado };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DENEGADO;
            finderArgs = new Object[] { denegado, start, end, orderByComparator };
        }

        List<Cliente> list = (List<Cliente>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Cliente cliente : list) {
                if ((denegado != cliente.getDenegado())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CLIENTE_WHERE);

            query.append(_FINDER_COLUMN_DENEGADO_DENEGADO_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ClienteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(denegado);

                if (!pagination) {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Cliente>(list);
                } else {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Cliente findBydenegado_First(int denegado,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchBydenegado_First(denegado, orderByComparator);

        if (cliente != null) {
            return cliente;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("denegado=");
        msg.append(denegado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchClienteException(msg.toString());
    }

    /**
     * Returns the first cliente in the ordered set where denegado = &#63;.
     *
     * @param denegado the denegado
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchBydenegado_First(int denegado,
        OrderByComparator orderByComparator) throws SystemException {
        List<Cliente> list = findBydenegado(denegado, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Cliente findBydenegado_Last(int denegado,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchBydenegado_Last(denegado, orderByComparator);

        if (cliente != null) {
            return cliente;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("denegado=");
        msg.append(denegado);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchClienteException(msg.toString());
    }

    /**
     * Returns the last cliente in the ordered set where denegado = &#63;.
     *
     * @param denegado the denegado
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchBydenegado_Last(int denegado,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBydenegado(denegado);

        if (count == 0) {
            return null;
        }

        List<Cliente> list = findBydenegado(denegado, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Cliente[] findBydenegado_PrevAndNext(long idCliente, int denegado,
        OrderByComparator orderByComparator)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = findByPrimaryKey(idCliente);

        Session session = null;

        try {
            session = openSession();

            Cliente[] array = new ClienteImpl[3];

            array[0] = getBydenegado_PrevAndNext(session, cliente, denegado,
                    orderByComparator, true);

            array[1] = cliente;

            array[2] = getBydenegado_PrevAndNext(session, cliente, denegado,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Cliente getBydenegado_PrevAndNext(Session session,
        Cliente cliente, int denegado, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CLIENTE_WHERE);

        query.append(_FINDER_COLUMN_DENEGADO_DENEGADO_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ClienteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(denegado);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(cliente);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Cliente> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the clientes where denegado = &#63; from the database.
     *
     * @param denegado the denegado
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBydenegado(int denegado) throws SystemException {
        for (Cliente cliente : findBydenegado(denegado, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(cliente);
        }
    }

    /**
     * Returns the number of clientes where denegado = &#63;.
     *
     * @param denegado the denegado
     * @return the number of matching clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBydenegado(int denegado) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DENEGADO;

        Object[] finderArgs = new Object[] { denegado };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CLIENTE_WHERE);

            query.append(_FINDER_COLUMN_DENEGADO_DENEGADO_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(denegado);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the cliente in the entity cache if it is enabled.
     *
     * @param cliente the cliente
     */
    @Override
    public void cacheResult(Cliente cliente) {
        EntityCacheUtil.putResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteImpl.class, cliente.getPrimaryKey(), cliente);

        cliente.resetOriginalValues();
    }

    /**
     * Caches the clientes in the entity cache if it is enabled.
     *
     * @param clientes the clientes
     */
    @Override
    public void cacheResult(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (EntityCacheUtil.getResult(
                        ClienteModelImpl.ENTITY_CACHE_ENABLED,
                        ClienteImpl.class, cliente.getPrimaryKey()) == null) {
                cacheResult(cliente);
            } else {
                cliente.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all clientes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ClienteImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ClienteImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the cliente.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Cliente cliente) {
        EntityCacheUtil.removeResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteImpl.class, cliente.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Cliente> clientes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Cliente cliente : clientes) {
            EntityCacheUtil.removeResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
                ClienteImpl.class, cliente.getPrimaryKey());
        }
    }

    /**
     * Creates a new cliente with the primary key. Does not add the cliente to the database.
     *
     * @param idCliente the primary key for the new cliente
     * @return the new cliente
     */
    @Override
    public Cliente create(long idCliente) {
        Cliente cliente = new ClienteImpl();

        cliente.setNew(true);
        cliente.setPrimaryKey(idCliente);

        return cliente;
    }

    /**
     * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idCliente the primary key of the cliente
     * @return the cliente that was removed
     * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente remove(long idCliente)
        throws NoSuchClienteException, SystemException {
        return remove((Serializable) idCliente);
    }

    /**
     * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the cliente
     * @return the cliente that was removed
     * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente remove(Serializable primaryKey)
        throws NoSuchClienteException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Cliente cliente = (Cliente) session.get(ClienteImpl.class,
                    primaryKey);

            if (cliente == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchClienteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(cliente);
        } catch (NoSuchClienteException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Cliente removeImpl(Cliente cliente) throws SystemException {
        cliente = toUnwrappedModel(cliente);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(cliente)) {
                cliente = (Cliente) session.get(ClienteImpl.class,
                        cliente.getPrimaryKeyObj());
            }

            if (cliente != null) {
                session.delete(cliente);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (cliente != null) {
            clearCache(cliente);
        }

        return cliente;
    }

    @Override
    public Cliente updateImpl(com.proyecto.clientes.model.Cliente cliente)
        throws SystemException {
        cliente = toUnwrappedModel(cliente);

        boolean isNew = cliente.isNew();

        ClienteModelImpl clienteModelImpl = (ClienteModelImpl) cliente;

        Session session = null;

        try {
            session = openSession();

            if (cliente.isNew()) {
                session.save(cliente);

                cliente.setNew(false);
            } else {
                session.merge(cliente);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ClienteModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((clienteModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        clienteModelImpl.getOriginalIdCliente()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDCLIENTE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE,
                    args);

                args = new Object[] { clienteModelImpl.getIdCliente() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDCLIENTE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE,
                    args);
            }

            if ((clienteModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVADO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        clienteModelImpl.getOriginalActivado()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVADO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVADO,
                    args);

                args = new Object[] { clienteModelImpl.getActivado() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVADO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVADO,
                    args);
            }

            if ((clienteModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DENEGADO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        clienteModelImpl.getOriginalDenegado()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DENEGADO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DENEGADO,
                    args);

                args = new Object[] { clienteModelImpl.getDenegado() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DENEGADO, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DENEGADO,
                    args);
            }
        }

        EntityCacheUtil.putResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
            ClienteImpl.class, cliente.getPrimaryKey(), cliente);

        return cliente;
    }

    protected Cliente toUnwrappedModel(Cliente cliente) {
        if (cliente instanceof ClienteImpl) {
            return cliente;
        }

        ClienteImpl clienteImpl = new ClienteImpl();

        clienteImpl.setNew(cliente.isNew());
        clienteImpl.setPrimaryKey(cliente.getPrimaryKey());

        clienteImpl.setIdCliente(cliente.getIdCliente());
        clienteImpl.setActivado(cliente.getActivado());
        clienteImpl.setDenegado(cliente.getDenegado());

        return clienteImpl;
    }

    /**
     * Returns the cliente with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the cliente
     * @return the cliente
     * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente findByPrimaryKey(Serializable primaryKey)
        throws NoSuchClienteException, SystemException {
        Cliente cliente = fetchByPrimaryKey(primaryKey);

        if (cliente == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchClienteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return cliente;
    }

    /**
     * Returns the cliente with the primary key or throws a {@link com.proyecto.clientes.NoSuchClienteException} if it could not be found.
     *
     * @param idCliente the primary key of the cliente
     * @return the cliente
     * @throws com.proyecto.clientes.NoSuchClienteException if a cliente with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente findByPrimaryKey(long idCliente)
        throws NoSuchClienteException, SystemException {
        return findByPrimaryKey((Serializable) idCliente);
    }

    /**
     * Returns the cliente with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the cliente
     * @return the cliente, or <code>null</code> if a cliente with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Cliente cliente = (Cliente) EntityCacheUtil.getResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
                ClienteImpl.class, primaryKey);

        if (cliente == _nullCliente) {
            return null;
        }

        if (cliente == null) {
            Session session = null;

            try {
                session = openSession();

                cliente = (Cliente) session.get(ClienteImpl.class, primaryKey);

                if (cliente != null) {
                    cacheResult(cliente);
                } else {
                    EntityCacheUtil.putResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
                        ClienteImpl.class, primaryKey, _nullCliente);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ClienteModelImpl.ENTITY_CACHE_ENABLED,
                    ClienteImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return cliente;
    }

    /**
     * Returns the cliente with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idCliente the primary key of the cliente
     * @return the cliente, or <code>null</code> if a cliente with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cliente fetchByPrimaryKey(long idCliente) throws SystemException {
        return fetchByPrimaryKey((Serializable) idCliente);
    }

    /**
     * Returns all the clientes.
     *
     * @return the clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Cliente> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Cliente> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Cliente> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Cliente> list = (List<Cliente>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CLIENTE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CLIENTE;

                if (pagination) {
                    sql = sql.concat(ClienteModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Cliente>(list);
                } else {
                    list = (List<Cliente>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the clientes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Cliente cliente : findAll()) {
            remove(cliente);
        }
    }

    /**
     * Returns the number of clientes.
     *
     * @return the number of clientes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_CLIENTE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the cliente persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.clientes.model.Cliente")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Cliente>> listenersList = new ArrayList<ModelListener<Cliente>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Cliente>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ClienteImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
