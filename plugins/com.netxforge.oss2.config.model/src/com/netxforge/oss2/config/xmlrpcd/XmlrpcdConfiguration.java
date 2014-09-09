/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.xmlrpcd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the xmlrpcd-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class XmlrpcdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Maximum size of the event queue
     */
    private int _maxEventQueueSize;

    /**
     * keeps track of state for field: _maxEventQueueSize
     */
    private boolean _has_maxEventQueueSize;

    /**
     * True if using the generic message RPC instead of
     *  the original 6 RPCs
     */
    private boolean _genericMsgs = false;

    /**
     * keeps track of state for field: _genericMsgs
     */
    private boolean _has_genericMsgs;

    /**
     * Configuration of external XMLRPC
     *  servers
     */
    private java.util.List<com.netxforge.oss2.config.xmlrpcd.ExternalServers> _externalServersList;

    /**
     * Group of events that can be subscribed by 
     *  XMLRPC servers
     */
    private java.util.List<com.netxforge.oss2.config.xmlrpcd.Subscription> _subscriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XmlrpcdConfiguration() {
        super();
        this._externalServersList = new java.util.ArrayList<com.netxforge.oss2.config.xmlrpcd.ExternalServers>();
        this._subscriptionList = new java.util.ArrayList<com.netxforge.oss2.config.xmlrpcd.Subscription>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExternalServers
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExternalServers(
            final com.netxforge.oss2.config.xmlrpcd.ExternalServers vExternalServers)
    throws java.lang.IndexOutOfBoundsException {
        this._externalServersList.add(vExternalServers);
    }

    /**
     * 
     * 
     * @param index
     * @param vExternalServers
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExternalServers(
            final int index,
            final com.netxforge.oss2.config.xmlrpcd.ExternalServers vExternalServers)
    throws java.lang.IndexOutOfBoundsException {
        this._externalServersList.add(index, vExternalServers);
    }

    /**
     * 
     * 
     * @param vSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubscription(
            final com.netxforge.oss2.config.xmlrpcd.Subscription vSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._subscriptionList.add(vSubscription);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubscription(
            final int index,
            final com.netxforge.oss2.config.xmlrpcd.Subscription vSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._subscriptionList.add(index, vSubscription);
    }

    /**
     */
    public void deleteGenericMsgs(
    ) {
        this._has_genericMsgs= false;
    }

    /**
     */
    public void deleteMaxEventQueueSize(
    ) {
        this._has_maxEventQueueSize= false;
    }

    /**
     * Method enumerateExternalServers.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.xmlrpcd.ExternalServers> enumerateExternalServers(
    ) {
        return java.util.Collections.enumeration(this._externalServersList);
    }

    /**
     * Method enumerateSubscription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.xmlrpcd.Subscription> enumerateSubscription(
    ) {
        return java.util.Collections.enumeration(this._subscriptionList);
    }

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final java.lang.Object obj) {
        if ( this == obj )
            return true;
        
        if (obj instanceof XmlrpcdConfiguration) {
        
            XmlrpcdConfiguration temp = (XmlrpcdConfiguration)obj;
            if (this._maxEventQueueSize != temp._maxEventQueueSize)
                return false;
            if (this._has_maxEventQueueSize != temp._has_maxEventQueueSize)
                return false;
            if (this._genericMsgs != temp._genericMsgs)
                return false;
            if (this._has_genericMsgs != temp._has_genericMsgs)
                return false;
            if (this._externalServersList != null) {
                if (temp._externalServersList == null) return false;
                else if (!(this._externalServersList.equals(temp._externalServersList))) 
                    return false;
            }
            else if (temp._externalServersList != null)
                return false;
            if (this._subscriptionList != null) {
                if (temp._subscriptionList == null) return false;
                else if (!(this._subscriptionList.equals(temp._subscriptionList))) 
                    return false;
            }
            else if (temp._subscriptionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getExternalServers.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.xmlrpcd.ExternalServers at the
     * given index
     */
    public com.netxforge.oss2.config.xmlrpcd.ExternalServers getExternalServers(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._externalServersList.size()) {
            throw new IndexOutOfBoundsException("getExternalServers: Index value '" + index + "' not in range [0.." + (this._externalServersList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.xmlrpcd.ExternalServers) _externalServersList.get(index);
    }

    /**
     * Method getExternalServers.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.xmlrpcd.ExternalServers[] getExternalServers(
    ) {
        com.netxforge.oss2.config.xmlrpcd.ExternalServers[] array = new com.netxforge.oss2.config.xmlrpcd.ExternalServers[0];
        return (com.netxforge.oss2.config.xmlrpcd.ExternalServers[]) this._externalServersList.toArray(array);
    }

    /**
     * Method getExternalServersCollection.Returns a reference to
     * '_externalServersList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.xmlrpcd.ExternalServers> getExternalServersCollection(
    ) {
        return this._externalServersList;
    }

    /**
     * Method getExternalServersCount.
     * 
     * @return the size of this collection
     */
    public int getExternalServersCount(
    ) {
        return this._externalServersList.size();
    }

    /**
     * Returns the value of field 'genericMsgs'. The field
     * 'genericMsgs' has the following description: True if using
     * the generic message RPC instead of
     *  the original 6 RPCs
     * 
     * @return the value of field 'GenericMsgs'.
     */
    public boolean getGenericMsgs(
    ) {
        return this._genericMsgs;
    }

    /**
     * Returns the value of field 'maxEventQueueSize'. The field
     * 'maxEventQueueSize' has the following description: Maximum
     * size of the event queue
     * 
     * @return the value of field 'MaxEventQueueSize'.
     */
    public int getMaxEventQueueSize(
    ) {
        return this._maxEventQueueSize;
    }

    /**
     * Method getSubscription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.xmlrpcd.Subscription at the given
     * index
     */
    public com.netxforge.oss2.config.xmlrpcd.Subscription getSubscription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subscriptionList.size()) {
            throw new IndexOutOfBoundsException("getSubscription: Index value '" + index + "' not in range [0.." + (this._subscriptionList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.xmlrpcd.Subscription) _subscriptionList.get(index);
    }

    /**
     * Method getSubscription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.xmlrpcd.Subscription[] getSubscription(
    ) {
        com.netxforge.oss2.config.xmlrpcd.Subscription[] array = new com.netxforge.oss2.config.xmlrpcd.Subscription[0];
        return (com.netxforge.oss2.config.xmlrpcd.Subscription[]) this._subscriptionList.toArray(array);
    }

    /**
     * Method getSubscriptionCollection.Returns a reference to
     * '_subscriptionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.xmlrpcd.Subscription> getSubscriptionCollection(
    ) {
        return this._subscriptionList;
    }

    /**
     * Method getSubscriptionCount.
     * 
     * @return the size of this collection
     */
    public int getSubscriptionCount(
    ) {
        return this._subscriptionList.size();
    }

    /**
     * Method hasGenericMsgs.
     * 
     * @return true if at least one GenericMsgs has been added
     */
    public boolean hasGenericMsgs(
    ) {
        return this._has_genericMsgs;
    }

    /**
     * Method hasMaxEventQueueSize.
     * 
     * @return true if at least one MaxEventQueueSize has been added
     */
    public boolean hasMaxEventQueueSize(
    ) {
        return this._has_maxEventQueueSize;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = 17;
        
        long tmp;
        result = 37 * result + _maxEventQueueSize;
        result = 37 * result + (_genericMsgs?0:1);
        if (_externalServersList != null) {
           result = 37 * result + _externalServersList.hashCode();
        }
        if (_subscriptionList != null) {
           result = 37 * result + _subscriptionList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'genericMsgs'. The field
     * 'genericMsgs' has the following description: True if using
     * the generic message RPC instead of
     *  the original 6 RPCs
     * 
     * @return the value of field 'GenericMsgs'.
     */
    public boolean isGenericMsgs(
    ) {
        return this._genericMsgs;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateExternalServers.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.xmlrpcd.ExternalServers> iterateExternalServers(
    ) {
        return this._externalServersList.iterator();
    }

    /**
     * Method iterateSubscription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.xmlrpcd.Subscription> iterateSubscription(
    ) {
        return this._subscriptionList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllExternalServers(
    ) {
        this._externalServersList.clear();
    }

    /**
     */
    public void removeAllSubscription(
    ) {
        this._subscriptionList.clear();
    }

    /**
     * Method removeExternalServers.
     * 
     * @param vExternalServers
     * @return true if the object was removed from the collection.
     */
    public boolean removeExternalServers(
            final com.netxforge.oss2.config.xmlrpcd.ExternalServers vExternalServers) {
        boolean removed = _externalServersList.remove(vExternalServers);
        return removed;
    }

    /**
     * Method removeExternalServersAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.xmlrpcd.ExternalServers removeExternalServersAt(
            final int index) {
        java.lang.Object obj = this._externalServersList.remove(index);
        return (com.netxforge.oss2.config.xmlrpcd.ExternalServers) obj;
    }

    /**
     * Method removeSubscription.
     * 
     * @param vSubscription
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubscription(
            final com.netxforge.oss2.config.xmlrpcd.Subscription vSubscription) {
        boolean removed = _subscriptionList.remove(vSubscription);
        return removed;
    }

    /**
     * Method removeSubscriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.xmlrpcd.Subscription removeSubscriptionAt(
            final int index) {
        java.lang.Object obj = this._subscriptionList.remove(index);
        return (com.netxforge.oss2.config.xmlrpcd.Subscription) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExternalServers
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExternalServers(
            final int index,
            final com.netxforge.oss2.config.xmlrpcd.ExternalServers vExternalServers)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._externalServersList.size()) {
            throw new IndexOutOfBoundsException("setExternalServers: Index value '" + index + "' not in range [0.." + (this._externalServersList.size() - 1) + "]");
        }
        
        this._externalServersList.set(index, vExternalServers);
    }

    /**
     * 
     * 
     * @param vExternalServersArray
     */
    public void setExternalServers(
            final com.netxforge.oss2.config.xmlrpcd.ExternalServers[] vExternalServersArray) {
        //-- copy array
        _externalServersList.clear();
        
        for (int i = 0; i < vExternalServersArray.length; i++) {
                this._externalServersList.add(vExternalServersArray[i]);
        }
    }

    /**
     * Sets the value of '_externalServersList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vExternalServersList the Vector to copy.
     */
    public void setExternalServers(
            final java.util.List<com.netxforge.oss2.config.xmlrpcd.ExternalServers> vExternalServersList) {
        // copy vector
        this._externalServersList.clear();
        
        this._externalServersList.addAll(vExternalServersList);
    }

    /**
     * Sets the value of '_externalServersList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param externalServersList the Vector to set.
     */
    public void setExternalServersCollection(
            final java.util.List<com.netxforge.oss2.config.xmlrpcd.ExternalServers> externalServersList) {
        this._externalServersList = externalServersList;
    }

    /**
     * Sets the value of field 'genericMsgs'. The field
     * 'genericMsgs' has the following description: True if using
     * the generic message RPC instead of
     *  the original 6 RPCs
     * 
     * @param genericMsgs the value of field 'genericMsgs'.
     */
    public void setGenericMsgs(
            final boolean genericMsgs) {
        this._genericMsgs = genericMsgs;
        this._has_genericMsgs = true;
    }

    /**
     * Sets the value of field 'maxEventQueueSize'. The field
     * 'maxEventQueueSize' has the following description: Maximum
     * size of the event queue
     * 
     * @param maxEventQueueSize the value of field
     * 'maxEventQueueSize'.
     */
    public void setMaxEventQueueSize(
            final int maxEventQueueSize) {
        this._maxEventQueueSize = maxEventQueueSize;
        this._has_maxEventQueueSize = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubscription(
            final int index,
            final com.netxforge.oss2.config.xmlrpcd.Subscription vSubscription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subscriptionList.size()) {
            throw new IndexOutOfBoundsException("setSubscription: Index value '" + index + "' not in range [0.." + (this._subscriptionList.size() - 1) + "]");
        }
        
        this._subscriptionList.set(index, vSubscription);
    }

    /**
     * 
     * 
     * @param vSubscriptionArray
     */
    public void setSubscription(
            final com.netxforge.oss2.config.xmlrpcd.Subscription[] vSubscriptionArray) {
        //-- copy array
        _subscriptionList.clear();
        
        for (int i = 0; i < vSubscriptionArray.length; i++) {
                this._subscriptionList.add(vSubscriptionArray[i]);
        }
    }

    /**
     * Sets the value of '_subscriptionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSubscriptionList the Vector to copy.
     */
    public void setSubscription(
            final java.util.List<com.netxforge.oss2.config.xmlrpcd.Subscription> vSubscriptionList) {
        // copy vector
        this._subscriptionList.clear();
        
        this._subscriptionList.addAll(vSubscriptionList);
    }

    /**
     * Sets the value of '_subscriptionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param subscriptionList the Vector to set.
     */
    public void setSubscriptionCollection(
            final java.util.List<com.netxforge.oss2.config.xmlrpcd.Subscription> subscriptionList) {
        this._subscriptionList = subscriptionList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.netxforge.oss2.config.xmlrpcd.XmlrpcdConfiguration
     */
    public static com.netxforge.oss2.config.xmlrpcd.XmlrpcdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.xmlrpcd.XmlrpcdConfiguration) Unmarshaller.unmarshal(com.netxforge.oss2.config.xmlrpcd.XmlrpcdConfiguration.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
