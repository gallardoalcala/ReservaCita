package com.proyecto.citas.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HorarioTrabajoPK implements Comparable<HorarioTrabajoPK>,
    Serializable {
    public int idHorario;
    public String nombreDia;

    public HorarioTrabajoPK() {
    }

    public HorarioTrabajoPK(int idHorario, String nombreDia) {
        this.idHorario = idHorario;
        this.nombreDia = nombreDia;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    @Override
    public int compareTo(HorarioTrabajoPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (idHorario < pk.idHorario) {
            value = -1;
        } else if (idHorario > pk.idHorario) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = nombreDia.compareTo(pk.nombreDia);

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HorarioTrabajoPK)) {
            return false;
        }

        HorarioTrabajoPK pk = (HorarioTrabajoPK) obj;

        if ((idHorario == pk.idHorario) && (nombreDia.equals(pk.nombreDia))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idHorario) + String.valueOf(nombreDia)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idHorario");
        sb.append(StringPool.EQUAL);
        sb.append(idHorario);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("nombreDia");
        sb.append(StringPool.EQUAL);
        sb.append(nombreDia);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
