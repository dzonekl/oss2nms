package com.netxforge.oss2.xml.bind;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.netxforge.oss2.model.OnmsArpInterface.StatusType;

/**
 * StatusTypeXmlAdapter
 *
 * @author brozow
 * @version $Id: $
 */
public class StatusTypeXmlAdapter extends XmlAdapter<String, StatusType> {

    /** {@inheritDoc} */
    @Override
    public String marshal(StatusType statusTypr) throws Exception {
        return Character.toString(statusTypr.getCharCode());
    }

    /** {@inheritDoc} */
    @Override
    public StatusType unmarshal(String status) throws Exception {
        return StatusType.get(status);
    }

}