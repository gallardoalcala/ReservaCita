package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.proyecto.citas.model.DiasLibres;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DiasLibres in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DiasLibres
 * @generated
 */
public class DiasLibresCacheModel implements CacheModel<DiasLibres>,
    Externalizable {
    public String dia;
    public int libre;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{dia=");
        sb.append(dia);
        sb.append(", libre=");
        sb.append(libre);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DiasLibres toEntityModel() {
        DiasLibresImpl diasLibresImpl = new DiasLibresImpl();

        if (dia == null) {
            diasLibresImpl.setDia(StringPool.BLANK);
        } else {
            diasLibresImpl.setDia(dia);
        }

        diasLibresImpl.setLibre(libre);

        diasLibresImpl.resetOriginalValues();

        return diasLibresImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        dia = objectInput.readUTF();
        libre = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (dia == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dia);
        }

        objectOutput.writeInt(libre);
    }
}
