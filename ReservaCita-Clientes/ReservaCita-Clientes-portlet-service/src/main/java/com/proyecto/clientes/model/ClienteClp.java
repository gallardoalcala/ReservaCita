package com.proyecto.clientes.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.clientes.service.ClienteLocalServiceUtil;
import com.proyecto.clientes.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ClienteClp extends BaseModelImpl<Cliente> implements Cliente {
    private long _idCliente;
    private int _activado;
    private int _denegado;
    private BaseModel<?> _clienteRemoteModel;
    private Class<?> _clpSerializerClass = com.proyecto.clientes.service.ClpSerializer.class;

    public ClienteClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Cliente.class;
    }

    @Override
    public String getModelClassName() {
        return Cliente.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _idCliente;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdCliente(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idCliente;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idCliente", getIdCliente());
        attributes.put("activado", getActivado());
        attributes.put("denegado", getDenegado());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idCliente = (Long) attributes.get("idCliente");

        if (idCliente != null) {
            setIdCliente(idCliente);
        }

        Integer activado = (Integer) attributes.get("activado");

        if (activado != null) {
            setActivado(activado);
        }

        Integer denegado = (Integer) attributes.get("denegado");

        if (denegado != null) {
            setDenegado(denegado);
        }
    }

    @Override
    public long getIdCliente() {
        return _idCliente;
    }

    @Override
    public void setIdCliente(long idCliente) {
        _idCliente = idCliente;

        if (_clienteRemoteModel != null) {
            try {
                Class<?> clazz = _clienteRemoteModel.getClass();

                Method method = clazz.getMethod("setIdCliente", long.class);

                method.invoke(_clienteRemoteModel, idCliente);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getActivado() {
        return _activado;
    }

    @Override
    public void setActivado(int activado) {
        _activado = activado;

        if (_clienteRemoteModel != null) {
            try {
                Class<?> clazz = _clienteRemoteModel.getClass();

                Method method = clazz.getMethod("setActivado", int.class);

                method.invoke(_clienteRemoteModel, activado);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDenegado() {
        return _denegado;
    }

    @Override
    public void setDenegado(int denegado) {
        _denegado = denegado;

        if (_clienteRemoteModel != null) {
            try {
                Class<?> clazz = _clienteRemoteModel.getClass();

                Method method = clazz.getMethod("setDenegado", int.class);

                method.invoke(_clienteRemoteModel, denegado);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getClienteRemoteModel() {
        return _clienteRemoteModel;
    }

    public void setClienteRemoteModel(BaseModel<?> clienteRemoteModel) {
        _clienteRemoteModel = clienteRemoteModel;
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

        Class<?> remoteModelClass = _clienteRemoteModel.getClass();

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

        Object returnValue = method.invoke(_clienteRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ClienteLocalServiceUtil.addCliente(this);
        } else {
            ClienteLocalServiceUtil.updateCliente(this);
        }
    }

    @Override
    public Cliente toEscapedModel() {
        return (Cliente) ProxyUtil.newProxyInstance(Cliente.class.getClassLoader(),
            new Class[] { Cliente.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ClienteClp clone = new ClienteClp();

        clone.setIdCliente(getIdCliente());
        clone.setActivado(getActivado());
        clone.setDenegado(getDenegado());

        return clone;
    }

    @Override
    public int compareTo(Cliente cliente) {
        long primaryKey = cliente.getPrimaryKey();

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

        if (!(obj instanceof ClienteClp)) {
            return false;
        }

        ClienteClp cliente = (ClienteClp) obj;

        long primaryKey = cliente.getPrimaryKey();

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
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{idCliente=");
        sb.append(getIdCliente());
        sb.append(", activado=");
        sb.append(getActivado());
        sb.append(", denegado=");
        sb.append(getDenegado());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.proyecto.clientes.model.Cliente");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idCliente</column-name><column-value><![CDATA[");
        sb.append(getIdCliente());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>activado</column-name><column-value><![CDATA[");
        sb.append(getActivado());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>denegado</column-name><column-value><![CDATA[");
        sb.append(getDenegado());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
