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

import com.proyecto.citas.NoSuchDiaLibreException;
import com.proyecto.citas.model.DiaLibre;
import com.proyecto.citas.model.impl.DiaLibreImpl;
import com.proyecto.citas.model.impl.DiaLibreModelImpl;
import com.proyecto.citas.service.persistence.DiaLibrePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dia libre service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaLibrePersistence
 * @see DiaLibreUtil
 * @generated
 */
public class DiaLibrePersistenceImpl extends BasePersistenceImpl<DiaLibre>
    implements DiaLibrePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DiaLibreUtil} to access the dia libre persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DiaLibreImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
            DiaLibreModelImpl.FINDER_CACHE_ENABLED, DiaLibreImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
            DiaLibreModelImpl.FINDER_CACHE_ENABLED, DiaLibreImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
            DiaLibreModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DIALIBRE = "SELECT diaLibre FROM DiaLibre diaLibre";
    private static final String _SQL_COUNT_DIALIBRE = "SELECT COUNT(diaLibre) FROM DiaLibre diaLibre";
    private static final String _ORDER_BY_ENTITY_ALIAS = "diaLibre.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DiaLibre exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DiaLibrePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idLibre", "dia", "libre", "codigoDia"
            });
    private static DiaLibre _nullDiaLibre = new DiaLibreImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DiaLibre> toCacheModel() {
                return _nullDiaLibreCacheModel;
            }
        };

    private static CacheModel<DiaLibre> _nullDiaLibreCacheModel = new CacheModel<DiaLibre>() {
            @Override
            public DiaLibre toEntityModel() {
                return _nullDiaLibre;
            }
        };

    public DiaLibrePersistenceImpl() {
        setModelClass(DiaLibre.class);
    }

    /**
     * Caches the dia libre in the entity cache if it is enabled.
     *
     * @param diaLibre the dia libre
     */
    @Override
    public void cacheResult(DiaLibre diaLibre) {
        EntityCacheUtil.putResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
            DiaLibreImpl.class, diaLibre.getPrimaryKey(), diaLibre);

        diaLibre.resetOriginalValues();
    }

    /**
     * Caches the dia libres in the entity cache if it is enabled.
     *
     * @param diaLibres the dia libres
     */
    @Override
    public void cacheResult(List<DiaLibre> diaLibres) {
        for (DiaLibre diaLibre : diaLibres) {
            if (EntityCacheUtil.getResult(
                        DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
                        DiaLibreImpl.class, diaLibre.getPrimaryKey()) == null) {
                cacheResult(diaLibre);
            } else {
                diaLibre.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all dia libres.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DiaLibreImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DiaLibreImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the dia libre.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DiaLibre diaLibre) {
        EntityCacheUtil.removeResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
            DiaLibreImpl.class, diaLibre.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<DiaLibre> diaLibres) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DiaLibre diaLibre : diaLibres) {
            EntityCacheUtil.removeResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
                DiaLibreImpl.class, diaLibre.getPrimaryKey());
        }
    }

    /**
     * Creates a new dia libre with the primary key. Does not add the dia libre to the database.
     *
     * @param idLibre the primary key for the new dia libre
     * @return the new dia libre
     */
    @Override
    public DiaLibre create(int idLibre) {
        DiaLibre diaLibre = new DiaLibreImpl();

        diaLibre.setNew(true);
        diaLibre.setPrimaryKey(idLibre);

        return diaLibre;
    }

    /**
     * Removes the dia libre with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idLibre the primary key of the dia libre
     * @return the dia libre that was removed
     * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaLibre remove(int idLibre)
        throws NoSuchDiaLibreException, SystemException {
        return remove((Serializable) idLibre);
    }

    /**
     * Removes the dia libre with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the dia libre
     * @return the dia libre that was removed
     * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaLibre remove(Serializable primaryKey)
        throws NoSuchDiaLibreException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DiaLibre diaLibre = (DiaLibre) session.get(DiaLibreImpl.class,
                    primaryKey);

            if (diaLibre == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDiaLibreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(diaLibre);
        } catch (NoSuchDiaLibreException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DiaLibre removeImpl(DiaLibre diaLibre) throws SystemException {
        diaLibre = toUnwrappedModel(diaLibre);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(diaLibre)) {
                diaLibre = (DiaLibre) session.get(DiaLibreImpl.class,
                        diaLibre.getPrimaryKeyObj());
            }

            if (diaLibre != null) {
                session.delete(diaLibre);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (diaLibre != null) {
            clearCache(diaLibre);
        }

        return diaLibre;
    }

    @Override
    public DiaLibre updateImpl(com.proyecto.citas.model.DiaLibre diaLibre)
        throws SystemException {
        diaLibre = toUnwrappedModel(diaLibre);

        boolean isNew = diaLibre.isNew();

        Session session = null;

        try {
            session = openSession();

            if (diaLibre.isNew()) {
                session.save(diaLibre);

                diaLibre.setNew(false);
            } else {
                session.merge(diaLibre);
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

        EntityCacheUtil.putResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
            DiaLibreImpl.class, diaLibre.getPrimaryKey(), diaLibre);

        return diaLibre;
    }

    protected DiaLibre toUnwrappedModel(DiaLibre diaLibre) {
        if (diaLibre instanceof DiaLibreImpl) {
            return diaLibre;
        }

        DiaLibreImpl diaLibreImpl = new DiaLibreImpl();

        diaLibreImpl.setNew(diaLibre.isNew());
        diaLibreImpl.setPrimaryKey(diaLibre.getPrimaryKey());

        diaLibreImpl.setIdLibre(diaLibre.getIdLibre());
        diaLibreImpl.setDia(diaLibre.getDia());
        diaLibreImpl.setLibre(diaLibre.getLibre());
        diaLibreImpl.setCodigoDia(diaLibre.getCodigoDia());

        return diaLibreImpl;
    }

    /**
     * Returns the dia libre with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the dia libre
     * @return the dia libre
     * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaLibre findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDiaLibreException, SystemException {
        DiaLibre diaLibre = fetchByPrimaryKey(primaryKey);

        if (diaLibre == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDiaLibreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return diaLibre;
    }

    /**
     * Returns the dia libre with the primary key or throws a {@link com.proyecto.citas.NoSuchDiaLibreException} if it could not be found.
     *
     * @param idLibre the primary key of the dia libre
     * @return the dia libre
     * @throws com.proyecto.citas.NoSuchDiaLibreException if a dia libre with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaLibre findByPrimaryKey(int idLibre)
        throws NoSuchDiaLibreException, SystemException {
        return findByPrimaryKey((Serializable) idLibre);
    }

    /**
     * Returns the dia libre with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the dia libre
     * @return the dia libre, or <code>null</code> if a dia libre with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaLibre fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DiaLibre diaLibre = (DiaLibre) EntityCacheUtil.getResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
                DiaLibreImpl.class, primaryKey);

        if (diaLibre == _nullDiaLibre) {
            return null;
        }

        if (diaLibre == null) {
            Session session = null;

            try {
                session = openSession();

                diaLibre = (DiaLibre) session.get(DiaLibreImpl.class, primaryKey);

                if (diaLibre != null) {
                    cacheResult(diaLibre);
                } else {
                    EntityCacheUtil.putResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
                        DiaLibreImpl.class, primaryKey, _nullDiaLibre);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DiaLibreModelImpl.ENTITY_CACHE_ENABLED,
                    DiaLibreImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return diaLibre;
    }

    /**
     * Returns the dia libre with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idLibre the primary key of the dia libre
     * @return the dia libre, or <code>null</code> if a dia libre with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaLibre fetchByPrimaryKey(int idLibre) throws SystemException {
        return fetchByPrimaryKey((Serializable) idLibre);
    }

    /**
     * Returns all the dia libres.
     *
     * @return the dia libres
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DiaLibre> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<DiaLibre> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<DiaLibre> findAll(int start, int end,
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

        List<DiaLibre> list = (List<DiaLibre>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DIALIBRE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DIALIBRE;

                if (pagination) {
                    sql = sql.concat(DiaLibreModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DiaLibre>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DiaLibre>(list);
                } else {
                    list = (List<DiaLibre>) QueryUtil.list(q, getDialect(),
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
     * Removes all the dia libres from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DiaLibre diaLibre : findAll()) {
            remove(diaLibre);
        }
    }

    /**
     * Returns the number of dia libres.
     *
     * @return the number of dia libres
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

                Query q = session.createQuery(_SQL_COUNT_DIALIBRE);

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
     * Initializes the dia libre persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.proyecto.citas.model.DiaLibre")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DiaLibre>> listenersList = new ArrayList<ModelListener<DiaLibre>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DiaLibre>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DiaLibreImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
