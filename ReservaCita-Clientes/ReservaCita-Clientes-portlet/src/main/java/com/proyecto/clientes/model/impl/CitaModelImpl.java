package com.proyecto.clientes.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.clientes.model.Cita;
import com.proyecto.clientes.model.CitaModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Cita service. Represents a row in the &quot;RES_CITA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.proyecto.clientes.model.CitaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CitaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitaImpl
 * @see com.proyecto.clientes.model.Cita
 * @see com.proyecto.clientes.model.CitaModel
 * @generated
 */
public class CitaModelImpl extends BaseModelImpl<Cita> implements CitaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a cita model instance should use the {@link com.proyecto.clientes.model.Cita} interface instead.
     */
    public static final String TABLE_NAME = "RES_CITA";
    public static final Object[][] TABLE_COLUMNS = {
            { "ID_CITA", Types.INTEGER },
            { "ID_CLIENTE", Types.INTEGER },
            { "F_FECHA", Types.TIMESTAMP },
            { "T_DESCRIPCION", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table RES_CITA (ID_CITA INTEGER not null primary key,ID_CLIENTE INTEGER,F_FECHA DATE null,T_DESCRIPCION VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table RES_CITA";
    public static final String ORDER_BY_JPQL = " ORDER BY cita.idCita ASC";
    public static final String ORDER_BY_SQL = " ORDER BY RES_CITA.ID_CITA ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.proyecto.clientes.model.Cita"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.proyecto.clientes.model.Cita"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.proyecto.clientes.model.Cita"),
            true);
    public static long IDCLIENTE_COLUMN_BITMASK = 1L;
    public static long IDCITA_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.proyecto.clientes.model.Cita"));
    private static ClassLoader _classLoader = Cita.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Cita.class };
    private int _idCita;
    private int _idCliente;
    private int _originalIdCliente;
    private boolean _setOriginalIdCliente;
    private Date _fechaCita;
    private String _descripcion;
    private long _columnBitmask;
    private Cita _escapedModel;

    public CitaModelImpl() {
    }

    @Override
    public int getPrimaryKey() {
        return _idCita;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdCita(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idCita;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Cita.class;
    }

    @Override
    public String getModelClassName() {
        return Cita.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idCita", getIdCita());
        attributes.put("idCliente", getIdCliente());
        attributes.put("fechaCita", getFechaCita());
        attributes.put("descripcion", getDescripcion());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idCita = (Integer) attributes.get("idCita");

        if (idCita != null) {
            setIdCita(idCita);
        }

        Integer idCliente = (Integer) attributes.get("idCliente");

        if (idCliente != null) {
            setIdCliente(idCliente);
        }

        Date fechaCita = (Date) attributes.get("fechaCita");

        if (fechaCita != null) {
            setFechaCita(fechaCita);
        }

        String descripcion = (String) attributes.get("descripcion");

        if (descripcion != null) {
            setDescripcion(descripcion);
        }
    }

    @Override
    public int getIdCita() {
        return _idCita;
    }

    @Override
    public void setIdCita(int idCita) {
        _idCita = idCita;
    }

    @Override
    public int getIdCliente() {
        return _idCliente;
    }

    @Override
    public void setIdCliente(int idCliente) {
        _columnBitmask |= IDCLIENTE_COLUMN_BITMASK;

        if (!_setOriginalIdCliente) {
            _setOriginalIdCliente = true;

            _originalIdCliente = _idCliente;
        }

        _idCliente = idCliente;
    }

    public int getOriginalIdCliente() {
        return _originalIdCliente;
    }

    @Override
    public Date getFechaCita() {
        return _fechaCita;
    }

    @Override
    public void setFechaCita(Date fechaCita) {
        _fechaCita = fechaCita;
    }

    @Override
    public String getDescripcion() {
        if (_descripcion == null) {
            return StringPool.BLANK;
        } else {
            return _descripcion;
        }
    }

    @Override
    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public Cita toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Cita) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        CitaImpl citaImpl = new CitaImpl();

        citaImpl.setIdCita(getIdCita());
        citaImpl.setIdCliente(getIdCliente());
        citaImpl.setFechaCita(getFechaCita());
        citaImpl.setDescripcion(getDescripcion());

        citaImpl.resetOriginalValues();

        return citaImpl;
    }

    @Override
    public int compareTo(Cita cita) {
        int primaryKey = cita.getPrimaryKey();

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

        if (!(obj instanceof Cita)) {
            return false;
        }

        Cita cita = (Cita) obj;

        int primaryKey = cita.getPrimaryKey();

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
        CitaModelImpl citaModelImpl = this;

        citaModelImpl._originalIdCliente = citaModelImpl._idCliente;

        citaModelImpl._setOriginalIdCliente = false;

        citaModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Cita> toCacheModel() {
        CitaCacheModel citaCacheModel = new CitaCacheModel();

        citaCacheModel.idCita = getIdCita();

        citaCacheModel.idCliente = getIdCliente();

        Date fechaCita = getFechaCita();

        if (fechaCita != null) {
            citaCacheModel.fechaCita = fechaCita.getTime();
        } else {
            citaCacheModel.fechaCita = Long.MIN_VALUE;
        }

        citaCacheModel.descripcion = getDescripcion();

        String descripcion = citaCacheModel.descripcion;

        if ((descripcion != null) && (descripcion.length() == 0)) {
            citaCacheModel.descripcion = null;
        }

        return citaCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idCita=");
        sb.append(getIdCita());
        sb.append(", idCliente=");
        sb.append(getIdCliente());
        sb.append(", fechaCita=");
        sb.append(getFechaCita());
        sb.append(", descripcion=");
        sb.append(getDescripcion());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.proyecto.clientes.model.Cita");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idCita</column-name><column-value><![CDATA[");
        sb.append(getIdCita());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idCliente</column-name><column-value><![CDATA[");
        sb.append(getIdCliente());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaCita</column-name><column-value><![CDATA[");
        sb.append(getFechaCita());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descripcion</column-name><column-value><![CDATA[");
        sb.append(getDescripcion());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
