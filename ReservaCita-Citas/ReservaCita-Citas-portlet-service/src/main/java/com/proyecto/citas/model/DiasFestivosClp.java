package com.proyecto.citas.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.citas.service.ClpSerializer;
import com.proyecto.citas.service.DiasFestivosLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class DiasFestivosClp extends BaseModelImpl<DiasFestivos>
    implements DiasFestivos {
    private int _idFestivo;
    private Date _fechaFestivo;
    private BaseModel<?> _diasFestivosRemoteModel;
    private Class<?> _clpSerializerClass = com.proyecto.citas.service.ClpSerializer.class;

    public DiasFestivosClp() {
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

        if (_diasFestivosRemoteModel != null) {
            try {
                Class<?> clazz = _diasFestivosRemoteModel.getClass();

                Method method = clazz.getMethod("setIdFestivo", int.class);

                method.invoke(_diasFestivosRemoteModel, idFestivo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaFestivo() {
        return _fechaFestivo;
    }

    @Override
    public void setFechaFestivo(Date fechaFestivo) {
        _fechaFestivo = fechaFestivo;

        if (_diasFestivosRemoteModel != null) {
            try {
                Class<?> clazz = _diasFestivosRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaFestivo", Date.class);

                method.invoke(_diasFestivosRemoteModel, fechaFestivo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDiasFestivosRemoteModel() {
        return _diasFestivosRemoteModel;
    }

    public void setDiasFestivosRemoteModel(BaseModel<?> diasFestivosRemoteModel) {
        _diasFestivosRemoteModel = diasFestivosRemoteModel;
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

        Class<?> remoteModelClass = _diasFestivosRemoteModel.getClass();

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

        Object returnValue = method.invoke(_diasFestivosRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DiasFestivosLocalServiceUtil.addDiasFestivos(this);
        } else {
            DiasFestivosLocalServiceUtil.updateDiasFestivos(this);
        }
    }

    @Override
    public DiasFestivos toEscapedModel() {
        return (DiasFestivos) ProxyUtil.newProxyInstance(DiasFestivos.class.getClassLoader(),
            new Class[] { DiasFestivos.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DiasFestivosClp clone = new DiasFestivosClp();

        clone.setIdFestivo(getIdFestivo());
        clone.setFechaFestivo(getFechaFestivo());

        return clone;
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

        if (!(obj instanceof DiasFestivosClp)) {
            return false;
        }

        DiasFestivosClp diasFestivos = (DiasFestivosClp) obj;

        int primaryKey = diasFestivos.getPrimaryKey();

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
