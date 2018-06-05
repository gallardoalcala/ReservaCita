package com.proyecto.clientes.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ClienteSoap implements Serializable {
    private long _idCliente;
    private int _activado;
    private int _denegado;

    public ClienteSoap() {
    }

    public static ClienteSoap toSoapModel(Cliente model) {
        ClienteSoap soapModel = new ClienteSoap();

        soapModel.setIdCliente(model.getIdCliente());
        soapModel.setActivado(model.getActivado());
        soapModel.setDenegado(model.getDenegado());

        return soapModel;
    }

    public static ClienteSoap[] toSoapModels(Cliente[] models) {
        ClienteSoap[] soapModels = new ClienteSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ClienteSoap[][] toSoapModels(Cliente[][] models) {
        ClienteSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ClienteSoap[models.length][models[0].length];
        } else {
            soapModels = new ClienteSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ClienteSoap[] toSoapModels(List<Cliente> models) {
        List<ClienteSoap> soapModels = new ArrayList<ClienteSoap>(models.size());

        for (Cliente model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ClienteSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _idCliente;
    }

    public void setPrimaryKey(long pk) {
        setIdCliente(pk);
    }

    public long getIdCliente() {
        return _idCliente;
    }

    public void setIdCliente(long idCliente) {
        _idCliente = idCliente;
    }

    public int getActivado() {
        return _activado;
    }

    public void setActivado(int activado) {
        _activado = activado;
    }

    public int getDenegado() {
        return _denegado;
    }

    public void setDenegado(int denegado) {
        _denegado = denegado;
    }
}
