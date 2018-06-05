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

import com.proyecto.citas.NoSuchDiasFestivosException;
import com.proyecto.citas.model.DiasFestivos;
import com.proyecto.citas.model.impl.DiasFestivosImpl;
import com.proyecto.citas.model.impl.DiasFestivosModelImpl;
import com.proyecto.citas.service.persistence.DiasFestivosPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dias festivos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivosPersistence
 * @see DiasFestivosUtil
 * @generated
 */
public class DiasFestivosPersistenceImpl extends BasePersistenceImpl<DiasFestivos>
    implements DiasFestivosPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DiasFestivosUtil} to access the dias festivos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DiasFestivosImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
            DiasFestivosModelImpl.FINDER_CACHE_ENABLED, DiasFestivosImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
            DiasFestivosModelImpl.FINDER_CACHE_ENABLED, DiasFestivosImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
            DiasFestivosModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DIASFESTIVOS = "SELECT diasFestivos FROM DiasFestivos diasFestivos";
    private static final String _SQL_COUNT_DIASFESTIVOS = "SELECT COUNT(diasFestivos) FROM DiasFestivos diasFestivos";
    private static final String _ORDER_BY_ENTITY_ALIAS = "diasFestivos.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DiasFestivos exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DiasFestivosPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idFestivo", "fechaFestivo"
            });
    private static DiasFestivos _nullDiasFestivos = new DiasFestivosImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DiasFestivos> toCacheModel() {
                return _nullDiasFestivosCacheModel;
            }
        };

    private static CacheModel<DiasFestivos> _nullDiasFestivosCacheModel = new CacheModel<DiasFestivos>() {
            @Override
            public DiasFestivos toEntityModel() {
                return _nullDiasFestivos;
            }
        };

    public DiasFestivosPersistenceImpl() {
        setModelClass(DiasFestivos.class);
    }

    /**
     * Caches the dias festivos in the entity cache if it is enabled.
     *
     * @param diasFestivos the dias festivos
     */
    @Override
    public void cacheResult(DiasFestivos diasFestivos) {
        EntityCacheUtil.putResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
            DiasFestivosImpl.class, diasFestivos.getPrimaryKey(), diasFestivos);

        diasFestivos.resetOriginalValues();
    }

    /**
     * Caches the dias festivoses in the entity cache if it is enabled.
     *
     * @param diasFestivoses the dias festivoses
     */
    @Override
    public void cacheResult(List<DiasFestivos> diasFestivoses) {
        for (DiasFestivos diasFestivos : diasFestivoses) {
            if (EntityCacheUtil.getResult(
                        DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
                        DiasFestivosImpl.class, diasFestivos.getPrimaryKey()) == null) {
                cacheResult(diasFestivos);
            } else {
                diasFestivos.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all dias festivoses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DiasFestivosImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DiasFestivosImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the dias festivos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DiasFestivos diasFestivos) {
        EntityCacheUtil.removeResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
            DiasFestivosImpl.class, diasFestivos.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<DiasFestivos> diasFestivoses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DiasFestivos diasFestivos : diasFestivoses) {
            EntityCacheUtil.removeResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
                DiasFestivosImpl.class, diasFestivos.getPrimaryKey());
        }
    }

    /**
     * Creates a new dias festivos with the primary key. Does not add the dias festivos to the database.
     *
     * @param idFestivo the primary key for the new dias festivos
     * @return the new dias festivos
     */
    @Override
    public DiasFestivos create(int idFestivo) {
        DiasFestivos diasFestivos = new DiasFestivosImpl();

        diasFestivos.setNew(true);
        diasFestivos.setPrimaryKey(idFestivo);

        return diasFestivos;
    }

    /**
     * Removes the dias festivos with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idFestivo the primary key of the dias festivos
     * @return the dias festivos that was removed
     * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasFestivos remove(int idFestivo)
        throws NoSuchDiasFestivosException, SystemException {
        return remove((Serializable) idFestivo);
    }

    /**
     * Removes the dias festivos with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the dias festivos
     * @return the dias festivos that was removed
     * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasFestivos remove(Serializable primaryKey)
        throws NoSuchDiasFestivosException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DiasFestivos diasFestivos = (DiasFestivos) session.get(DiasFestivosImpl.class,
                    primaryKey);

            if (diasFestivos == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDiasFestivosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(diasFestivos);
        } catch (NoSuchDiasFestivosException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DiasFestivos removeImpl(DiasFestivos diasFestivos)
        throws SystemException {
        diasFestivos = toUnwrappedModel(diasFestivos);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(diasFestivos)) {
                diasFestivos = (DiasFestivos) session.get(DiasFestivosImpl.class,
                        diasFestivos.getPrimaryKeyObj());
            }

            if (diasFestivos != null) {
                session.delete(diasFestivos);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (diasFestivos != null) {
            clearCache(diasFestivos);
        }

        return diasFestivos;
    }

    @Override
    public DiasFestivos updateImpl(
        com.proyecto.citas.model.DiasFestivos diasFestivos)
        throws SystemException {
        diasFestivos = toUnwrappedModel(diasFestivos);

        boolean isNew = diasFestivos.isNew();

        Session session = null;

        try {
            session = openSession();

            if (diasFestivos.isNew()) {
                session.save(diasFestivos);

                diasFestivos.setNew(false);
            } else {
                session.merge(diasFestivos);
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

        EntityCacheUtil.putResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
            DiasFestivosImpl.class, diasFestivos.getPrimaryKey(), diasFestivos);

        return diasFestivos;
    }

    protected DiasFestivos toUnwrappedModel(DiasFestivos diasFestivos) {
        if (diasFestivos instanceof DiasFestivosImpl) {
            return diasFestivos;
        }

        DiasFestivosImpl diasFestivosImpl = new DiasFestivosImpl();

        diasFestivosImpl.setNew(diasFestivos.isNew());
        diasFestivosImpl.setPrimaryKey(diasFestivos.getPrimaryKey());

        diasFestivosImpl.setIdFestivo(diasFestivos.getIdFestivo());
        diasFestivosImpl.setFechaFestivo(diasFestivos.getFechaFestivo());

        return diasFestivosImpl;
    }

    /**
     * Returns the dias festivos with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the dias festivos
     * @return the dias festivos
     * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasFestivos findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDiasFestivosException, SystemException {
        DiasFestivos diasFestivos = fetchByPrimaryKey(primaryKey);

        if (diasFestivos == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDiasFestivosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return diasFestivos;
    }

    /**
     * Returns the dias festivos with the primary key or throws a {@link com.proyecto.citas.NoSuchDiasFestivosException} if it could not be found.
     *
     * @param idFestivo the primary key of the dias festivos
     * @return the dias festivos
     * @throws com.proyecto.citas.NoSuchDiasFestivosException if a dias festivos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasFestivos findByPrimaryKey(int idFestivo)
        throws NoSuchDiasFestivosException, SystemException {
        return findByPrimaryKey((Serializable) idFestivo);
    }

    /**
     * Returns the dias festivos with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the dias festivos
     * @return the dias festivos, or <code>null</code> if a dias festivos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasFestivos fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DiasFestivos diasFestivos = (DiasFestivos) EntityCacheUtil.getResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
                DiasFestivosImpl.class, primaryKey);

        if (diasFestivos == _nullDiasFestivos) {
            return null;
        }

        if (diasFestivos == null) {
            Session session = null;

            try {
                session = openSession();

                diasFestivos = (DiasFestivos) session.get(DiasFestivosImpl.class,
                        primaryKey);

                if (diasFestivos != null) {
                    cacheResult(diasFestivos);
                } else {
                    EntityCacheUtil.putResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
                        DiasFestivosImpl.class, primaryKey, _nullDiasFestivos);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DiasFestivosModelImpl.ENTITY_CACHE_ENABLED,
                    DiasFestivosImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return diasFestivos;
    }

    /**
     * Returns the dias festivos with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idFestivo the primary key of the dias festivos
     * @return the dias festivos, or <code>null</code> if a dias festivos with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasFestivos fetchByPrimaryKey(int idFestivo)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) idFestivo);
    }

    /**
     * Returns all the dias festivoses.
     *
     * @return the dias festivoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DiasFestivos> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<DiasFestivos> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<DiasFestivos> findAll(int start, int end,
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

        List<DiasFestivos> list = (List<DiasFestivos>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DIASFESTIVOS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DIASFESTIVOS;

                if (pagination) {
                    sql = sql.concat(DiasFestivosModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DiasFestivos>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DiasFestivos>(list);
                } else {
                    list = (List<DiasFestivos>) QueryUtil.list(q, getDialect(),
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
     * Removes all the dias festivoses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DiasFestivos diasFestivos : findAll()) {
            remove(diasFestivos);
        }
    }

    /**
     * Returns the number of dias festivoses.
     *
     * @return the number of dias festivoses
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

                Query q = session.createQuery(_SQL_COUNT_DIASFESTIVOS);

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
     * Initializes the dias festivos persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.citas.model.DiasFestivos")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DiasFestivos>> listenersList = new ArrayList<ModelListener<DiasFestivos>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DiasFestivos>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DiasFestivosImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
