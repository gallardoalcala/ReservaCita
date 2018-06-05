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
public class DiasFestivosSoap implements Serializable {
    private int _idFestivo;
    private Date _fechaFestivo;

    public DiasFestivosSoap() {
    }

    public static DiasFestivosSoap toSoapModel(DiasFestivos model) {
        DiasFestivosSoap soapModel = new DiasFestivosSoap();

        soapModel.setIdFestivo(model.getIdFestivo());
        soapModel.setFechaFestivo(model.getFechaFestivo());

        return soapModel;
    }

    public static DiasFestivosSoap[] toSoapModels(DiasFestivos[] models) {
        DiasFestivosSoap[] soapModels = new DiasFestivosSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DiasFestivosSoap[][] toSoapModels(DiasFestivos[][] models) {
        DiasFestivosSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DiasFestivosSoap[models.length][models[0].length];
        } else {
            soapModels = new DiasFestivosSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DiasFestivosSoap[] toSoapModels(List<DiasFestivos> models) {
        List<DiasFestivosSoap> soapModels = new ArrayList<DiasFestivosSoap>(models.size());

        for (DiasFestivos model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DiasFestivosSoap[soapModels.size()]);
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
