package com.proyecto.clientes.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.proyecto.clientes.service.CitaLocalServiceUtil;
import com.proyecto.clientes.service.ClienteLocalServiceUtil;
import com.proyecto.clientes.service.ClpSerializer;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            CitaLocalServiceUtil.clearService();

            ClienteLocalServiceUtil.clearService();
        }
    }
}
