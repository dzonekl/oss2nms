/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2008-2012 The OpenNMS Group, Inc.
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

package com.netxforge.oss2.model.events;

/**
 * <p>EventProxyException class.</p>
 */
public class EventProxyException extends Exception {
    
    /**
     * 
     */
    private static final long serialVersionUID = -5163171630068781718L;

    /**
     * <p>Constructor for EventProxyException.</p>
     */
    public EventProxyException() {
        super();
    }
    
    /**
     * <p>Constructor for EventProxyException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public EventProxyException(String message) {
        super(message);
    }
    
    /**
     * <p>Constructor for EventProxyException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     */
    public EventProxyException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * <p>Constructor for EventProxyException.</p>
     *
     * @param cause a {@link java.lang.Throwable} object.
     */
    public EventProxyException(Throwable cause) {
        super(cause);
    }
}