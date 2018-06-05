package com.proyecto.citas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DiasLibres}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasLibres
 * @generated
 */
public class DiasLibresWrapper implements DiasLibres, ModelWrapper<DiasLibres> {
    private DiasLibres _diasLibres;

    public DiasLibresWrapper(DiasLibres diasLibres) {
        _diasLibres = diasLibres;
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

    /**
    * Returns the primary key of this dias libres.
    *
    * @return the primary key of this dias libres
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _diasLibres.getPrimaryKey();
    }

    /**
    * Sets the primary key of this dias libres.
    *
    * @param primaryKey the primary key of this dias libres
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _diasLibres.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the dia of this dias libres.
    *
    * @return the dia of this dias libres
    */
    @Override
    public java.lang.String getDia() {
        return _diasLibres.getDia();
    }

    /**
    * Sets the dia of this dias libres.
    *
    * @param dia the dia of this dias libres
    */
    @Override
    public void setDia(java.lang.String dia) {
        _diasLibres.setDia(dia);
    }

    /**
    * Returns the libre of this dias libres.
    *
    * @return the libre of this dias libres
    */
    @Override
    public int getLibre() {
        return _diasLibres.getLibre();
    }

    /**
    * Sets the libre of this dias libres.
    *
    * @param libre the libre of this dias libres
    */
    @Override
    public void setLibre(int libre) {
        _diasLibres.setLibre(libre);
    }

    @Override
    public boolean isNew() {
        return _diasLibres.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _diasLibres.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _diasLibres.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _diasLibres.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _diasLibres.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _diasLibres.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _diasLibres.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _diasLibres.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _diasLibres.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _diasLibres.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _diasLibres.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DiasLibresWrapper((DiasLibres) _diasLibres.clone());
    }

    @Override
    public int compareTo(com.proyecto.citas.model.DiasLibres diasLibres) {
        return _diasLibres.compareTo(diasLibres);
    }

    @Override
    public int hashCode() {
        return _diasLibres.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.citas.model.DiasLibres> toCacheModel() {
        return _diasLibres.toCacheModel();
    }

    @Override
    public com.proyecto.citas.model.DiasLibres toEscapedModel() {
        return new DiasLibresWrapper(_diasLibres.toEscapedModel());
    }

    @Override
    public com.proyecto.citas.model.DiasLibres toUnescapedModel() {
        return new DiasLibresWrapper(_diasLibres.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _diasLibres.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _diasLibres.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _diasLibres.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DiasLibresWrapper)) {
            return false;
        }

        DiasLibresWrapper diasLibresWrapper = (DiasLibresWrapper) obj;

        if (Validator.equals(_diasLibres, diasLibresWrapper._diasLibres)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DiasLibres getWrappedDiasLibres() {
        return _diasLibres;
    }

    @Override
    public DiasLibres getWrappedModel() {
        return _diasLibres;
    }

    @Override
    public void resetOriginalValues() {
        _diasLibres.resetOriginalValues();
    }
}
