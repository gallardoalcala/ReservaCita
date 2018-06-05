package com.proyecto.citas.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.citas.service.ClpSerializer;
import com.proyecto.citas.service.DiasLibresLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class DiasLibresClp extends BaseModelImpl<DiasLibres>
    implements DiasLibres {
    private String _dia;
    private int _libre;
    private BaseModel<?> _diasLibresRemoteModel;
    private Class<?> _clpSerializerClass = com.proyecto.citas.service.ClpSerializer.class;

    public DiasLibresClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return DiasLibres.class;
    }

    @Override
    public String getModelClassName() {
        return DiasLibres.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _dia;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setDia(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _dia;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("dia", getDia());
        attributes.put("libre", getLibre());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String dia = (String) attributes.get("dia");

        if (dia != null) {
            setDia(dia);
        }

        Integer libre = (Integer) attributes.get("libre");

        if (libre != null) {
            setLibre(libre);
        }
    }

    @Override
    public String getDia() {
        return _dia;
    }

    @Override
    public void setDia(String dia) {
        _dia = dia;

        if (_diasLibresRemoteModel != null) {
            try {
                Class<?> clazz = _diasLibresRemoteModel.getClass();

                Method method = clazz.getMethod("setDia", String.class);

                method.invoke(_diasLibresRemoteModel, dia);
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

        if (_diasLibresRemoteModel != null) {
            try {
                Class<?> clazz = _diasLibresRemoteModel.getClass();

                Method method = clazz.getMethod("setLibre", int.class);

                method.invoke(_diasLibresRemoteModel, libre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDiasLibresRemoteModel() {
        return _diasLibresRemoteModel;
    }

    public void setDiasLibresRemoteModel(BaseModel<?> diasLibresRemoteModel) {
        _diasLibresRemoteModel = diasLibresRemoteModel;
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

        Class<?> remoteModelClass = _diasLibresRemoteModel.getClass();

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

        Object returnValue = method.invoke(_diasLibresRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DiasLibresLocalServiceUtil.addDiasLibres(this);
        } else {
            DiasLibresLocalServiceUtil.updateDiasLibres(this);
        }
    }

    @Override
    public DiasLibres toEscapedModel() {
        return (DiasLibres) ProxyUtil.newProxyInstance(DiasLibres.class.getClassLoader(),
            new Class[] { DiasLibres.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DiasLibresClp clone = new DiasLibresClp();

        clone.setDia(getDia());
        clone.setLibre(getLibre());

        return clone;
    }

    @Override
    public int compareTo(DiasLibres diasLibres) {
        String primaryKey = diasLibres.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DiasLibresClp)) {
            return false;
        }

        DiasLibresClp diasLibres = (DiasLibresClp) obj;

        String primaryKey = diasLibres.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{dia=");
        sb.append(getDia());
        sb.append(", libre=");
        sb.append(getLibre());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.proyecto.citas.model.DiasLibres");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>dia</column-name><column-value><![CDATA[");
        sb.append(getDia());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>libre</column-name><column-value><![CDATA[");
        sb.append(getLibre());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
