package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.proyecto.citas.model.DiasFestivos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DiasFestivos in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DiasFestivos
 * @generated
 */
public class DiasFestivosCacheModel implements CacheModel<DiasFestivos>,
    Externalizable {
    public int idFestivo;
    public long fechaFestivo;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idFestivo=");
        sb.append(idFestivo);
        sb.append(", fechaFestivo=");
        sb.append(fechaFestivo);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DiasFestivos toEntityModel() {
        DiasFestivosImpl diasFestivosImpl = new DiasFestivosImpl();

        diasFestivosImpl.setIdFestivo(idFestivo);

        if (fechaFestivo == Long.MIN_VALUE) {
            diasFestivosImpl.setFechaFestivo(null);
        } else {
            diasFestivosImpl.setFechaFestivo(new Date(fechaFestivo));
        }

        diasFestivosImpl.resetOriginalValues();

        return diasFestivosImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idFestivo = objectInput.readInt();
        fechaFestivo = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idFestivo);
        objectOutput.writeLong(fechaFestivo);
    }
}
