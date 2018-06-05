package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.proyecto.citas.model.DiaLibre;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DiaLibre in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DiaLibre
 * @generated
 */
public class DiaLibreCacheModel implements CacheModel<DiaLibre>, Externalizable {
    public int idLibre;
    public String dia;
    public int libre;
    public String codigoDia;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idLibre=");
        sb.append(idLibre);
        sb.append(", dia=");
        sb.append(dia);
        sb.append(", libre=");
        sb.append(libre);
        sb.append(", codigoDia=");
        sb.append(codigoDia);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DiaLibre toEntityModel() {
        DiaLibreImpl diaLibreImpl = new DiaLibreImpl();

        diaLibreImpl.setIdLibre(idLibre);

        if (dia == null) {
            diaLibreImpl.setDia(StringPool.BLANK);
        } else {
            diaLibreImpl.setDia(dia);
        }

        diaLibreImpl.setLibre(libre);

        if (codigoDia == null) {
            diaLibreImpl.setCodigoDia(StringPool.BLANK);
        } else {
            diaLibreImpl.setCodigoDia(codigoDia);
        }

        diaLibreImpl.resetOriginalValues();

        return diaLibreImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idLibre = objectInput.readInt();
        dia = objectInput.readUTF();
        libre = objectInput.readInt();
        codigoDia = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idLibre);

        if (dia == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dia);
        }

        objectOutput.writeInt(libre);

        if (codigoDia == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(codigoDia);
        }
    }
}
