package com.proyecto.citas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Cita}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cita
 * @generated
 */
public class CitaWrapper implements Cita, ModelWrapper<Cita> {
    private Cita _cita;

    public CitaWrapper(Cita cita) {
        _cita = cita;
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

    /**
    * Returns the primary key of this cita.
    *
    * @return the primary key of this cita
    */
    @Override
    public int getPrimaryKey() {
        return _cita.getPrimaryKey();
    }

    /**
    * Sets the primary key of this cita.
    *
    * @param primaryKey the primary key of this cita
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _cita.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id cita of this cita.
    *
    * @return the id cita of this cita
    */
    @Override
    public int getIdCita() {
        return _cita.getIdCita();
    }

    /**
    * Sets the id cita of this cita.
    *
    * @param idCita the id cita of this cita
    */
    @Override
    public void setIdCita(int idCita) {
        _cita.setIdCita(idCita);
    }

    /**
    * Returns the id cliente of this cita.
    *
    * @return the id cliente of this cita
    */
    @Override
    public int getIdCliente() {
        return _cita.getIdCliente();
    }

    /**
    * Sets the id cliente of this cita.
    *
    * @param idCliente the id cliente of this cita
    */
    @Override
    public void setIdCliente(int idCliente) {
        _cita.setIdCliente(idCliente);
    }

    /**
    * Returns the fecha cita of this cita.
    *
    * @return the fecha cita of this cita
    */
    @Override
    public java.util.Date getFechaCita() {
        return _cita.getFechaCita();
    }

    /**
    * Sets the fecha cita of this cita.
    *
    * @param fechaCita the fecha cita of this cita
    */
    @Override
    public void setFechaCita(java.util.Date fechaCita) {
        _cita.setFechaCita(fechaCita);
    }

    /**
    * Returns the descripcion of this cita.
    *
    * @return the descripcion of this cita
    */
    @Override
    public java.lang.String getDescripcion() {
        return _cita.getDescripcion();
    }

    /**
    * Sets the descripcion of this cita.
    *
    * @param descripcion the descripcion of this cita
    */
    @Override
    public void setDescripcion(java.lang.String descripcion) {
        _cita.setDescripcion(descripcion);
    }

    @Override
    public boolean isNew() {
        return _cita.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _cita.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _cita.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _cita.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _cita.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _cita.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _cita.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _cita.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _cita.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _cita.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _cita.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CitaWrapper((Cita) _cita.clone());
    }

    @Override
    public int compareTo(com.proyecto.citas.model.Cita cita) {
        return _cita.compareTo(cita);
    }

    @Override
    public int hashCode() {
        return _cita.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.citas.model.Cita> toCacheModel() {
        return _cita.toCacheModel();
    }

    @Override
    public com.proyecto.citas.model.Cita toEscapedModel() {
        return new CitaWrapper(_cita.toEscapedModel());
    }

    @Override
    public com.proyecto.citas.model.Cita toUnescapedModel() {
        return new CitaWrapper(_cita.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _cita.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _cita.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _cita.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CitaWrapper)) {
            return false;
        }

        CitaWrapper citaWrapper = (CitaWrapper) obj;

        if (Validator.equals(_cita, citaWrapper._cita)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Cita getWrappedCita() {
        return _cita;
    }

    @Override
    public Cita getWrappedModel() {
        return _cita;
    }

    @Override
    public void resetOriginalValues() {
        _cita.resetOriginalValues();
    }
}
