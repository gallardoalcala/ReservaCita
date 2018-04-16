package com.proyecto.clientes.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CitaSoap implements Serializable {
    private int _idCita;
    private int _idCliente;
    private Date _fechaCita;
    private String _descripcion;

    public CitaSoap() {
    }

    public static CitaSoap toSoapModel(Cita model) {
        CitaSoap soapModel = new CitaSoap();

        soapModel.setIdCita(model.getIdCita());
        soapModel.setIdCliente(model.getIdCliente());
        soapModel.setFechaCita(model.getFechaCita());
        soapModel.setDescripcion(model.getDescripcion());

        return soapModel;
    }

    public static CitaSoap[] toSoapModels(Cita[] models) {
        CitaSoap[] soapModels = new CitaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CitaSoap[][] toSoapModels(Cita[][] models) {
        CitaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CitaSoap[models.length][models[0].length];
        } else {
            soapModels = new CitaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CitaSoap[] toSoapModels(List<Cita> models) {
        List<CitaSoap> soapModels = new ArrayList<CitaSoap>(models.size());

        for (Cita model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CitaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idCita;
    }

    public void setPrimaryKey(int pk) {
        setIdCita(pk);
    }

    public int getIdCita() {
        return _idCita;
    }

    public void setIdCita(int idCita) {
        _idCita = idCita;
    }

    public int getIdCliente() {
        return _idCliente;
    }

    public void setIdCliente(int idCliente) {
        _idCliente = idCliente;
    }

    public Date getFechaCita() {
        return _fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        _fechaCita = fechaCita;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }
}
