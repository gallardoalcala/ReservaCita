package com.proyecto.citas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DiaLibre}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaLibre
 * @generated
 */
public class DiaLibreWrapper implements DiaLibre, ModelWrapper<DiaLibre> {
    private DiaLibre _diaLibre;

    public DiaLibreWrapper(DiaLibre diaLibre) {
        _diaLibre = diaLibre;
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

    /**
    * Returns the primary key of this dia libre.
    *
    * @return the primary key of this dia libre
    */
    @Override
    public int getPrimaryKey() {
        return _diaLibre.getPrimaryKey();
    }

    /**
    * Sets the primary key of this dia libre.
    *
    * @param primaryKey the primary key of this dia libre
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _diaLibre.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id libre of this dia libre.
    *
    * @return the id libre of this dia libre
    */
    @Override
    public int getIdLibre() {
        return _diaLibre.getIdLibre();
    }

    /**
    * Sets the id libre of this dia libre.
    *
    * @param idLibre the id libre of this dia libre
    */
    @Override
    public void setIdLibre(int idLibre) {
        _diaLibre.setIdLibre(idLibre);
    }

    /**
    * Returns the dia of this dia libre.
    *
    * @return the dia of this dia libre
    */
    @Override
    public java.lang.String getDia() {
        return _diaLibre.getDia();
    }

    /**
    * Sets the dia of this dia libre.
    *
    * @param dia the dia of this dia libre
    */
    @Override
    public void setDia(java.lang.String dia) {
        _diaLibre.setDia(dia);
    }

    /**
    * Returns the libre of this dia libre.
    *
    * @return the libre of this dia libre
    */
    @Override
    public int getLibre() {
        return _diaLibre.getLibre();
    }

    /**
    * Sets the libre of this dia libre.
    *
    * @param libre the libre of this dia libre
    */
    @Override
    public void setLibre(int libre) {
        _diaLibre.setLibre(libre);
    }

    /**
    * Returns the codigo dia of this dia libre.
    *
    * @return the codigo dia of this dia libre
    */
    @Override
    public java.lang.String getCodigoDia() {
        return _diaLibre.getCodigoDia();
    }

    /**
    * Sets the codigo dia of this dia libre.
    *
    * @param codigoDia the codigo dia of this dia libre
    */
    @Override
    public void setCodigoDia(java.lang.String codigoDia) {
        _diaLibre.setCodigoDia(codigoDia);
    }

    @Override
    public boolean isNew() {
        return _diaLibre.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _diaLibre.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _diaLibre.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _diaLibre.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _diaLibre.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _diaLibre.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _diaLibre.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _diaLibre.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _diaLibre.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _diaLibre.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _diaLibre.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DiaLibreWrapper((DiaLibre) _diaLibre.clone());
    }

    @Override
    public int compareTo(com.proyecto.citas.model.DiaLibre diaLibre) {
        return _diaLibre.compareTo(diaLibre);
    }

    @Override
    public int hashCode() {
        return _diaLibre.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.citas.model.DiaLibre> toCacheModel() {
        return _diaLibre.toCacheModel();
    }

    @Override
    public com.proyecto.citas.model.DiaLibre toEscapedModel() {
        return new DiaLibreWrapper(_diaLibre.toEscapedModel());
    }

    @Override
    public com.proyecto.citas.model.DiaLibre toUnescapedModel() {
        return new DiaLibreWrapper(_diaLibre.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _diaLibre.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _diaLibre.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _diaLibre.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DiaLibreWrapper)) {
            return false;
        }

        DiaLibreWrapper diaLibreWrapper = (DiaLibreWrapper) obj;

        if (Validator.equals(_diaLibre, diaLibreWrapper._diaLibre)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DiaLibre getWrappedDiaLibre() {
        return _diaLibre;
    }

    @Override
    public DiaLibre getWrappedModel() {
        return _diaLibre;
    }

    @Override
    public void resetOriginalValues() {
        _diaLibre.resetOriginalValues();
    }
}
