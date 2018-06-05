package com.proyecto.citas.model;

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
public class DiaFestivoSoap implements Serializable {
    private int _idFestivo;
    private Date _fechaFestivo;

    public DiaFestivoSoap() {
    }

    public static DiaFestivoSoap toSoapModel(DiaFestivo model) {
        DiaFestivoSoap soapModel = new DiaFestivoSoap();

        soapModel.setIdFestivo(model.getIdFestivo());
        soapModel.setFechaFestivo(model.getFechaFestivo());

        return soapModel;
    }

    public static DiaFestivoSoap[] toSoapModels(DiaFestivo[] models) {
        DiaFestivoSoap[] soapModels = new DiaFestivoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DiaFestivoSoap[][] toSoapModels(DiaFestivo[][] models) {
        DiaFestivoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DiaFestivoSoap[models.length][models[0].length];
        } else {
            soapModels = new DiaFestivoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DiaFestivoSoap[] toSoapModels(List<DiaFestivo> models) {
        List<DiaFestivoSoap> soapModels = new ArrayList<DiaFestivoSoap>(models.size());

        for (DiaFestivo model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DiaFestivoSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _idFestivo;
    }

    public void setPrimaryKey(int pk) {
        setIdFestivo(pk);
    }

    public int getIdFestivo() {
        return _idFestivo;
    }

    public void setIdFestivo(int idFestivo) {
        _idFestivo = idFestivo;
    }

    public Date getFechaFestivo() {
        return _fechaFestivo;
    }

    public void setFechaFestivo(Date fechaFestivo) {
        _fechaFestivo = fechaFestivo;
    }
}
