package com.proyecto.citas.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.proyecto.citas.model.HorarioTrabajo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing HorarioTrabajo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HorarioTrabajo
 * @generated
 */
public class HorarioTrabajoCacheModel implements CacheModel<HorarioTrabajo>,
    Externalizable {
    public int idHorario;
    public String horaInicio;
    public String horaFin;
    public String horaInicioTarde;
    public String horaFinTarde;
    public int duracionCitas;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{idHorario=");
        sb.append(idHorario);
        sb.append(", horaInicio=");
        sb.append(horaInicio);
        sb.append(", horaFin=");
        sb.append(horaFin);
        sb.append(", horaInicioTarde=");
        sb.append(horaInicioTarde);
        sb.append(", horaFinTarde=");
        sb.append(horaFinTarde);
        sb.append(", duracionCitas=");
        sb.append(duracionCitas);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public HorarioTrabajo toEntityModel() {
        HorarioTrabajoImpl horarioTrabajoImpl = new HorarioTrabajoImpl();

        horarioTrabajoImpl.setIdHorario(idHorario);

        if (horaInicio == null) {
            horarioTrabajoImpl.setHoraInicio(StringPool.BLANK);
        } else {
            horarioTrabajoImpl.setHoraInicio(horaInicio);
        }

        if (horaFin == null) {
            horarioTrabajoImpl.setHoraFin(StringPool.BLANK);
        } else {
            horarioTrabajoImpl.setHoraFin(horaFin);
        }

        if (horaInicioTarde == null) {
            horarioTrabajoImpl.setHoraInicioTarde(StringPool.BLANK);
        } else {
            horarioTrabajoImpl.setHoraInicioTarde(horaInicioTarde);
        }

        if (horaFinTarde == null) {
            horarioTrabajoImpl.setHoraFinTarde(StringPool.BLANK);
        } else {
            horarioTrabajoImpl.setHoraFinTarde(horaFinTarde);
        }

        horarioTrabajoImpl.setDuracionCitas(duracionCitas);

        horarioTrabajoImpl.resetOriginalValues();

        return horarioTrabajoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idHorario = objectInput.readInt();
        horaInicio = objectInput.readUTF();
        horaFin = objectInput.readUTF();
        horaInicioTarde = objectInput.readUTF();
        horaFinTarde = objectInput.readUTF();
        duracionCitas = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(idHorario);

        if (horaInicio == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(horaInicio);
        }

        if (horaFin == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(horaFin);
        }

        if (horaInicioTarde == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(horaInicioTarde);
        }

        if (horaFinTarde == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(horaFinTarde);
        }

        objectOutput.writeInt(duracionCitas);
    }
}
