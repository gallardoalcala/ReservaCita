package com.proyecto.citas.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HorarioTrabajo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorarioTrabajo
 * @generated
 */
public class HorarioTrabajoWrapper implements HorarioTrabajo,
    ModelWrapper<HorarioTrabajo> {
    private HorarioTrabajo _horarioTrabajo;

    public HorarioTrabajoWrapper(HorarioTrabajo horarioTrabajo) {
        _horarioTrabajo = horarioTrabajo;
    }

    @Override
    public Class<?> getModelClass() {
        return HorarioTrabajo.class;
    }

    @Override
    public String getModelClassName() {
        return HorarioTrabajo.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idHorario", getIdHorario());
        attributes.put("horaInicio", getHoraInicio());
        attributes.put("horaFin", getHoraFin());
        attributes.put("horaInicioTarde", getHoraInicioTarde());
        attributes.put("horaFinTarde", getHoraFinTarde());
        attributes.put("duracionCitas", getDuracionCitas());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer idHorario = (Integer) attributes.get("idHorario");

        if (idHorario != null) {
            setIdHorario(idHorario);
        }

        String horaInicio = (String) attributes.get("horaInicio");

        if (horaInicio != null) {
            setHoraInicio(horaInicio);
        }

        String horaFin = (String) attributes.get("horaFin");

        if (horaFin != null) {
            setHoraFin(horaFin);
        }

        String horaInicioTarde = (String) attributes.get("horaInicioTarde");

        if (horaInicioTarde != null) {
            setHoraInicioTarde(horaInicioTarde);
        }

        String horaFinTarde = (String) attributes.get("horaFinTarde");

        if (horaFinTarde != null) {
            setHoraFinTarde(horaFinTarde);
        }

        Integer duracionCitas = (Integer) attributes.get("duracionCitas");

        if (duracionCitas != null) {
            setDuracionCitas(duracionCitas);
        }
    }

    /**
    * Returns the primary key of this horario trabajo.
    *
    * @return the primary key of this horario trabajo
    */
    @Override
    public int getPrimaryKey() {
        return _horarioTrabajo.getPrimaryKey();
    }

    /**
    * Sets the primary key of this horario trabajo.
    *
    * @param primaryKey the primary key of this horario trabajo
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _horarioTrabajo.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id horario of this horario trabajo.
    *
    * @return the id horario of this horario trabajo
    */
    @Override
    public int getIdHorario() {
        return _horarioTrabajo.getIdHorario();
    }

    /**
    * Sets the id horario of this horario trabajo.
    *
    * @param idHorario the id horario of this horario trabajo
    */
    @Override
    public void setIdHorario(int idHorario) {
        _horarioTrabajo.setIdHorario(idHorario);
    }

    /**
    * Returns the hora inicio of this horario trabajo.
    *
    * @return the hora inicio of this horario trabajo
    */
    @Override
    public java.lang.String getHoraInicio() {
        return _horarioTrabajo.getHoraInicio();
    }

    /**
    * Sets the hora inicio of this horario trabajo.
    *
    * @param horaInicio the hora inicio of this horario trabajo
    */
    @Override
    public void setHoraInicio(java.lang.String horaInicio) {
        _horarioTrabajo.setHoraInicio(horaInicio);
    }

    /**
    * Returns the hora fin of this horario trabajo.
    *
    * @return the hora fin of this horario trabajo
    */
    @Override
    public java.lang.String getHoraFin() {
        return _horarioTrabajo.getHoraFin();
    }

    /**
    * Sets the hora fin of this horario trabajo.
    *
    * @param horaFin the hora fin of this horario trabajo
    */
    @Override
    public void setHoraFin(java.lang.String horaFin) {
        _horarioTrabajo.setHoraFin(horaFin);
    }

    /**
    * Returns the hora inicio tarde of this horario trabajo.
    *
    * @return the hora inicio tarde of this horario trabajo
    */
    @Override
    public java.lang.String getHoraInicioTarde() {
        return _horarioTrabajo.getHoraInicioTarde();
    }

    /**
    * Sets the hora inicio tarde of this horario trabajo.
    *
    * @param horaInicioTarde the hora inicio tarde of this horario trabajo
    */
    @Override
    public void setHoraInicioTarde(java.lang.String horaInicioTarde) {
        _horarioTrabajo.setHoraInicioTarde(horaInicioTarde);
    }

    /**
    * Returns the hora fin tarde of this horario trabajo.
    *
    * @return the hora fin tarde of this horario trabajo
    */
    @Override
    public java.lang.String getHoraFinTarde() {
        return _horarioTrabajo.getHoraFinTarde();
    }

    /**
    * Sets the hora fin tarde of this horario trabajo.
    *
    * @param horaFinTarde the hora fin tarde of this horario trabajo
    */
    @Override
    public void setHoraFinTarde(java.lang.String horaFinTarde) {
        _horarioTrabajo.setHoraFinTarde(horaFinTarde);
    }

    /**
    * Returns the duracion citas of this horario trabajo.
    *
    * @return the duracion citas of this horario trabajo
    */
    @Override
    public int getDuracionCitas() {
        return _horarioTrabajo.getDuracionCitas();
    }

    /**
    * Sets the duracion citas of this horario trabajo.
    *
    * @param duracionCitas the duracion citas of this horario trabajo
    */
    @Override
    public void setDuracionCitas(int duracionCitas) {
        _horarioTrabajo.setDuracionCitas(duracionCitas);
    }

    @Override
    public boolean isNew() {
        return _horarioTrabajo.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _horarioTrabajo.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _horarioTrabajo.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _horarioTrabajo.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _horarioTrabajo.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _horarioTrabajo.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _horarioTrabajo.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _horarioTrabajo.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _horarioTrabajo.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _horarioTrabajo.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _horarioTrabajo.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new HorarioTrabajoWrapper((HorarioTrabajo) _horarioTrabajo.clone());
    }

    @Override
    public int compareTo(com.proyecto.citas.model.HorarioTrabajo horarioTrabajo) {
        return _horarioTrabajo.compareTo(horarioTrabajo);
    }

    @Override
    public int hashCode() {
        return _horarioTrabajo.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.proyecto.citas.model.HorarioTrabajo> toCacheModel() {
        return _horarioTrabajo.toCacheModel();
    }

    @Override
    public com.proyecto.citas.model.HorarioTrabajo toEscapedModel() {
        return new HorarioTrabajoWrapper(_horarioTrabajo.toEscapedModel());
    }

    @Override
    public com.proyecto.citas.model.HorarioTrabajo toUnescapedModel() {
        return new HorarioTrabajoWrapper(_horarioTrabajo.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _horarioTrabajo.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _horarioTrabajo.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _horarioTrabajo.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HorarioTrabajoWrapper)) {
            return false;
        }

        HorarioTrabajoWrapper horarioTrabajoWrapper = (HorarioTrabajoWrapper) obj;

        if (Validator.equals(_horarioTrabajo,
                    horarioTrabajoWrapper._horarioTrabajo)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public HorarioTrabajo getWrappedHorarioTrabajo() {
        return _horarioTrabajo;
    }

    @Override
    public HorarioTrabajo getWrappedModel() {
        return _horarioTrabajo;
    }

    @Override
    public void resetOriginalValues() {
        _horarioTrabajo.resetOriginalValues();
    }
}
