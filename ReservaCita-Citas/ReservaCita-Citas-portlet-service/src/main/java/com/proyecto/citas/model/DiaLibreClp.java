package com.proyecto.citas.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.citas.service.ClpSerializer;
import com.proyecto.citas.service.DiaLibreLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class DiaLibreClp extends BaseModelImpl<DiaLibre> implements DiaLibre {
    private int _idLibre;
    private String _dia;
    private int _libre;
    private String _codigoDia;
    private BaseModel<?> _diaLibreRemoteModel;
    private Class<?> _clpSerializerClass = com.proyecto.citas.service.ClpSerializer.class;

    public DiaLibreClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return DiaLibre.class;
    }

    @Override
    public String getModelClassName() {
        return DiaLibre.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _idLibre;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdLibre(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idLibre;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idLibre", getIdLibre());
        attributes.put("dia", getDia());
        attributes.put("libre", getLibre());
        attributes.put("codigoDia", getCodigoDia());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idLibre = (Integer) attributes.get("idLibre");

        if (idLibre != null) {
            setIdLibre(idLibre);
        }

        String dia = (String) attributes.get("dia");

        if (dia != null) {
            setDia(dia);
        }

        Integer libre = (Integer) attributes.get("libre");

        if (libre != null) {
            setLibre(libre);
        }

        String codigoDia = (String) attributes.get("codigoDia");

        if (codigoDia != null) {
            setCodigoDia(codigoDia);
        }
    }

    @Override
    public int getIdLibre() {
        return _idLibre;
    }

    @Override
    public void setIdLibre(int idLibre) {
        _idLibre = idLibre;

        if (_diaLibreRemoteModel != null) {
            try {
                Class<?> clazz = _diaLibreRemoteModel.getClass();

                Method method = clazz.getMethod("setIdLibre", int.class);

                method.invoke(_diaLibreRemoteModel, idLibre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDia() {
        return _dia;
    }

    @Override
    public void setDia(String dia) {
        _dia = dia;

        if (_diaLibreRemoteModel != null) {
            try {
                Class<?> clazz = _diaLibreRemoteModel.getClass();

                Method method = clazz.getMethod("setDia", String.class);

                method.invoke(_diaLibreRemoteModel, dia);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLibre() {
        return _libre;
    }

    @Override
    public void setLibre(int libre) {
        _libre = libre;

        if (_diaLibreRemoteModel != null) {
            try {
                Class<?> clazz = _diaLibreRemoteModel.getClass();

                Method method = clazz.getMethod("setLibre", int.class);

                method.invoke(_diaLibreRemoteModel, libre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCodigoDia() {
        return _codigoDia;
    }

    @Override
    public void setCodigoDia(String codigoDia) {
        _codigoDia = codigoDia;

        if (_diaLibreRemoteModel != null) {
            try {
                Class<?> clazz = _diaLibreRemoteModel.getClass();

                Method method = clazz.getMethod("setCodigoDia", String.class);

                method.invoke(_diaLibreRemoteModel, codigoDia);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDiaLibreRemoteModel() {
        return _diaLibreRemoteModel;
    }

    public void setDiaLibreRemoteModel(BaseModel<?> diaLibreRemoteModel) {
        _diaLibreRemoteModel = diaLibreRemoteModel;
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

        Class<?> remoteModelClass = _diaLibreRemoteModel.getClass();

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

        Object returnValue = method.invoke(_diaLibreRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DiaLibreLocalServiceUtil.addDiaLibre(this);
        } else {
            DiaLibreLocalServiceUtil.updateDiaLibre(this);
        }
    }

    @Override
    public DiaLibre toEscapedModel() {
        return (DiaLibre) ProxyUtil.newProxyInstance(DiaLibre.class.getClassLoader(),
            new Class[] { DiaLibre.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DiaLibreClp clone = new DiaLibreClp();

        clone.setIdLibre(getIdLibre());
        clone.setDia(getDia());
        clone.setLibre(getLibre());
        clone.setCodigoDia(getCodigoDia());

        return clone;
    }

    @Override
    public int compareTo(DiaLibre diaLibre) {
        int primaryKey = diaLibre.getPrimaryKey();

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

        if (!(obj instanceof DiaLibreClp)) {
            return false;
        }

        DiaLibreClp diaLibre = (DiaLibreClp) obj;

        int primaryKey = diaLibre.getPrimaryKey();

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

        sb.append("{idLibre=");
        sb.append(getIdLibre());
        sb.append(", dia=");
        sb.append(getDia());
        sb.append(", libre=");
        sb.append(getLibre());
        sb.append(", codigoDia=");
        sb.append(getCodigoDia());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.proyecto.citas.model.DiaLibre");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idLibre</column-name><column-value><![CDATA[");
        sb.append(getIdLibre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dia</column-name><column-value><![CDATA[");
        sb.append(getDia());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>libre</column-name><column-value><![CDATA[");
        sb.append(getLibre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>codigoDia</column-name><column-value><![CDATA[");
        sb.append(getCodigoDia());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
