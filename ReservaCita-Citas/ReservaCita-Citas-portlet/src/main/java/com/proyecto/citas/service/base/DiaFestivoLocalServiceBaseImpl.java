package com.proyecto.citas.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.proyecto.citas.model.DiaFestivo;
import com.proyecto.citas.service.DiaFestivoLocalService;
import com.proyecto.citas.service.persistence.CitaPersistence;
import com.proyecto.citas.service.persistence.DiaFestivoPersistence;
import com.proyecto.citas.service.persistence.DiaLibrePersistence;
import com.proyecto.citas.service.persistence.HorarioTrabajoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dia festivo local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.proyecto.citas.service.impl.DiaFestivoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.proyecto.citas.service.impl.DiaFestivoLocalServiceImpl
 * @see com.proyecto.citas.service.DiaFestivoLocalServiceUtil
 * @generated
 */
public abstract class DiaFestivoLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements DiaFestivoLocalService,
        IdentifiableBean {
    @BeanReference(type = com.proyecto.citas.service.CitaLocalService.class)
    protected com.proyecto.citas.service.CitaLocalService citaLocalService;
    @BeanReference(type = CitaPersistence.class)
    protected CitaPersistence citaPersistence;
    @BeanReference(type = com.proyecto.citas.service.DiaFestivoLocalService.class)
    protected com.proyecto.citas.service.DiaFestivoLocalService diaFestivoLocalService;
    @BeanReference(type = DiaFestivoPersistence.class)
    protected DiaFestivoPersistence diaFestivoPersistence;
    @BeanReference(type = com.proyecto.citas.service.DiaLibreLocalService.class)
    protected com.proyecto.citas.service.DiaLibreLocalService diaLibreLocalService;
    @BeanReference(type = DiaLibrePersistence.class)
    protected DiaLibrePersistence diaLibrePersistence;
    @BeanReference(type = com.proyecto.citas.service.HorarioTrabajoLocalService.class)
    protected com.proyecto.citas.service.HorarioTrabajoLocalService horarioTrabajoLocalService;
    @BeanReference(type = HorarioTrabajoPersistence.class)
    protected HorarioTrabajoPersistence horarioTrabajoPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private DiaFestivoLocalServiceClpInvoker _clpInvoker = new DiaFestivoLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.proyecto.citas.service.DiaFestivoLocalServiceUtil} to access the dia festivo local service.
     */

    /**
     * Adds the dia festivo to the database. Also notifies the appropriate model listeners.
     *
     * @param diaFestivo the dia festivo
     * @return the dia festivo that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public DiaFestivo addDiaFestivo(DiaFestivo diaFestivo)
        throws SystemException {
        diaFestivo.setNew(true);

        return diaFestivoPersistence.update(diaFestivo);
    }

    /**
     * Creates a new dia festivo with the primary key. Does not add the dia festivo to the database.
     *
     * @param idFestivo the primary key for the new dia festivo
     * @return the new dia festivo
     */
    @Override
    public DiaFestivo createDiaFestivo(int idFestivo) {
        return diaFestivoPersistence.create(idFestivo);
    }

    /**
     * Deletes the dia festivo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idFestivo the primary key of the dia festivo
     * @return the dia festivo that was removed
     * @throws PortalException if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public DiaFestivo deleteDiaFestivo(int idFestivo)
        throws PortalException, SystemException {
        return diaFestivoPersistence.remove(idFestivo);
    }

    /**
     * Deletes the dia festivo from the database. Also notifies the appropriate model listeners.
     *
     * @param diaFestivo the dia festivo
     * @return the dia festivo that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public DiaFestivo deleteDiaFestivo(DiaFestivo diaFestivo)
        throws SystemException {
        return diaFestivoPersistence.remove(diaFestivo);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(DiaFestivo.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return diaFestivoPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiaFestivoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return diaFestivoPersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.proyecto.citas.model.impl.DiaFestivoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return diaFestivoPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return diaFestivoPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return diaFestivoPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public DiaFestivo fetchDiaFestivo(int idFestivo) throws SystemException {
        return diaFestivoPersistence.fetchByPrimaryKey(idFestivo);
    }

    /**
     * Returns the dia festivo with the primary key.
     *
     * @param idFestivo the primary key of the dia festivo
     * @return the dia festivo
     * @throws PortalException if a dia festivo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DiaFestivo getDiaFestivo(int idFestivo)
        throws PortalException, SystemException {
        return diaFestivoPersistence.findByPrimaryKey(idFestivo);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return diaFestivoPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<DiaFestivo> getDiaFestivos(int start, int end)
        throws SystemException {
        return diaFestivoPersistence.findAll(start, end);
    }

    /**
     * Returns the number of dia festivos.
     *
     * @return the number of dia festivos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getDiaFestivosCount() throws SystemException {
        return diaFestivoPersistence.countAll();
    }

    /**
     * Updates the dia festivo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param diaFestivo the dia festivo
     * @return the dia festivo that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public DiaFestivo updateDiaFestivo(DiaFestivo diaFestivo)
        throws SystemException {
        return diaFestivoPersistence.update(diaFestivo);
    }

    /**
     * Returns the cita local service.
     *
     * @return the cita local service
     */
    public com.proyecto.citas.service.CitaLocalService getCitaLocalService() {
        return citaLocalService;
    }

    /**
     * Sets the cita local service.
     *
     * @param citaLocalService the cita local service
     */
    public void setCitaLocalService(
        com.proyecto.citas.service.CitaLocalService citaLocalService) {
        this.citaLocalService = citaLocalService;
    }

    /**
     * Returns the cita persistence.
     *
     * @return the cita persistence
     */
    public CitaPersistence getCitaPersistence() {
        return citaPersistence;
    }

    /**
     * Sets the cita persistence.
     *
     * @param citaPersistence the cita persistence
     */
    public void setCitaPersistence(CitaPersistence citaPersistence) {
        this.citaPersistence = citaPersistence;
    }

    /**
     * Returns the dia festivo local service.
     *
     * @return the dia festivo local service
     */
    public com.proyecto.citas.service.DiaFestivoLocalService getDiaFestivoLocalService() {
        return diaFestivoLocalService;
    }

    /**
     * Sets the dia festivo local service.
     *
     * @param diaFestivoLocalService the dia festivo local service
     */
    public void setDiaFestivoLocalService(
        com.proyecto.citas.service.DiaFestivoLocalService diaFestivoLocalService) {
        this.diaFestivoLocalService = diaFestivoLocalService;
    }

    /**
     * Returns the dia festivo persistence.
     *
     * @return the dia festivo persistence
     */
    public DiaFestivoPersistence getDiaFestivoPersistence() {
        return diaFestivoPersistence;
    }

    /**
     * Sets the dia festivo persistence.
     *
     * @param diaFestivoPersistence the dia festivo persistence
     */
    public void setDiaFestivoPersistence(
        DiaFestivoPersistence diaFestivoPersistence) {
        this.diaFestivoPersistence = diaFestivoPersistence;
    }

    /**
     * Returns the dia libre local service.
     *
     * @return the dia libre local service
     */
    public com.proyecto.citas.service.DiaLibreLocalService getDiaLibreLocalService() {
        return diaLibreLocalService;
    }

    /**
     * Sets the dia libre local service.
     *
     * @param diaLibreLocalService the dia libre local service
     */
    public void setDiaLibreLocalService(
        com.proyecto.citas.service.DiaLibreLocalService diaLibreLocalService) {
        this.diaLibreLocalService = diaLibreLocalService;
    }

    /**
     * Returns the dia libre persistence.
     *
     * @return the dia libre persistence
     */
    public DiaLibrePersistence getDiaLibrePersistence() {
        return diaLibrePersistence;
    }

    /**
     * Sets the dia libre persistence.
     *
     * @param diaLibrePersistence the dia libre persistence
     */
    public void setDiaLibrePersistence(DiaLibrePersistence diaLibrePersistence) {
        this.diaLibrePersistence = diaLibrePersistence;
    }

    /**
     * Returns the horario trabajo local service.
     *
     * @return the horario trabajo local service
     */
    public com.proyecto.citas.service.HorarioTrabajoLocalService getHorarioTrabajoLocalService() {
        return horarioTrabajoLocalService;
    }

    /**
     * Sets the horario trabajo local service.
     *
     * @param horarioTrabajoLocalService the horario trabajo local service
     */
    public void setHorarioTrabajoLocalService(
        com.proyecto.citas.service.HorarioTrabajoLocalService horarioTrabajoLocalService) {
        this.horarioTrabajoLocalService = horarioTrabajoLocalService;
    }

    /**
     * Returns the horario trabajo persistence.
     *
     * @return the horario trabajo persistence
     */
    public HorarioTrabajoPersistence getHorarioTrabajoPersistence() {
        return horarioTrabajoPersistence;
    }

    /**
     * Sets the horario trabajo persistence.
     *
     * @param horarioTrabajoPersistence the horario trabajo persistence
     */
    public void setHorarioTrabajoPersistence(
        HorarioTrabajoPersistence horarioTrabajoPersistence) {
        this.horarioTrabajoPersistence = horarioTrabajoPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.proyecto.citas.model.DiaFestivo",
            diaFestivoLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.proyecto.citas.model.DiaFestivo");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return DiaFestivo.class;
    }

    protected String getModelClassName() {
        return DiaFestivo.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = diaFestivoPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}