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
public class DiaLibreSoap implements Serializable {
    private int _idLibre;
    private String _dia;
    private int _libre;
    private String _codigoDia;

    public DiaLibreSoap() {
    }

    public static DiaLibreSoap toSoapModel(DiaLibre model) {
        DiaLibreSoap soapModel = new DiaLibreSoap();

        soapModel.setIdLibre(model.getIdLibre());
        soapModel.setDia(model.getDia());
        soapModel.setLibre(model.getLibre());
        soapModel.setCodigoDia(model.getCodigoDia());

        return soapModel;
    }

    public static DiaLibreSoap[] toSoapModels(DiaLibre[] models) {
        DiaLibreSoap[] soapModels = new DiaLibreSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DiaLibreSoap[][] toSoapModels(DiaLibre[][] models) {
        DiaLibreSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DiaLibreSoap[models.length][models[0].length];
        } else {
            soapModels = new DiaLibreSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DiaLibreSoap[] toSoapModels(List<DiaLibre> models) {
        List<DiaLibreSoap> soapModels = new ArrayList<DiaLibreSoap>(models.size());

        for (DiaLibre model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DiaLibreSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idLibre;
    }

    public void setPrimaryKey(int pk) {
        setIdLibre(pk);
    }

    public int getIdLibre() {
        return _idLibre;
    }

    public void setIdLibre(int idLibre) {
        _idLibre = idLibre;
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

    public String getCodigoDia() {
        return _codigoDia;
    }

    public void setCodigoDia(String codigoDia) {
        _codigoDia = codigoDia;
    }
}
