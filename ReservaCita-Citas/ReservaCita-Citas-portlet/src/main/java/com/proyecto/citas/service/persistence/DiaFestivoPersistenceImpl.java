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

import com.proyecto.citas.NoSuchDiaFestivoException;
import com.proyecto.citas.model.DiaFestivo;
import com.proyecto.citas.model.impl.DiaFestivoImpl;
import com.proyecto.citas.model.impl.DiaFestivoModelImpl;
import com.proyecto.citas.service.persistence.DiaFestivoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dia festivo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaFestivoPersistence
 * @see DiaFestivoUtil
 * @generated
 */
public class DiaFestivoPersistenceImpl extends BasePersistenceImpl<DiaFestivo>
    implements DiaFestivoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DiaFestivoUtil} to access the dia festivo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DiaFestivoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
            DiaFestivoModelImpl.FINDER_CACHE_ENABLED, DiaFestivoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
            DiaFestivoModelImpl.FINDER_CACHE_ENABLED, DiaFestivoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
            DiaFestivoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DIAFESTIVO = "SELECT diaFestivo FROM DiaFestivo diaFestivo";
    private static final String _SQL_COUNT_DIAFESTIVO = "SELECT COUNT(diaFestivo) FROM DiaFestivo diaFestivo";
    private static final String _ORDER_BY_ENTITY_ALIAS = "diaFestivo.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DiaFestivo exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DiaFestivoPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idFestivo", "fechaFestivo"
            });
    private static DiaFestivo _nullDiaFestivo = new DiaFestivoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DiaFestivo> toCacheModel() {
                return _nullDiaFestivoCacheModel;
            }
        };

    private static CacheModel<DiaFestivo> _nullDiaFestivoCacheModel = new CacheModel<DiaFestivo>() {
            @Override
            public DiaFestivo toEntityModel() {
                return _nullDiaFestivo;
            }
        };

    public DiaFestivoPersistenceImpl() {
        setModelClass(DiaFestivo.class);
    }

    /**
     * Caches the dia festivo in the entity cache if it is enabled.
     *
     * @param diaFestivo the dia festivo
     */
    @Override
    public void cacheResult(DiaFestivo diaFestivo) {
        EntityCacheUtil.putResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
            DiaFestivoImpl.class, diaFestivo.getPrimaryKey(), diaFestivo);

        diaFestivo.resetOriginalValues();
    }

    /**
     * Caches the dia festivos in the entity cache if it is enabled.
     *
     * @param diaFestivos the dia festivos
     */
    @Override
    public void cacheResult(List<DiaFestivo> diaFestivos) {
        for (DiaFestivo diaFestivo : diaFestivos) {
            if (EntityCacheUtil.getResult(
                        DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
                        DiaFestivoImpl.class, diaFestivo.getPrimaryKey()) == null) {
                cacheResult(diaFestivo);
            } else {
                diaFestivo.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all dia festivos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DiaFestivoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DiaFestivoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the dia festivo.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DiaFestivo diaFestivo) {
        EntityCacheUtil.removeResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
            DiaFestivoImpl.class, diaFestivo.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<DiaFestivo> diaFestivos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DiaFestivo diaFestivo : diaFestivos) {
            EntityCacheUtil.removeResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
                DiaFestivoImpl.class, diaFestivo.getPrimaryKey());
        }
    }

    /**
     * Creates a new dia festivo with the primary key. Does not add the dia festivo to the database.
     *
     * @param idFestivo the primary key for the new dia festivo
     * @return the new dia festivo
     */
    @Override
    public DiaFestivo create(int idFestivo) {
        DiaFestivo diaFestivo = new DiaFestivoImpl();

        diaFestivo.setNew(true);
        diaFestivo.setPrimaryKey(idFestivo);

        return diaFestivo;
    }

    /**
     * Removes the dia festivo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idFestivo the primary key of the dia festivo
     * @return the dia festivo that was removed
     * @throws com.proyecto.citas.NoSuchDiaFestivoException if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo remove(int idFestivo)
        throws NoSuchDiaFestivoException, SystemException {
        return remove((Serializable) idFestivo);
    }

    /**
     * Removes the dia festivo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the dia festivo
     * @return the dia festivo that was removed
     * @throws com.proyecto.citas.NoSuchDiaFestivoException if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo remove(Serializable primaryKey)
        throws NoSuchDiaFestivoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DiaFestivo diaFestivo = (DiaFestivo) session.get(DiaFestivoImpl.class,
                    primaryKey);

            if (diaFestivo == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDiaFestivoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(diaFestivo);
        } catch (NoSuchDiaFestivoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DiaFestivo removeImpl(DiaFestivo diaFestivo)
        throws SystemException {
        diaFestivo = toUnwrappedModel(diaFestivo);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(diaFestivo)) {
                diaFestivo = (DiaFestivo) session.get(DiaFestivoImpl.class,
                        diaFestivo.getPrimaryKeyObj());
            }

            if (diaFestivo != null) {
                session.delete(diaFestivo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (diaFestivo != null) {
            clearCache(diaFestivo);
        }

        return diaFestivo;
    }

    @Override
    public DiaFestivo updateImpl(com.proyecto.citas.model.DiaFestivo diaFestivo)
        throws SystemException {
        diaFestivo = toUnwrappedModel(diaFestivo);

        boolean isNew = diaFestivo.isNew();

        Session session = null;

        try {
            session = openSession();

            if (diaFestivo.isNew()) {
                session.save(diaFestivo);

                diaFestivo.setNew(false);
            } else {
                session.merge(diaFestivo);
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

        EntityCacheUtil.putResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
            DiaFestivoImpl.class, diaFestivo.getPrimaryKey(), diaFestivo);

        return diaFestivo;
    }

    protected DiaFestivo toUnwrappedModel(DiaFestivo diaFestivo) {
        if (diaFestivo instanceof DiaFestivoImpl) {
            return diaFestivo;
        }

        DiaFestivoImpl diaFestivoImpl = new DiaFestivoImpl();

        diaFestivoImpl.setNew(diaFestivo.isNew());
        diaFestivoImpl.setPrimaryKey(diaFestivo.getPrimaryKey());

        diaFestivoImpl.setIdFestivo(diaFestivo.getIdFestivo());
        diaFestivoImpl.setFechaFestivo(diaFestivo.getFechaFestivo());

        return diaFestivoImpl;
    }

    /**
     * Returns the dia festivo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the dia festivo
     * @return the dia festivo
     * @throws com.proyecto.citas.NoSuchDiaFestivoException if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDiaFestivoException, SystemException {
        DiaFestivo diaFestivo = fetchByPrimaryKey(primaryKey);

        if (diaFestivo == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDiaFestivoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return diaFestivo;
    }

    /**
     * Returns the dia festivo with the primary key or throws a {@link com.proyecto.citas.NoSuchDiaFestivoException} if it could not be found.
     *
     * @param idFestivo the primary key of the dia festivo
     * @return the dia festivo
     * @throws com.proyecto.citas.NoSuchDiaFestivoException if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo findByPrimaryKey(int idFestivo)
        throws NoSuchDiaFestivoException, SystemException {
        return findByPrimaryKey((Serializable) idFestivo);
    }

    /**
     * Returns the dia festivo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the dia festivo
     * @return the dia festivo, or <code>null</code> if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DiaFestivo diaFestivo = (DiaFestivo) EntityCacheUtil.getResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
                DiaFestivoImpl.class, primaryKey);

        if (diaFestivo == _nullDiaFestivo) {
            return null;
        }

        if (diaFestivo == null) {
            Session session = null;

            try {
                session = openSession();

                diaFestivo = (DiaFestivo) session.get(DiaFestivoImpl.class,
                        primaryKey);

                if (diaFestivo != null) {
                    cacheResult(diaFestivo);
                } else {
                    EntityCacheUtil.putResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
                        DiaFestivoImpl.class, primaryKey, _nullDiaFestivo);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DiaFestivoModelImpl.ENTITY_CACHE_ENABLED,
                    DiaFestivoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return diaFestivo;
    }

    /**
     * Returns the dia festivo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idFestivo the primary key of the dia festivo
     * @return the dia festivo, or <code>null</code> if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo fetchByPrimaryKey(int idFestivo)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) idFestivo);
    }

    /**
     * Returns all the dia festivos.
     *
     * @return the dia festivos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DiaFestivo> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<DiaFestivo> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<DiaFestivo> findAll(int start, int end,
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

        List<DiaFestivo> list = (List<DiaFestivo>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DIAFESTIVO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DIAFESTIVO;

                if (pagination) {
                    sql = sql.concat(DiaFestivoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DiaFestivo>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DiaFestivo>(list);
                } else {
                    list = (List<DiaFestivo>) QueryUtil.list(q, getDialect(),
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
     * Removes all the dia festivos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DiaFestivo diaFestivo : findAll()) {
            remove(diaFestivo);
        }
    }

    /**
     * Returns the number of dia festivos.
     *
     * @return the number of dia festivos
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

                Query q = session.createQuery(_SQL_COUNT_DIAFESTIVO);

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
     * Initializes the dia festivo persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.citas.model.DiaFestivo")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DiaFestivo>> listenersList = new ArrayList<ModelListener<DiaFestivo>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DiaFestivo>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DiaFestivoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
