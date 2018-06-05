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

import com.proyecto.citas.NoSuchDiasLibresException;
import com.proyecto.citas.model.DiasLibres;
import com.proyecto.citas.model.impl.DiasLibresImpl;
import com.proyecto.citas.model.impl.DiasLibresModelImpl;
import com.proyecto.citas.service.persistence.DiasLibresPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dias libres service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasLibresPersistence
 * @see DiasLibresUtil
 * @generated
 */
public class DiasLibresPersistenceImpl extends BasePersistenceImpl<DiasLibres>
    implements DiasLibresPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DiasLibresUtil} to access the dias libres persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DiasLibresImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
            DiasLibresModelImpl.FINDER_CACHE_ENABLED, DiasLibresImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
            DiasLibresModelImpl.FINDER_CACHE_ENABLED, DiasLibresImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
            DiasLibresModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DIASLIBRES = "SELECT diasLibres FROM DiasLibres diasLibres";
    private static final String _SQL_COUNT_DIASLIBRES = "SELECT COUNT(diasLibres) FROM DiasLibres diasLibres";
    private static final String _ORDER_BY_ENTITY_ALIAS = "diasLibres.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DiasLibres exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DiasLibresPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "dia", "libre"
            });
    private static DiasLibres _nullDiasLibres = new DiasLibresImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DiasLibres> toCacheModel() {
                return _nullDiasLibresCacheModel;
            }
        };

    private static CacheModel<DiasLibres> _nullDiasLibresCacheModel = new CacheModel<DiasLibres>() {
            @Override
            public DiasLibres toEntityModel() {
                return _nullDiasLibres;
            }
        };

    public DiasLibresPersistenceImpl() {
        setModelClass(DiasLibres.class);
    }

    /**
     * Caches the dias libres in the entity cache if it is enabled.
     *
     * @param diasLibres the dias libres
     */
    @Override
    public void cacheResult(DiasLibres diasLibres) {
        EntityCacheUtil.putResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
            DiasLibresImpl.class, diasLibres.getPrimaryKey(), diasLibres);

        diasLibres.resetOriginalValues();
    }

    /**
     * Caches the dias libreses in the entity cache if it is enabled.
     *
     * @param diasLibreses the dias libreses
     */
    @Override
    public void cacheResult(List<DiasLibres> diasLibreses) {
        for (DiasLibres diasLibres : diasLibreses) {
            if (EntityCacheUtil.getResult(
                        DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
                        DiasLibresImpl.class, diasLibres.getPrimaryKey()) == null) {
                cacheResult(diasLibres);
            } else {
                diasLibres.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all dias libreses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DiasLibresImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DiasLibresImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the dias libres.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DiasLibres diasLibres) {
        EntityCacheUtil.removeResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
            DiasLibresImpl.class, diasLibres.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<DiasLibres> diasLibreses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DiasLibres diasLibres : diasLibreses) {
            EntityCacheUtil.removeResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
                DiasLibresImpl.class, diasLibres.getPrimaryKey());
        }
    }

    /**
     * Creates a new dias libres with the primary key. Does not add the dias libres to the database.
     *
     * @param dia the primary key for the new dias libres
     * @return the new dias libres
     */
    @Override
    public DiasLibres create(String dia) {
        DiasLibres diasLibres = new DiasLibresImpl();

        diasLibres.setNew(true);
        diasLibres.setPrimaryKey(dia);

        return diasLibres;
    }

    /**
     * Removes the dias libres with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param dia the primary key of the dias libres
     * @return the dias libres that was removed
     * @throws com.proyecto.citas.NoSuchDiasLibresException if a dias libres with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasLibres remove(String dia)
        throws NoSuchDiasLibresException, SystemException {
        return remove((Serializable) dia);
    }

    /**
     * Removes the dias libres with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the dias libres
     * @return the dias libres that was removed
     * @throws com.proyecto.citas.NoSuchDiasLibresException if a dias libres with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasLibres remove(Serializable primaryKey)
        throws NoSuchDiasLibresException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DiasLibres diasLibres = (DiasLibres) session.get(DiasLibresImpl.class,
                    primaryKey);

            if (diasLibres == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDiasLibresException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(diasLibres);
        } catch (NoSuchDiasLibresException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DiasLibres removeImpl(DiasLibres diasLibres)
        throws SystemException {
        diasLibres = toUnwrappedModel(diasLibres);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(diasLibres)) {
                diasLibres = (DiasLibres) session.get(DiasLibresImpl.class,
                        diasLibres.getPrimaryKeyObj());
            }

            if (diasLibres != null) {
                session.delete(diasLibres);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (diasLibres != null) {
            clearCache(diasLibres);
        }

        return diasLibres;
    }

    @Override
    public DiasLibres updateImpl(com.proyecto.citas.model.DiasLibres diasLibres)
        throws SystemException {
        diasLibres = toUnwrappedModel(diasLibres);

        boolean isNew = diasLibres.isNew();

        Session session = null;

        try {
            session = openSession();

            if (diasLibres.isNew()) {
                session.save(diasLibres);

                diasLibres.setNew(false);
            } else {
                session.merge(diasLibres);
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

        EntityCacheUtil.putResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
            DiasLibresImpl.class, diasLibres.getPrimaryKey(), diasLibres);

        return diasLibres;
    }

    protected DiasLibres toUnwrappedModel(DiasLibres diasLibres) {
        if (diasLibres instanceof DiasLibresImpl) {
            return diasLibres;
        }

        DiasLibresImpl diasLibresImpl = new DiasLibresImpl();

        diasLibresImpl.setNew(diasLibres.isNew());
        diasLibresImpl.setPrimaryKey(diasLibres.getPrimaryKey());

        diasLibresImpl.setDia(diasLibres.getDia());
        diasLibresImpl.setLibre(diasLibres.getLibre());

        return diasLibresImpl;
    }

    /**
     * Returns the dias libres with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the dias libres
     * @return the dias libres
     * @throws com.proyecto.citas.NoSuchDiasLibresException if a dias libres with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasLibres findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDiasLibresException, SystemException {
        DiasLibres diasLibres = fetchByPrimaryKey(primaryKey);

        if (diasLibres == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDiasLibresException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return diasLibres;
    }

    /**
     * Returns the dias libres with the primary key or throws a {@link com.proyecto.citas.NoSuchDiasLibresException} if it could not be found.
     *
     * @param dia the primary key of the dias libres
     * @return the dias libres
     * @throws com.proyecto.citas.NoSuchDiasLibresException if a dias libres with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasLibres findByPrimaryKey(String dia)
        throws NoSuchDiasLibresException, SystemException {
        return findByPrimaryKey((Serializable) dia);
    }

    /**
     * Returns the dias libres with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the dias libres
     * @return the dias libres, or <code>null</code> if a dias libres with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasLibres fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DiasLibres diasLibres = (DiasLibres) EntityCacheUtil.getResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
                DiasLibresImpl.class, primaryKey);

        if (diasLibres == _nullDiasLibres) {
            return null;
        }

        if (diasLibres == null) {
            Session session = null;

            try {
                session = openSession();

                diasLibres = (DiasLibres) session.get(DiasLibresImpl.class,
                        primaryKey);

                if (diasLibres != null) {
                    cacheResult(diasLibres);
                } else {
                    EntityCacheUtil.putResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
                        DiasLibresImpl.class, primaryKey, _nullDiasLibres);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DiasLibresModelImpl.ENTITY_CACHE_ENABLED,
                    DiasLibresImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return diasLibres;
    }

    /**
     * Returns the dias libres with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param dia the primary key of the dias libres
     * @return the dias libres, or <code>null</code> if a dias libres with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiasLibres fetchByPrimaryKey(String dia) throws SystemException {
        return fetchByPrimaryKey((Serializable) dia);
    }

    /**
     * Returns all the dias libreses.
     *
     * @return the dias libreses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DiasLibres> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the dias libreses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasLibresModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of dias libreses
     * @param end the upper bound of the range of dias libreses (not inclusive)
     * @return the range of dias libreses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DiasLibres> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the dias libreses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiasLibresModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of dias libreses
     * @param end the upper bound of the range of dias libreses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of dias libreses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DiasLibres> findAll(int start, int end,
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

        List<DiasLibres> list = (List<DiasLibres>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DIASLIBRES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DIASLIBRES;

                if (pagination) {
                    sql = sql.concat(DiasLibresModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DiasLibres>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DiasLibres>(list);
                } else {
                    list = (List<DiasLibres>) QueryUtil.list(q, getDialect(),
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
     * Removes all the dias libreses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DiasLibres diasLibres : findAll()) {
            remove(diasLibres);
        }
    }

    /**
     * Returns the number of dias libreses.
     *
     * @return the number of dias libreses
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

                Query q = session.createQuery(_SQL_COUNT_DIASLIBRES);

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
     * Initializes the dias libres persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.citas.model.DiasLibres")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DiasLibres>> listenersList = new ArrayList<ModelListener<DiasLibres>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DiasLibres>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DiasLibresImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
