package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.citas.model.DiasFestivos;
import com.proyecto.citas.model.DiasFestivosModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DiasFestivos service. Represents a row in the &quot;RES_DIAS_FESTIVOS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.proyecto.citas.model.DiasFestivosModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiasFestivosImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivosImpl
 * @see com.proyecto.citas.model.DiasFestivos
 * @see com.proyecto.citas.model.DiasFestivosModel
 * @generated
 */
public class DiasFestivosModelImpl extends BaseModelImpl<DiasFestivos>
    implements DiasFestivosModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a dias festivos model instance should use the {@link com.proyecto.citas.model.DiasFestivos} interface instead.
     */
    public static final String TABLE_NAME = "RES_DIAS_FESTIVOS";
    public static final Object[][] TABLE_COLUMNS = {
            { "ID_FESTIVO", Types.INTEGER },
            { "F_FECHA_FFESTIVO", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table RES_DIAS_FESTIVOS (ID_FESTIVO INTEGER not null primary key,F_FECHA_FFESTIVO DATE null)";
    public static final String TABLE_SQL_DROP = "drop table RES_DIAS_FESTIVOS";
    public static final String ORDER_BY_JPQL = " ORDER BY diasFestivos.idFestivo ASC";
    public static final String ORDER_BY_SQL = " ORDER BY RES_DIAS_FESTIVOS.ID_FESTIVO ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.proyecto.citas.model.DiasFestivos"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.proyecto.citas.model.DiasFestivos"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.proyecto.citas.model.DiasFestivos"));
    private static ClassLoader _classLoader = DiasFestivos.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            DiasFestivos.class
        };
    private int _idFestivo;
    private Date _fechaFestivo;
    private DiasFestivos _escapedModel;

    public DiasFestivosModelImpl() {
    }

    @Override
    public int getPrimaryKey() {
        return _idFestivo;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdFestivo(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idFestivo;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return DiasFestivos.class;
    }

    @Override
    public String getModelClassName() {
        return DiasFestivos.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idFestivo", getIdFestivo());
        attributes.put("fechaFestivo", getFechaFestivo());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idFestivo = (Integer) attributes.get("idFestivo");

        if (idFestivo != null) {
            setIdFestivo(idFestivo);
        }

        Date fechaFestivo = (Date) attributes.get("fechaFestivo");

        if (fechaFestivo != null) {
            setFechaFestivo(fechaFestivo);
        }
    }

    @Override
    public int getIdFestivo() {
        return _idFestivo;
    }

    @Override
    public void setIdFestivo(int idFestivo) {
        _idFestivo = idFestivo;
    }

    @Override
    public Date getFechaFestivo() {
        return _fechaFestivo;
    }

    @Override
    public void setFechaFestivo(Date fechaFestivo) {
        _fechaFestivo = fechaFestivo;
    }

    @Override
    public DiasFestivos toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (DiasFestivos) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DiasFestivosImpl diasFestivosImpl = new DiasFestivosImpl();

        diasFestivosImpl.setIdFestivo(getIdFestivo());
        diasFestivosImpl.setFechaFestivo(getFechaFestivo());

        diasFestivosImpl.resetOriginalValues();

        return diasFestivosImpl;
    }

    @Override
    public int compareTo(DiasFestivos diasFestivos) {
        int primaryKey = diasFestivos.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DiasFestivos)) {
            return false;
        }

        DiasFestivos diasFestivos = (DiasFestivos) obj;

        int primaryKey = diasFestivos.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<DiasFestivos> toCacheModel() {
        DiasFestivosCacheModel diasFestivosCacheModel = new DiasFestivosCacheModel();

        diasFestivosCacheModel.idFestivo = getIdFestivo();

        Date fechaFestivo = getFechaFestivo();

        if (fechaFestivo != null) {
            diasFestivosCacheModel.fechaFestivo = fechaFestivo.getTime();
        } else {
            diasFestivosCacheModel.fechaFestivo = Long.MIN_VALUE;
        }

        return diasFestivosCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idFestivo=");
        sb.append(getIdFestivo());
        sb.append(", fechaFestivo=");
        sb.append(getFechaFestivo());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.proyecto.citas.model.DiasFestivos");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idFestivo</column-name><column-value><![CDATA[");
        sb.append(getIdFestivo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaFestivo</column-name><column-value><![CDATA[");
        sb.append(getFechaFestivo());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
