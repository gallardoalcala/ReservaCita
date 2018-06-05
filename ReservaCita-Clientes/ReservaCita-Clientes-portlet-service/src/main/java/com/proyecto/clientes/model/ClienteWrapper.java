package com.proyecto.clientes.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Cliente}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cliente
 * @generated
 */
public class ClienteWrapper implements Cliente, ModelWrapper<Cliente> {
    private Cliente _cliente;

    public ClienteWrapper(Cliente cliente) {
        _cliente = cliente;
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

    /**
    * Returns the primary key of this cliente.
    *
    * @return the primary key of this cliente
    */
    @Override
    public long getPrimaryKey() {
        return _cliente.getPrimaryKey();
    }

    /**
    * Sets the primary key of this cliente.
    *
    * @param primaryKey the primary key of this cliente
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _cliente.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id cliente of this cliente.
    *
    * @return the id cliente of this cliente
    */
    @Override
    public long getIdCliente() {
        return _cliente.getIdCliente();
    }

    /**
    * Sets the id cliente of this cliente.
    *
    * @param idCliente the id cliente of this cliente
    */
    @Override
    public void setIdCliente(long idCliente) {
        _cliente.setIdCliente(idCliente);
    }

    /**
    * Returns the activado of this cliente.
    *
    * @return the activado of this cliente
    */
    @Override
    public int getActivado() {
        return _cliente.getActivado();
    }

    /**
    * Sets the activado of this cliente.
    *
    * @param activado the activado of this cliente
    */
    @Override
    public void setActivado(int activado) {
        _cliente.setActivado(activado);
    }

    /**
    * Returns the denegado of this cliente.
    *
    * @return the denegado of this cliente
    */
    @Override
    public int getDenegado() {
        return _cliente.getDenegado();
    }

    /**
    * Sets the denegado of this cliente.
    *
    * @param denegado the denegado of this cliente
    */
    @Override
    public void setDenegado(int denegado) {
        _cliente.setDenegado(denegado);
    }

    @Override
    public boolean isNew() {
        return _cliente.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _cliente.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _cliente.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _cliente.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _cliente.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _cliente.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _cliente.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _cliente.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _cliente.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _cliente.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _cliente.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ClienteWrapper((Cliente) _cliente.clone());
    }

    @Override
    public int compareTo(com.proyecto.clientes.model.Cliente cliente) {
        return _cliente.compareTo(cliente);
    }

    @Override
    public int hashCode() {
        return _cliente.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.clientes.model.Cliente> toCacheModel() {
        return _cliente.toCacheModel();
    }

    @Override
    public com.proyecto.clientes.model.Cliente toEscapedModel() {
        return new ClienteWrapper(_cliente.toEscapedModel());
    }

    @Override
    public com.proyecto.clientes.model.Cliente toUnescapedModel() {
        return new ClienteWrapper(_cliente.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _cliente.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _cliente.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _cliente.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ClienteWrapper)) {
            return false;
        }

        ClienteWrapper clienteWrapper = (ClienteWrapper) obj;

        if (Validator.equals(_cliente, clienteWrapper._cliente)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Cliente getWrappedCliente() {
        return _cliente;
    }

    @Override
    public Cliente getWrappedModel() {
        return _cliente;
    }

    @Override
    public void resetOriginalValues() {
        _cliente.resetOriginalValues();
    }
}
