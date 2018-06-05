package com.proyecto.citas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DiaFestivo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiaFestivo
 * @generated
 */
public class DiaFestivoWrapper implements DiaFestivo, ModelWrapper<DiaFestivo> {
    private DiaFestivo _diaFestivo;

    public DiaFestivoWrapper(DiaFestivo diaFestivo) {
        _diaFestivo = diaFestivo;
    }

    @Override
    public Class<?> getModelClass() {
        return DiaFestivo.class;
    }

    @Override
    public String getModelClassName() {
        return DiaFestivo.class.getName();
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
    * Returns the primary key of this dia festivo.
    *
    * @return the primary key of this dia festivo
    */
    @Override
    public int getPrimaryKey() {
        return _diaFestivo.getPrimaryKey();
    }

    /**
    * Sets the primary key of this dia festivo.
    *
    * @param primaryKey the primary key of this dia festivo
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _diaFestivo.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id festivo of this dia festivo.
    *
    * @return the id festivo of this dia festivo
    */
    @Override
    public int getIdFestivo() {
        return _diaFestivo.getIdFestivo();
    }

    /**
    * Sets the id festivo of this dia festivo.
    *
    * @param idFestivo the id festivo of this dia festivo
    */
    @Override
    public void setIdFestivo(int idFestivo) {
        _diaFestivo.setIdFestivo(idFestivo);
    }

    /**
    * Returns the fecha festivo of this dia festivo.
    *
    * @return the fecha festivo of this dia festivo
    */
    @Override
    public java.util.Date getFechaFestivo() {
        return _diaFestivo.getFechaFestivo();
    }

    /**
    * Sets the fecha festivo of this dia festivo.
    *
    * @param fechaFestivo the fecha festivo of this dia festivo
    */
    @Override
    public void setFechaFestivo(java.util.Date fechaFestivo) {
        _diaFestivo.setFechaFestivo(fechaFestivo);
    }

    @Override
    public boolean isNew() {
        return _diaFestivo.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _diaFestivo.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _diaFestivo.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _diaFestivo.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _diaFestivo.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _diaFestivo.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _diaFestivo.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _diaFestivo.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _diaFestivo.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _diaFestivo.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _diaFestivo.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DiaFestivoWrapper((DiaFestivo) _diaFestivo.clone());
    }

    @Override
    public int compareTo(com.proyecto.citas.model.DiaFestivo diaFestivo) {
        return _diaFestivo.compareTo(diaFestivo);
    }

    @Override
    public int hashCode() {
        return _diaFestivo.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.citas.model.DiaFestivo> toCacheModel() {
        return _diaFestivo.toCacheModel();
    }

    @Override
    public com.proyecto.citas.model.DiaFestivo toEscapedModel() {
        return new DiaFestivoWrapper(_diaFestivo.toEscapedModel());
    }

    @Override
    public com.proyecto.citas.model.DiaFestivo toUnescapedModel() {
        return new DiaFestivoWrapper(_diaFestivo.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _diaFestivo.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _diaFestivo.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _diaFestivo.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DiaFestivoWrapper)) {
            return false;
        }

        DiaFestivoWrapper diaFestivoWrapper = (DiaFestivoWrapper) obj;

        if (Validator.equals(_diaFestivo, diaFestivoWrapper._diaFestivo)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DiaFestivo getWrappedDiaFestivo() {
        return _diaFestivo;
    }

    @Override
    public DiaFestivo getWrappedModel() {
        return _diaFestivo;
    }

    @Override
    public void resetOriginalValues() {
        _diaFestivo.resetOriginalValues();
    }
}
