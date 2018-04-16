package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.proyecto.citas.model.Cita;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Cita in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Cita
 * @generated
 */
public class CitaCacheModel implements CacheModel<Cita>, Externalizable {
    public int idCita;
    public int idCliente;
    public long fechaCita;
    public String descripcion;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idCita=");
        sb.append(idCita);
        sb.append(", idCliente=");
        sb.append(idCliente);
        sb.append(", fechaCita=");
        sb.append(fechaCita);
        sb.append(", descripcion=");
        sb.append(descripcion);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Cita toEntityModel() {
        CitaImpl citaImpl = new CitaImpl();

        citaImpl.setIdCita(idCita);
        citaImpl.setIdCliente(idCliente);

        if (fechaCita == Long.MIN_VALUE) {
            citaImpl.setFechaCita(null);
        } else {
            citaImpl.setFechaCita(new Date(fechaCita));
        }

        if (descripcion == null) {
            citaImpl.setDescripcion(StringPool.BLANK);
        } else {
            citaImpl.setDescripcion(descripcion);
        }

        citaImpl.resetOriginalValues();

        return citaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idCita = objectInput.readInt();
        idCliente = objectInput.readInt();
        fechaCita = objectInput.readLong();
        descripcion = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idCita);
        objectOutput.writeInt(idCliente);
        objectOutput.writeLong(fechaCita);

        if (descripcion == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descripcion);
        }
    }
}
