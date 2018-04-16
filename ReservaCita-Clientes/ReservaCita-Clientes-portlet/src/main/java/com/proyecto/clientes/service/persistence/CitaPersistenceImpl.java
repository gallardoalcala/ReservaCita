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

import com.proyecto.clientes.NoSuchCitaException;
import com.proyecto.clientes.model.Cita;
import com.proyecto.clientes.model.impl.CitaImpl;
import com.proyecto.clientes.model.impl.CitaModelImpl;
import com.proyecto.clientes.service.persistence.CitaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the cita service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitaPersistence
 * @see CitaUtil
 * @generated
 */
public class CitaPersistenceImpl extends BasePersistenceImpl<Cita>
    implements CitaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CitaUtil} to access the cita persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CitaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaModelImpl.FINDER_CACHE_ENABLED, CitaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaModelImpl.FINDER_CACHE_ENABLED, CitaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDCLIENTE =
        new FinderPath(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaModelImpl.FINDER_CACHE_ENABLED, CitaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByidCliente",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE =
        new FinderPath(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaModelImpl.FINDER_CACHE_ENABLED, CitaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidCliente",
            new String[] { Integer.class.getName() },
            CitaModelImpl.IDCLIENTE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_IDCLIENTE = new FinderPath(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByidCliente",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_IDCLIENTE_IDCLIENTE_2 = "cita.idCliente = ?";
    private static final String _SQL_SELECT_CITA = "SELECT cita FROM Cita cita";
    private static final String _SQL_SELECT_CITA_WHERE = "SELECT cita FROM Cita cita WHERE ";
    private static final String _SQL_COUNT_CITA = "SELECT COUNT(cita) FROM Cita cita";
    private static final String _SQL_COUNT_CITA_WHERE = "SELECT COUNT(cita) FROM Cita cita WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "cita.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Cita exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Cita exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CitaPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idCita", "idCliente", "fechaCita", "descripcion"
            });
    private static Cita _nullCita = new CitaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Cita> toCacheModel() {
                return _nullCitaCacheModel;
            }
        };

    private static CacheModel<Cita> _nullCitaCacheModel = new CacheModel<Cita>() {
            @Override
            public Cita toEntityModel() {
                return _nullCita;
            }
        };

    public CitaPersistenceImpl() {
        setModelClass(Cita.class);
    }

    /**
     * Returns all the citas where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @return the matching citas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Cita> findByidCliente(int idCliente) throws SystemException {
        return findByidCliente(idCliente, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

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
    @Override
    public List<Cita> findByidCliente(int idCliente, int start, int end)
        throws SystemException {
        return findByidCliente(idCliente, start, end, null);
    }

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
    @Override
    public List<Cita> findByidCliente(int idCliente, int start, int end,
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

        List<Cita> list = (List<Cita>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Cita cita : list) {
                if ((idCliente != cita.getIdCliente())) {
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

            query.append(_SQL_SELECT_CITA_WHERE);

            query.append(_FINDER_COLUMN_IDCLIENTE_IDCLIENTE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CitaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idCliente);

                if (!pagination) {
                    list = (List<Cita>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Cita>(list);
                } else {
                    list = (List<Cita>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first cita in the ordered set where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching cita
     * @throws com.proyecto.clientes.NoSuchCitaException if a matching cita could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita findByidCliente_First(int idCliente,
        OrderByComparator orderByComparator)
        throws NoSuchCitaException, SystemException {
        Cita cita = fetchByidCliente_First(idCliente, orderByComparator);

        if (cita != null) {
            return cita;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idCliente=");
        msg.append(idCliente);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCitaException(msg.toString());
    }

    /**
     * Returns the first cita in the ordered set where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching cita, or <code>null</code> if a matching cita could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita fetchByidCliente_First(int idCliente,
        OrderByComparator orderByComparator) throws SystemException {
        List<Cita> list = findByidCliente(idCliente, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last cita in the ordered set where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching cita
     * @throws com.proyecto.clientes.NoSuchCitaException if a matching cita could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita findByidCliente_Last(int idCliente,
        OrderByComparator orderByComparator)
        throws NoSuchCitaException, SystemException {
        Cita cita = fetchByidCliente_Last(idCliente, orderByComparator);

        if (cita != null) {
            return cita;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idCliente=");
        msg.append(idCliente);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCitaException(msg.toString());
    }

    /**
     * Returns the last cita in the ordered set where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching cita, or <code>null</code> if a matching cita could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita fetchByidCliente_Last(int idCliente,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByidCliente(idCliente);

        if (count == 0) {
            return null;
        }

        List<Cita> list = findByidCliente(idCliente, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Cita[] findByidCliente_PrevAndNext(int idCita, int idCliente,
        OrderByComparator orderByComparator)
        throws NoSuchCitaException, SystemException {
        Cita cita = findByPrimaryKey(idCita);

        Session session = null;

        try {
            session = openSession();

            Cita[] array = new CitaImpl[3];

            array[0] = getByidCliente_PrevAndNext(session, cita, idCliente,
                    orderByComparator, true);

            array[1] = cita;

            array[2] = getByidCliente_PrevAndNext(session, cita, idCliente,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Cita getByidCliente_PrevAndNext(Session session, Cita cita,
        int idCliente, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CITA_WHERE);

        query.append(_FINDER_COLUMN_IDCLIENTE_IDCLIENTE_2);

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
            query.append(CitaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idCliente);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(cita);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Cita> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the citas where idCliente = &#63; from the database.
     *
     * @param idCliente the id cliente
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByidCliente(int idCliente) throws SystemException {
        for (Cita cita : findByidCliente(idCliente, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(cita);
        }
    }

    /**
     * Returns the number of citas where idCliente = &#63;.
     *
     * @param idCliente the id cliente
     * @return the number of matching citas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByidCliente(int idCliente) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_IDCLIENTE;

        Object[] finderArgs = new Object[] { idCliente };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CITA_WHERE);

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
     * Caches the cita in the entity cache if it is enabled.
     *
     * @param cita the cita
     */
    @Override
    public void cacheResult(Cita cita) {
        EntityCacheUtil.putResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaImpl.class, cita.getPrimaryKey(), cita);

        cita.resetOriginalValues();
    }

    /**
     * Caches the citas in the entity cache if it is enabled.
     *
     * @param citas the citas
     */
    @Override
    public void cacheResult(List<Cita> citas) {
        for (Cita cita : citas) {
            if (EntityCacheUtil.getResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
                        CitaImpl.class, cita.getPrimaryKey()) == null) {
                cacheResult(cita);
            } else {
                cita.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all citas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CitaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CitaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the cita.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Cita cita) {
        EntityCacheUtil.removeResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaImpl.class, cita.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Cita> citas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Cita cita : citas) {
            EntityCacheUtil.removeResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
                CitaImpl.class, cita.getPrimaryKey());
        }
    }

    /**
     * Creates a new cita with the primary key. Does not add the cita to the database.
     *
     * @param idCita the primary key for the new cita
     * @return the new cita
     */
    @Override
    public Cita create(int idCita) {
        Cita cita = new CitaImpl();

        cita.setNew(true);
        cita.setPrimaryKey(idCita);

        return cita;
    }

    /**
     * Removes the cita with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idCita the primary key of the cita
     * @return the cita that was removed
     * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita remove(int idCita) throws NoSuchCitaException, SystemException {
        return remove((Serializable) idCita);
    }

    /**
     * Removes the cita with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the cita
     * @return the cita that was removed
     * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita remove(Serializable primaryKey)
        throws NoSuchCitaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Cita cita = (Cita) session.get(CitaImpl.class, primaryKey);

            if (cita == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCitaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(cita);
        } catch (NoSuchCitaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Cita removeImpl(Cita cita) throws SystemException {
        cita = toUnwrappedModel(cita);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(cita)) {
                cita = (Cita) session.get(CitaImpl.class,
                        cita.getPrimaryKeyObj());
            }

            if (cita != null) {
                session.delete(cita);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (cita != null) {
            clearCache(cita);
        }

        return cita;
    }

    @Override
    public Cita updateImpl(com.proyecto.clientes.model.Cita cita)
        throws SystemException {
        cita = toUnwrappedModel(cita);

        boolean isNew = cita.isNew();

        CitaModelImpl citaModelImpl = (CitaModelImpl) cita;

        Session session = null;

        try {
            session = openSession();

            if (cita.isNew()) {
                session.save(cita);

                cita.setNew(false);
            } else {
                session.merge(cita);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CitaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((citaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        citaModelImpl.getOriginalIdCliente()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDCLIENTE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE,
                    args);

                args = new Object[] { citaModelImpl.getIdCliente() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDCLIENTE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDCLIENTE,
                    args);
            }
        }

        EntityCacheUtil.putResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
            CitaImpl.class, cita.getPrimaryKey(), cita);

        return cita;
    }

    protected Cita toUnwrappedModel(Cita cita) {
        if (cita instanceof CitaImpl) {
            return cita;
        }

        CitaImpl citaImpl = new CitaImpl();

        citaImpl.setNew(cita.isNew());
        citaImpl.setPrimaryKey(cita.getPrimaryKey());

        citaImpl.setIdCita(cita.getIdCita());
        citaImpl.setIdCliente(cita.getIdCliente());
        citaImpl.setFechaCita(cita.getFechaCita());
        citaImpl.setDescripcion(cita.getDescripcion());

        return citaImpl;
    }

    /**
     * Returns the cita with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the cita
     * @return the cita
     * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCitaException, SystemException {
        Cita cita = fetchByPrimaryKey(primaryKey);

        if (cita == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCitaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return cita;
    }

    /**
     * Returns the cita with the primary key or throws a {@link com.proyecto.clientes.NoSuchCitaException} if it could not be found.
     *
     * @param idCita the primary key of the cita
     * @return the cita
     * @throws com.proyecto.clientes.NoSuchCitaException if a cita with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita findByPrimaryKey(int idCita)
        throws NoSuchCitaException, SystemException {
        return findByPrimaryKey((Serializable) idCita);
    }

    /**
     * Returns the cita with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the cita
     * @return the cita, or <code>null</code> if a cita with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Cita cita = (Cita) EntityCacheUtil.getResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
                CitaImpl.class, primaryKey);

        if (cita == _nullCita) {
            return null;
        }

        if (cita == null) {
            Session session = null;

            try {
                session = openSession();

                cita = (Cita) session.get(CitaImpl.class, primaryKey);

                if (cita != null) {
                    cacheResult(cita);
                } else {
                    EntityCacheUtil.putResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
                        CitaImpl.class, primaryKey, _nullCita);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CitaModelImpl.ENTITY_CACHE_ENABLED,
                    CitaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return cita;
    }

    /**
     * Returns the cita with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idCita the primary key of the cita
     * @return the cita, or <code>null</code> if a cita with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Cita fetchByPrimaryKey(int idCita) throws SystemException {
        return fetchByPrimaryKey((Serializable) idCita);
    }

    /**
     * Returns all the citas.
     *
     * @return the citas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Cita> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Cita> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Cita> findAll(int start, int end,
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

        List<Cita> list = (List<Cita>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CITA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CITA;

                if (pagination) {
                    sql = sql.concat(CitaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Cita>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Cita>(list);
                } else {
                    list = (List<Cita>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the citas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Cita cita : findAll()) {
            remove(cita);
        }
    }

    /**
     * Returns the number of citas.
     *
     * @return the number of citas
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

                Query q = session.createQuery(_SQL_COUNT_CITA);

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
     * Initializes the cita persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.clientes.model.Cita")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Cita>> listenersList = new ArrayList<ModelListener<Cita>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Cita>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CitaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
