package com.proyecto.citas.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.proyecto.citas.service.ClpSerializer;
import com.proyecto.citas.service.HorarioTrabajoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class HorarioTrabajoClp extends BaseModelImpl<HorarioTrabajo>
    implements HorarioTrabajo {
    private int _idHorario;
    private String _horaInicio;
    private String _horaFin;
    private String _horaInicioTarde;
    private String _horaFinTarde;
    private int _duracionCitas;
    private BaseModel<?> _horarioTrabajoRemoteModel;
    private Class<?> _clpSerializerClass = com.proyecto.citas.service.ClpSerializer.class;

    public HorarioTrabajoClp() {
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
    public int getPrimaryKey() {
        return _idHorario;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIdHorario(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idHorario;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getIdHorario() {
        return _idHorario;
    }

    @Override
    public void setIdHorario(int idHorario) {
        _idHorario = idHorario;

        if (_horarioTrabajoRemoteModel != null) {
            try {
                Class<?> clazz = _horarioTrabajoRemoteModel.getClass();

                Method method = clazz.getMethod("setIdHorario", int.class);

                method.invoke(_horarioTrabajoRemoteModel, idHorario);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHoraInicio() {
        return _horaInicio;
    }

    @Override
    public void setHoraInicio(String horaInicio) {
        _horaInicio = horaInicio;

        if (_horarioTrabajoRemoteModel != null) {
            try {
                Class<?> clazz = _horarioTrabajoRemoteModel.getClass();

                Method method = clazz.getMethod("setHoraInicio", String.class);

                method.invoke(_horarioTrabajoRemoteModel, horaInicio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHoraFin() {
        return _horaFin;
    }

    @Override
    public void setHoraFin(String horaFin) {
        _horaFin = horaFin;

        if (_horarioTrabajoRemoteModel != null) {
            try {
                Class<?> clazz = _horarioTrabajoRemoteModel.getClass();

                Method method = clazz.getMethod("setHoraFin", String.class);

                method.invoke(_horarioTrabajoRemoteModel, horaFin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHoraInicioTarde() {
        return _horaInicioTarde;
    }

    @Override
    public void setHoraInicioTarde(String horaInicioTarde) {
        _horaInicioTarde = horaInicioTarde;

        if (_horarioTrabajoRemoteModel != null) {
            try {
                Class<?> clazz = _horarioTrabajoRemoteModel.getClass();

                Method method = clazz.getMethod("setHoraInicioTarde",
                        String.class);

                method.invoke(_horarioTrabajoRemoteModel, horaInicioTarde);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHoraFinTarde() {
        return _horaFinTarde;
    }

    @Override
    public void setHoraFinTarde(String horaFinTarde) {
        _horaFinTarde = horaFinTarde;

        if (_horarioTrabajoRemoteModel != null) {
            try {
                Class<?> clazz = _horarioTrabajoRemoteModel.getClass();

                Method method = clazz.getMethod("setHoraFinTarde", String.class);

                method.invoke(_horarioTrabajoRemoteModel, horaFinTarde);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getDuracionCitas() {
        return _duracionCitas;
    }

    @Override
    public void setDuracionCitas(int duracionCitas) {
        _duracionCitas = duracionCitas;

        if (_horarioTrabajoRemoteModel != null) {
            try {
                Class<?> clazz = _horarioTrabajoRemoteModel.getClass();

                Method method = clazz.getMethod("setDuracionCitas", int.class);

                method.invoke(_horarioTrabajoRemoteModel, duracionCitas);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHorarioTrabajoRemoteModel() {
        return _horarioTrabajoRemoteModel;
    }

    public void setHorarioTrabajoRemoteModel(
        BaseModel<?> horarioTrabajoRemoteModel) {
        _horarioTrabajoRemoteModel = horarioTrabajoRemoteModel;
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

        Class<?> remoteModelClass = _horarioTrabajoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_horarioTrabajoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HorarioTrabajoLocalServiceUtil.addHorarioTrabajo(this);
        } else {
            HorarioTrabajoLocalServiceUtil.updateHorarioTrabajo(this);
        }
    }

    @Override
    public HorarioTrabajo toEscapedModel() {
        return (HorarioTrabajo) ProxyUtil.newProxyInstance(HorarioTrabajo.class.getClassLoader(),
            new Class[] { HorarioTrabajo.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HorarioTrabajoClp clone = new HorarioTrabajoClp();

        clone.setIdHorario(getIdHorario());
        clone.setHoraInicio(getHoraInicio());
        clone.setHoraFin(getHoraFin());
        clone.setHoraInicioTarde(getHoraInicioTarde());
        clone.setHoraFinTarde(getHoraFinTarde());
        clone.setDuracionCitas(getDuracionCitas());

        return clone;
    }

    @Override
    public int compareTo(HorarioTrabajo horarioTrabajo) {
        int primaryKey = horarioTrabajo.getPrimaryKey();

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

        if (!(obj instanceof HorarioTrabajoClp)) {
            return false;
        }

        HorarioTrabajoClp horarioTrabajo = (HorarioTrabajoClp) obj;

        int primaryKey = horarioTrabajo.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{idHorario=");
        sb.append(getIdHorario());
        sb.append(", horaInicio=");
        sb.append(getHoraInicio());
        sb.append(", horaFin=");
        sb.append(getHoraFin());
        sb.append(", horaInicioTarde=");
        sb.append(getHoraInicioTarde());
        sb.append(", horaFinTarde=");
        sb.append(getHoraFinTarde());
        sb.append(", duracionCitas=");
        sb.append(getDuracionCitas());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.proyecto.citas.model.HorarioTrabajo");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idHorario</column-name><column-value><![CDATA[");
        sb.append(getIdHorario());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>horaInicio</column-name><column-value><![CDATA[");
        sb.append(getHoraInicio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>horaFin</column-name><column-value><![CDATA[");
        sb.append(getHoraFin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>horaInicioTarde</column-name><column-value><![CDATA[");
        sb.append(getHoraInicioTarde());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>horaFinTarde</column-name><column-value><![CDATA[");
        sb.append(getHoraFinTarde());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>duracionCitas</column-name><column-value><![CDATA[");
        sb.append(getDuracionCitas());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
