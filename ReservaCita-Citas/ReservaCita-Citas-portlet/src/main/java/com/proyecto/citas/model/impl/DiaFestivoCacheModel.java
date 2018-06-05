package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.proyecto.citas.model.DiaFestivo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DiaFestivo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DiaFestivo
 * @generated
 */
public class DiaFestivoCacheModel implements CacheModel<DiaFestivo>,
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
    public DiaFestivo toEntityModel() {
        DiaFestivoImpl diaFestivoImpl = new DiaFestivoImpl();

        diaFestivoImpl.setIdFestivo(idFestivo);

        if (fechaFestivo == Long.MIN_VALUE) {
            diaFestivoImpl.setFechaFestivo(null);
        } else {
            diaFestivoImpl.setFechaFestivo(new Date(fechaFestivo));
        }

        diaFestivoImpl.resetOriginalValues();

        return diaFestivoImpl;
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
