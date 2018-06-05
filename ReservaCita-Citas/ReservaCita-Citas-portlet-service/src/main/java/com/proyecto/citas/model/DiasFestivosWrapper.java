package com.proyecto.citas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DiasFestivos}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivos
 * @generated
 */
public class DiasFestivosWrapper implements DiasFestivos,
    ModelWrapper<DiasFestivos> {
    private DiasFestivos _diasFestivos;

    public DiasFestivosWrapper(DiasFestivos diasFestivos) {
        _diasFestivos = diasFestivos;
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

    /**
    * Returns the primary key of this dias festivos.
    *
    * @return the primary key of this dias festivos
    */
    @Override
    public int getPrimaryKey() {
        return _diasFestivos.getPrimaryKey();
    }

    /**
    * Sets the primary key of this dias festivos.
    *
    * @param primaryKey the primary key of this dias festivos
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _diasFestivos.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id festivo of this dias festivos.
    *
    * @return the id festivo of this dias festivos
    */
    @Override
    public int getIdFestivo() {
        return _diasFestivos.getIdFestivo();
    }

    /**
    * Sets the id festivo of this dias festivos.
    *
    * @param idFestivo the id festivo of this dias festivos
    */
    @Override
    public void setIdFestivo(int idFestivo) {
        _diasFestivos.setIdFestivo(idFestivo);
    }

    /**
    * Returns the fecha festivo of this dias festivos.
    *
    * @return the fecha festivo of this dias festivos
    */
    @Override
    public java.util.Date getFechaFestivo() {
        return _diasFestivos.getFechaFestivo();
    }

    /**
    * Sets the fecha festivo of this dias festivos.
    *
    * @param fechaFestivo the fecha festivo of this dias festivos
    */
    @Override
    public void setFechaFestivo(java.util.Date fechaFestivo) {
        _diasFestivos.setFechaFestivo(fechaFestivo);
    }

    @Override
    public boolean isNew() {
        return _diasFestivos.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _diasFestivos.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _diasFestivos.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _diasFestivos.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _diasFestivos.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _diasFestivos.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _diasFestivos.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _diasFestivos.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _diasFestivos.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _diasFestivos.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _diasFestivos.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DiasFestivosWrapper((DiasFestivos) _diasFestivos.clone());
    }

    @Override
    public int compareTo(com.proyecto.citas.model.DiasFestivos diasFestivos) {
        return _diasFestivos.compareTo(diasFestivos);
    }

    @Override
    public int hashCode() {
        return _diasFestivos.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.citas.model.DiasFestivos> toCacheModel() {
        return _diasFestivos.toCacheModel();
    }

    @Override
    public com.proyecto.citas.model.DiasFestivos toEscapedModel() {
        return new DiasFestivosWrapper(_diasFestivos.toEscapedModel());
    }

    @Override
    public com.proyecto.citas.model.DiasFestivos toUnescapedModel() {
        return new DiasFestivosWrapper(_diasFestivos.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _diasFestivos.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _diasFestivos.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _diasFestivos.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DiasFestivosWrapper)) {
            return false;
        }

        DiasFestivosWrapper diasFestivosWrapper = (DiasFestivosWrapper) obj;

        if (Validator.equals(_diasFestivos, diasFestivosWrapper._diasFestivos)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DiasFestivos getWrappedDiasFestivos() {
        return _diasFestivos;
    }

    @Override
    public DiasFestivos getWrappedModel() {
        return _diasFestivos;
    }

    @Override
    public void resetOriginalValues() {
        _diasFestivos.resetOriginalValues();
    }
}
