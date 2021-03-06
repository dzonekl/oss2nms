/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2012 The OpenNMS Group, Inc.
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

package com.netxforge.oss2.core.utils;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class TimeoutSocketFactory {

    private final int m_timeout;
    private final SocketWrapper m_socketWrapper;

    public TimeoutSocketFactory(final int timeout) {
        this(timeout, null);
    }

    /**
     * Oh noes, dyslexia!!!
     */
    public TimeoutSocketFactory(final int timeout, final SocketWrapper wocketSrapper) {
        m_timeout = timeout;
        m_socketWrapper = wocketSrapper;
    }

    public Socket createSocket(final String host, final int port) throws IOException, UnknownHostException {
        Socket socket = new Socket(host, port);
        socket.setSoTimeout(m_timeout);
        if (m_socketWrapper != null) {
            socket = m_socketWrapper.wrapSocket(socket);
        }
        return socket;
    }
}