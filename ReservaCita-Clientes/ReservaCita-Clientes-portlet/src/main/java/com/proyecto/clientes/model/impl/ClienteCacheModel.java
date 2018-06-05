package com.proyecto.clientes.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.proyecto.clientes.model.Cliente;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Cliente in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Cliente
 * @generated
 */
public class ClienteCacheModel implements CacheModel<Cliente>, Externalizable {
    public long idCliente;
    public int activado;
    public int denegado;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{idCliente=");
        sb.append(idCliente);
        sb.append(", activado=");
        sb.append(activado);
        sb.append(", denegado=");
        sb.append(denegado);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Cliente toEntityModel() {
        ClienteImpl clienteImpl = new ClienteImpl();

        clienteImpl.setIdCliente(idCliente);
        clienteImpl.setActivado(activado);
        clienteImpl.setDenegado(denegado);

        clienteImpl.resetOriginalValues();

        return clienteImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idCliente = objectInput.readLong();
        activado = objectInput.readInt();
        denegado = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idCliente);
        objectOutput.writeInt(activado);
        objectOutput.writeInt(denegado);
    }
}
