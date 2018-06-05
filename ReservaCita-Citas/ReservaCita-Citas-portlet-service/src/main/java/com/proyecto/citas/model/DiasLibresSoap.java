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
public class DiasLibresSoap implements Serializable {
    private String _dia;
    private int _libre;

    public DiasLibresSoap() {
    }

    public static DiasLibresSoap toSoapModel(DiasLibres model) {
        DiasLibresSoap soapModel = new DiasLibresSoap();

        soapModel.setDia(model.getDia());
        soapModel.setLibre(model.getLibre());

        return soapModel;
    }

    public static DiasLibresSoap[] toSoapModels(DiasLibres[] models) {
        DiasLibresSoap[] soapModels = new DiasLibresSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DiasLibresSoap[][] toSoapModels(DiasLibres[][] models) {
        DiasLibresSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DiasLibresSoap[models.length][models[0].length];
        } else {
            soapModels = new DiasLibresSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DiasLibresSoap[] toSoapModels(List<DiasLibres> models) {
        List<DiasLibresSoap> soapModels = new ArrayList<DiasLibresSoap>(models.size());

        for (DiasLibres model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DiasLibresSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _dia;
    }

    public void setPrimaryKey(String pk) {
        setDia(pk);
    }

    public String getDia() {
        return _dia;
    }

    public void setDia(String dia) {
        _dia = dia;
    }

    public int getLibre() {
        return _libre;
    }

    public void setLibre(int libre) {
        _libre = libre;
    }
}
