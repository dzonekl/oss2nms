/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2012 The OpenNMS Group, Inc.
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

package com.netxforge.oss2.model;

import com.netxforge.oss2.core.api.PollStatus;

/**
 * <p>PollResult class.</p>
 */
public class PollResult {
	
	private Integer m_id;
	private DemandPoll m_demandPoll;
	private OnmsMonitoredService m_monitoredService;
	private PollStatus m_status;
	
	/**
	 * <p>Constructor for PollResult.</p>
	 */
	public PollResult() {
		
	}
	
	/**
	 * <p>Constructor for PollResult.</p>
	 *
	 * @param id a int.
	 */
	public PollResult(int id) {
		m_id = id;
	}
	
	/**
	 * <p>getId</p>
	 *
	 * @return a {@link java.lang.Integer} object.
	 */
	public Integer getId() {
		return m_id;
	}

	/**
	 * <p>setId</p>
	 *
	 * @param id a int.
	 */
	public void setId(int id) {
		m_id = id;
	}

	/**
	 * <p>getMonitoredService</p>
	 *
	 * @return a {@link com.netxforge.oss2.model.OnmsMonitoredService} object.
	 */
	public OnmsMonitoredService getMonitoredService() {
		return m_monitoredService;
	}

	/**
	 * <p>setMonitoredService</p>
	 *
	 * @param monitoredService a {@link com.netxforge.oss2.model.OnmsMonitoredService} object.
	 */
	public void setMonitoredService(OnmsMonitoredService monitoredService) {
		m_monitoredService = monitoredService;
	}

	/**
	 * <p>getStatus</p>
	 *
	 * @return a {@link com.netxforge.oss2.model.PollStatus} object.
	 */
	public PollStatus getStatus() {
		return m_status;
	}

	/**
	 * <p>setStatus</p>
	 *
	 * @param status a {@link com.netxforge.oss2.model.PollStatus} object.
	 */
	public void setStatus(PollStatus status) {
		m_status = status;
	}

	/**
	 * <p>getDemandPoll</p>
	 *
	 * @return a {@link com.netxforge.oss2.model.DemandPoll} object.
	 */
	public DemandPoll getDemandPoll() {
		return m_demandPoll;
	}

	/**
	 * <p>setDemandPoll</p>
	 *
	 * @param poll a {@link com.netxforge.oss2.model.DemandPoll} object.
	 */
	public void setDemandPoll(DemandPoll poll) {
		this.m_demandPoll = poll;
	}	

}
