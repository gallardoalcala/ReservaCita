package com.proyecto.citas.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.citas.service.CitaLocalServiceUtil;
import com.proyecto.citas.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class CitaClp extends BaseModelImpl<Cita> implements Cita {
    private int _idCita;
    private int _idCliente;
    private Date _fechaCita;
    private String _descripcion;
    private BaseModel<?> _citaRemoteModel;
    private Class<?> _clpSerializerClass = com.proyecto.citas.service.ClpSerializer.class;

    public CitaClp() {
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

        if (_citaRemoteModel != null) {
            try {
                Class<?> clazz = _citaRemoteModel.getClass();

                Method method = clazz.getMethod("setIdCita", int.class);

                method.invoke(_citaRemoteModel, idCita);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIdCliente() {
        return _idCliente;
    }

    @Override
    public void setIdCliente(int idCliente) {
        _idCliente = idCliente;

        if (_citaRemoteModel != null) {
            try {
                Class<?> clazz = _citaRemoteModel.getClass();

                Method method = clazz.getMethod("setIdCliente", int.class);

                method.invoke(_citaRemoteModel, idCliente);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaCita() {
        return _fechaCita;
    }

    @Override
    public void setFechaCita(Date fechaCita) {
        _fechaCita = fechaCita;

        if (_citaRemoteModel != null) {
            try {
                Class<?> clazz = _citaRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaCita", Date.class);

                method.invoke(_citaRemoteModel, fechaCita);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescripcion() {
        return _descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;

        if (_citaRemoteModel != null) {
            try {
                Class<?> clazz = _citaRemoteModel.getClass();

                Method method = clazz.getMethod("setDescripcion", String.class);

                method.invoke(_citaRemoteModel, descripcion);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCitaRemoteModel() {
        return _citaRemoteModel;
    }

    public void setCitaRemoteModel(BaseModel<?> citaRemoteModel) {
        _citaRemoteModel = citaRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _citaRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_citaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CitaLocalServiceUtil.addCita(this);
        } else {
            CitaLocalServiceUtil.updateCita(this);
        }
    }

    @Override
    public Cita toEscapedModel() {
        return (Cita) ProxyUtil.newProxyInstance(Cita.class.getClassLoader(),
            new Class[] { Cita.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CitaClp clone = new CitaClp();

        clone.setIdCita(getIdCita());
        clone.setIdCliente(getIdCliente());
        clone.setFechaCita(getFechaCita());
        clone.setDescripcion(getDescripcion());

        return clone;
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

        if (!(obj instanceof CitaClp)) {
            return false;
        }

        CitaClp cita = (CitaClp) obj;

        int primaryKey = cita.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
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
        sb.append("com.proyecto.citas.model.Cita");
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
