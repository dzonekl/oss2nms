/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2007-2012 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2012 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package com.netxforge.oss2.services.discovery;

import java.net.InetAddress;

import com.netxforge.oss2.EventConstants;
import com.netxforge.oss2.core.utils.InetAddressUtils;
import com.netxforge.oss2.core.utilsII.ThreadCategory;
import com.netxforge.oss2.icmp.EchoPacket;
import com.netxforge.oss2.icmp.PingResponseCallback;
import com.netxforge.oss2.model.events.EventBuilder;

/**
 * <p>DiscoveryPingResponseCallback class.</p>
 *
 * @author <a href="mailto:ranger@opennms.org">Ben Reed</a>
 * @version $Id: $
 */
public class DiscoveryPingResponseCallback implements PingResponseCallback {
    final static String EVENT_SOURCE_VALUE = "OpenNMS.Discovery";

    /** {@inheritDoc} */
    public void handleResponse(InetAddress address, EchoPacket response) {
        EventBuilder eb = new EventBuilder(EventConstants.NEW_SUSPECT_INTERFACE_EVENT_UEI, EVENT_SOURCE_VALUE);
        eb.setInterface(address);
        eb.setHost(InetAddressUtils.getLocalHostName());

        eb.addParam("RTT", response.getReceivedTimeNanos() - response.getSentTimeNanos());

        try {
        	
        	// CB TODO, WE HAVE NOT MIGRATED THE EventD Service, so we don't fire the event.  
//            EventIpcManagerFactory.getIpcManager().sendNow(eb.getEvent());

            if (log().isDebugEnabled()) {
                log().debug("Sent event: " + EventConstants.NEW_SUSPECT_INTERFACE_EVENT_UEI);
            }
        } catch (Throwable t) {
            log().warn("run: unexpected throwable exception caught during send to middleware", t);
        }

    }

    /** {@inheritDoc} */
    public void handleTimeout(InetAddress address, EchoPacket request) {
        log().debug("request timed out: " + address);
    }

    /** {@inheritDoc} */
    public void handleError(InetAddress address, EchoPacket request, Throwable t) {
        log().debug("an error occurred pinging " + address, t);
    }

    private ThreadCategory log() {
        return ThreadCategory.getInstance(this.getClass());
    }

}
