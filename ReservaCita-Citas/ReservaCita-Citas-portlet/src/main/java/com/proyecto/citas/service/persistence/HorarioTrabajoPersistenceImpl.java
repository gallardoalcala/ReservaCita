package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.proyecto.citas.NoSuchHorarioTrabajoException;
import com.proyecto.citas.model.HorarioTrabajo;
import com.proyecto.citas.model.impl.HorarioTrabajoImpl;
import com.proyecto.citas.model.impl.HorarioTrabajoModelImpl;
import com.proyecto.citas.service.persistence.HorarioTrabajoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the horario trabajo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorarioTrabajoPersistence
 * @see HorarioTrabajoUtil
 * @generated
 */
public class HorarioTrabajoPersistenceImpl extends BasePersistenceImpl<HorarioTrabajo>
    implements HorarioTrabajoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link HorarioTrabajoUtil} to access the horario trabajo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = HorarioTrabajoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
            HorarioTrabajoModelImpl.FINDER_CACHE_ENABLED,
            HorarioTrabajoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
            HorarioTrabajoModelImpl.FINDER_CACHE_ENABLED,
            HorarioTrabajoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
            HorarioTrabajoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_HORARIOTRABAJO = "SELECT horarioTrabajo FROM HorarioTrabajo horarioTrabajo";
    private static final String _SQL_COUNT_HORARIOTRABAJO = "SELECT COUNT(horarioTrabajo) FROM HorarioTrabajo horarioTrabajo";
    private static final String _ORDER_BY_ENTITY_ALIAS = "horarioTrabajo.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HorarioTrabajo exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(HorarioTrabajoPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idHorario", "horaInicio", "horaFin", "horaInicioTarde",
                "horaFinTarde", "duracionCitas"
            });
    private static HorarioTrabajo _nullHorarioTrabajo = new HorarioTrabajoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<HorarioTrabajo> toCacheModel() {
                return _nullHorarioTrabajoCacheModel;
            }
        };

    private static CacheModel<HorarioTrabajo> _nullHorarioTrabajoCacheModel = new CacheModel<HorarioTrabajo>() {
            @Override
            public HorarioTrabajo toEntityModel() {
                return _nullHorarioTrabajo;
            }
        };

    public HorarioTrabajoPersistenceImpl() {
        setModelClass(HorarioTrabajo.class);
    }

    /**
     * Caches the horario trabajo in the entity cache if it is enabled.
     *
     * @param horarioTrabajo the horario trabajo
     */
    @Override
    public void cacheResult(HorarioTrabajo horarioTrabajo) {
        EntityCacheUtil.putResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
            HorarioTrabajoImpl.class, horarioTrabajo.getPrimaryKey(),
            horarioTrabajo);

        horarioTrabajo.resetOriginalValues();
    }

    /**
     * Caches the horario trabajos in the entity cache if it is enabled.
     *
     * @param horarioTrabajos the horario trabajos
     */
    @Override
    public void cacheResult(List<HorarioTrabajo> horarioTrabajos) {
        for (HorarioTrabajo horarioTrabajo : horarioTrabajos) {
            if (EntityCacheUtil.getResult(
                        HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
                        HorarioTrabajoImpl.class, horarioTrabajo.getPrimaryKey()) == null) {
                cacheResult(horarioTrabajo);
            } else {
                horarioTrabajo.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all horario trabajos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(HorarioTrabajoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(HorarioTrabajoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the horario trabajo.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HorarioTrabajo horarioTrabajo) {
        EntityCacheUtil.removeResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
            HorarioTrabajoImpl.class, horarioTrabajo.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<HorarioTrabajo> horarioTrabajos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (HorarioTrabajo horarioTrabajo : horarioTrabajos) {
            EntityCacheUtil.removeResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
                HorarioTrabajoImpl.class, horarioTrabajo.getPrimaryKey());
        }
    }

    /**
     * Creates a new horario trabajo with the primary key. Does not add the horario trabajo to the database.
     *
     * @param idHorario the primary key for the new horario trabajo
     * @return the new horario trabajo
     */
    @Override
    public HorarioTrabajo create(int idHorario) {
        HorarioTrabajo horarioTrabajo = new HorarioTrabajoImpl();

        horarioTrabajo.setNew(true);
        horarioTrabajo.setPrimaryKey(idHorario);

        return horarioTrabajo;
    }

    /**
     * Removes the horario trabajo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idHorario the primary key of the horario trabajo
     * @return the horario trabajo that was removed
     * @throws com.proyecto.citas.NoSuchHorarioTrabajoException if a horario trabajo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HorarioTrabajo remove(int idHorario)
        throws NoSuchHorarioTrabajoException, SystemException {
        return remove((Serializable) idHorario);
    }

    /**
     * Removes the horario trabajo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the horario trabajo
     * @return the horario trabajo that was removed
     * @throws com.proyecto.citas.NoSuchHorarioTrabajoException if a horario trabajo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HorarioTrabajo remove(Serializable primaryKey)
        throws NoSuchHorarioTrabajoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            HorarioTrabajo horarioTrabajo = (HorarioTrabajo) session.get(HorarioTrabajoImpl.class,
                    primaryKey);

            if (horarioTrabajo == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHorarioTrabajoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(horarioTrabajo);
        } catch (NoSuchHorarioTrabajoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HorarioTrabajo removeImpl(HorarioTrabajo horarioTrabajo)
        throws SystemException {
        horarioTrabajo = toUnwrappedModel(horarioTrabajo);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(horarioTrabajo)) {
                horarioTrabajo = (HorarioTrabajo) session.get(HorarioTrabajoImpl.class,
                        horarioTrabajo.getPrimaryKeyObj());
            }

            if (horarioTrabajo != null) {
                session.delete(horarioTrabajo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (horarioTrabajo != null) {
            clearCache(horarioTrabajo);
        }

        return horarioTrabajo;
    }

    @Override
    public HorarioTrabajo updateImpl(
        com.proyecto.citas.model.HorarioTrabajo horarioTrabajo)
        throws SystemException {
        horarioTrabajo = toUnwrappedModel(horarioTrabajo);

        boolean isNew = horarioTrabajo.isNew();

        Session session = null;

        try {
            session = openSession();

            if (horarioTrabajo.isNew()) {
                session.save(horarioTrabajo);

                horarioTrabajo.setNew(false);
            } else {
                session.merge(horarioTrabajo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
            HorarioTrabajoImpl.class, horarioTrabajo.getPrimaryKey(),
            horarioTrabajo);

        return horarioTrabajo;
    }

    protected HorarioTrabajo toUnwrappedModel(HorarioTrabajo horarioTrabajo) {
        if (horarioTrabajo instanceof HorarioTrabajoImpl) {
            return horarioTrabajo;
        }

        HorarioTrabajoImpl horarioTrabajoImpl = new HorarioTrabajoImpl();

        horarioTrabajoImpl.setNew(horarioTrabajo.isNew());
        horarioTrabajoImpl.setPrimaryKey(horarioTrabajo.getPrimaryKey());

        horarioTrabajoImpl.setIdHorario(horarioTrabajo.getIdHorario());
        horarioTrabajoImpl.setHoraInicio(horarioTrabajo.getHoraInicio());
        horarioTrabajoImpl.setHoraFin(horarioTrabajo.getHoraFin());
        horarioTrabajoImpl.setHoraInicioTarde(horarioTrabajo.getHoraInicioTarde());
        horarioTrabajoImpl.setHoraFinTarde(horarioTrabajo.getHoraFinTarde());
        horarioTrabajoImpl.setDuracionCitas(horarioTrabajo.getDuracionCitas());

        return horarioTrabajoImpl;
    }

    /**
     * Returns the horario trabajo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the horario trabajo
     * @return the horario trabajo
     * @throws com.proyecto.citas.NoSuchHorarioTrabajoException if a horario trabajo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HorarioTrabajo findByPrimaryKey(Serializable primaryKey)
        throws NoSuchHorarioTrabajoException, SystemException {
        HorarioTrabajo horarioTrabajo = fetchByPrimaryKey(primaryKey);

        if (horarioTrabajo == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHorarioTrabajoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return horarioTrabajo;
    }

    /**
     * Returns the horario trabajo with the primary key or throws a {@link com.proyecto.citas.NoSuchHorarioTrabajoException} if it could not be found.
     *
     * @param idHorario the primary key of the horario trabajo
     * @return the horario trabajo
     * @throws com.proyecto.citas.NoSuchHorarioTrabajoException if a horario trabajo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HorarioTrabajo findByPrimaryKey(int idHorario)
        throws NoSuchHorarioTrabajoException, SystemException {
        return findByPrimaryKey((Serializable) idHorario);
    }

    /**
     * Returns the horario trabajo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the horario trabajo
     * @return the horario trabajo, or <code>null</code> if a horario trabajo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HorarioTrabajo fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        HorarioTrabajo horarioTrabajo = (HorarioTrabajo) EntityCacheUtil.getResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
                HorarioTrabajoImpl.class, primaryKey);

        if (horarioTrabajo == _nullHorarioTrabajo) {
            return null;
        }

        if (horarioTrabajo == null) {
            Session session = null;

            try {
                session = openSession();

                horarioTrabajo = (HorarioTrabajo) session.get(HorarioTrabajoImpl.class,
                        primaryKey);

                if (horarioTrabajo != null) {
                    cacheResult(horarioTrabajo);
                } else {
                    EntityCacheUtil.putResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
                        HorarioTrabajoImpl.class, primaryKey,
                        _nullHorarioTrabajo);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(HorarioTrabajoModelImpl.ENTITY_CACHE_ENABLED,
                    HorarioTrabajoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return horarioTrabajo;
    }

    /**
     * Returns the horario trabajo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idHorario the primary key of the horario trabajo
     * @return the horario trabajo, or <code>null</code> if a horario trabajo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HorarioTrabajo fetchByPrimaryKey(int idHorario)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) idHorario);
    }

    /**
     * Returns all the horario trabajos.
     *
     * @return the horario trabajos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HorarioTrabajo> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the horario trabajos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.HorarioTrabajoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of horario trabajos
     * @param end the upper bound of the range of horario trabajos (not inclusive)
     * @return the range of horario trabajos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HorarioTrabajo> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the horario trabajos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.HorarioTrabajoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of horario trabajos
     * @param end the upper bound of the range of horario trabajos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of horario trabajos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<HorarioTrabajo> findAll(int start, int end,
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

        List<HorarioTrabajo> list = (List<HorarioTrabajo>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_HORARIOTRABAJO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_HORARIOTRABAJO;

                if (pagination) {
                    sql = sql.concat(HorarioTrabajoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<HorarioTrabajo>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<HorarioTrabajo>(list);
                } else {
                    list = (List<HorarioTrabajo>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the horario trabajos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (HorarioTrabajo horarioTrabajo : findAll()) {
            remove(horarioTrabajo);
        }
    }

    /**
     * Returns the number of horario trabajos.
     *
     * @return the number of horario trabajos
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

                Query q = session.createQuery(_SQL_COUNT_HORARIOTRABAJO);

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
     * Initializes the horario trabajo persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.citas.model.HorarioTrabajo")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<HorarioTrabajo>> listenersList = new ArrayList<ModelListener<HorarioTrabajo>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<HorarioTrabajo>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(HorarioTrabajoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
