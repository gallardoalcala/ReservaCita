package com.proyecto.citas.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HorarioTrabajoSoap implements Serializable {
    private int _idHorario;
    private String _horaInicio;
    private String _horaFin;
    private String _horaInicioTarde;
    private String _horaFinTarde;
    private int _duracionCitas;

    public HorarioTrabajoSoap() {
    }

    public static HorarioTrabajoSoap toSoapModel(HorarioTrabajo model) {
        HorarioTrabajoSoap soapModel = new HorarioTrabajoSoap();

        soapModel.setIdHorario(model.getIdHorario());
        soapModel.setHoraInicio(model.getHoraInicio());
        soapModel.setHoraFin(model.getHoraFin());
        soapModel.setHoraInicioTarde(model.getHoraInicioTarde());
        soapModel.setHoraFinTarde(model.getHoraFinTarde());
        soapModel.setDuracionCitas(model.getDuracionCitas());

        return soapModel;
    }

    public static HorarioTrabajoSoap[] toSoapModels(HorarioTrabajo[] models) {
        HorarioTrabajoSoap[] soapModels = new HorarioTrabajoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HorarioTrabajoSoap[][] toSoapModels(HorarioTrabajo[][] models) {
        HorarioTrabajoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HorarioTrabajoSoap[models.length][models[0].length];
        } else {
            soapModels = new HorarioTrabajoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HorarioTrabajoSoap[] toSoapModels(List<HorarioTrabajo> models) {
        List<HorarioTrabajoSoap> soapModels = new ArrayList<HorarioTrabajoSoap>(models.size());

        for (HorarioTrabajo model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HorarioTrabajoSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idHorario;
    }

    public void setPrimaryKey(int pk) {
        setIdHorario(pk);
    }

    public int getIdHorario() {
        return _idHorario;
    }

    public void setIdHorario(int idHorario) {
        _idHorario = idHorario;
    }

    public String getHoraInicio() {
        return _horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        _horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return _horaFin;
    }

    public void setHoraFin(String horaFin) {
        _horaFin = horaFin;
    }

    public String getHoraInicioTarde() {
        return _horaInicioTarde;
    }

    public void setHoraInicioTarde(String horaInicioTarde) {
        _horaInicioTarde = horaInicioTarde;
    }

    public String getHoraFinTarde() {
        return _horaFinTarde;
    }

    public void setHoraFinTarde(String horaFinTarde) {
        _horaFinTarde = horaFinTarde;
    }

    public int getDuracionCitas() {
        return _duracionCitas;
    }

    public void setDuracionCitas(int duracionCitas) {
        _duracionCitas = duracionCitas;
    }
}
