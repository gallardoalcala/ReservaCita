package com.proyecto.citas.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.proyecto.citas.service.CitaLocalServiceUtil;
import com.proyecto.citas.service.ClpSerializer;
import com.proyecto.citas.service.DiaFestivoLocalServiceUtil;
import com.proyecto.citas.service.DiaLibreLocalServiceUtil;
import com.proyecto.citas.service.HorarioTrabajoLocalServiceUtil;


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

            DiaFestivoLocalServiceUtil.clearService();

            DiaLibreLocalServiceUtil.clearService();

            HorarioTrabajoLocalServiceUtil.clearService();
        }
    }
}
