/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.wmi;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * An WMI Object Group
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Wpm implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of this group, for user id purposes
     *  
     */
    private java.lang.String _name;

    /**
     * This is the WMI object class that we'll be checking.
     *  
     */
    private java.lang.String _wmiClass;

    /**
     * The Key value which, if present, indicates that the rest of
     * this group should be collected
     *  
     */
    private java.lang.String _keyvalue;

    /**
     * Specifies how often the key value of this group
     *  should be rechecked for existence. In milliseconds
     *  
     */
    private int _recheckInterval;

    /**
     * keeps track of state for field: _recheckInterval
     */
    private boolean _has_recheckInterval;

    /**
     * Specifies the interface collection type.
     *  
     */
    private java.lang.String _ifType;

    /**
     * Specifies the name of the resource type that pertains to the
     * attributes
     *  in this group. For scalar attributes (those occurring once
     * per node,
     *  such as available system memory) this should be "node". For
     *  multi-instanced attributes, this should be the name of a
     * custom
     *  resource type declared in datacollection-config.xml.
     *  
     */
    private java.lang.String _resourceType;

    /**
     * An WMI Object
     *  
     */
    private java.util.List<com.netxforge.oss2.config.wmi.Attrib> _attribList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Wpm() {
        super();
        this._attribList = new java.util.ArrayList<com.netxforge.oss2.config.wmi.Attrib>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAttrib
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttrib(
            final com.netxforge.oss2.config.wmi.Attrib vAttrib)
    throws java.lang.IndexOutOfBoundsException {
        this._attribList.add(vAttrib);
    }

    /**
     * 
     * 
     * @param index
     * @param vAttrib
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttrib(
            final int index,
            final com.netxforge.oss2.config.wmi.Attrib vAttrib)
    throws java.lang.IndexOutOfBoundsException {
        this._attribList.add(index, vAttrib);
    }

    /**
     */
    public void deleteRecheckInterval(
    ) {
        this._has_recheckInterval= false;
    }

    /**
     * Method enumerateAttrib.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.wmi.Attrib> enumerateAttrib(
    ) {
        return java.util.Collections.enumeration(this._attribList);
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
        
        if (obj instanceof Wpm) {
        
            Wpm temp = (Wpm)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._wmiClass != null) {
                if (temp._wmiClass == null) return false;
                else if (!(this._wmiClass.equals(temp._wmiClass))) 
                    return false;
            }
            else if (temp._wmiClass != null)
                return false;
            if (this._keyvalue != null) {
                if (temp._keyvalue == null) return false;
                else if (!(this._keyvalue.equals(temp._keyvalue))) 
                    return false;
            }
            else if (temp._keyvalue != null)
                return false;
            if (this._recheckInterval != temp._recheckInterval)
                return false;
            if (this._has_recheckInterval != temp._has_recheckInterval)
                return false;
            if (this._ifType != null) {
                if (temp._ifType == null) return false;
                else if (!(this._ifType.equals(temp._ifType))) 
                    return false;
            }
            else if (temp._ifType != null)
                return false;
            if (this._resourceType != null) {
                if (temp._resourceType == null) return false;
                else if (!(this._resourceType.equals(temp._resourceType))) 
                    return false;
            }
            else if (temp._resourceType != null)
                return false;
            if (this._attribList != null) {
                if (temp._attribList == null) return false;
                else if (!(this._attribList.equals(temp._attribList))) 
                    return false;
            }
            else if (temp._attribList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAttrib.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.wmi.Attrib at the given index
     */
    public com.netxforge.oss2.config.wmi.Attrib getAttrib(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attribList.size()) {
            throw new IndexOutOfBoundsException("getAttrib: Index value '" + index + "' not in range [0.." + (this._attribList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.wmi.Attrib) _attribList.get(index);
    }

    /**
     * Method getAttrib.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.wmi.Attrib[] getAttrib(
    ) {
        com.netxforge.oss2.config.wmi.Attrib[] array = new com.netxforge.oss2.config.wmi.Attrib[0];
        return (com.netxforge.oss2.config.wmi.Attrib[]) this._attribList.toArray(array);
    }

    /**
     * Method getAttribCollection.Returns a reference to
     * '_attribList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.wmi.Attrib> getAttribCollection(
    ) {
        return this._attribList;
    }

    /**
     * Method getAttribCount.
     * 
     * @return the size of this collection
     */
    public int getAttribCount(
    ) {
        return this._attribList.size();
    }

    /**
     * Returns the value of field 'ifType'. The field 'ifType' has
     * the following description: Specifies the interface
     * collection type.
     *  
     * 
     * @return the value of field 'IfType'.
     */
    public java.lang.String getIfType(
    ) {
        return this._ifType;
    }

    /**
     * Returns the value of field 'keyvalue'. The field 'keyvalue'
     * has the following description: The Key value which, if
     * present, indicates that the rest of this group should be
     * collected
     *  
     * 
     * @return the value of field 'Keyvalue'.
     */
    public java.lang.String getKeyvalue(
    ) {
        return this._keyvalue;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The name of this group, for user id
     * purposes
     *  
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'recheckInterval'. The field
     * 'recheckInterval' has the following description: Specifies
     * how often the key value of this group
     *  should be rechecked for existence. In milliseconds
     *  
     * 
     * @return the value of field 'RecheckInterval'.
     */
    public int getRecheckInterval(
    ) {
        return this._recheckInterval;
    }

    /**
     * Returns the value of field 'resourceType'. The field
     * 'resourceType' has the following description: Specifies the
     * name of the resource type that pertains to the attributes
     *  in this group. For scalar attributes (those occurring once
     * per node,
     *  such as available system memory) this should be "node". For
     *  multi-instanced attributes, this should be the name of a
     * custom
     *  resource type declared in datacollection-config.xml.
     *  
     * 
     * @return the value of field 'ResourceType'.
     */
    public java.lang.String getResourceType(
    ) {
        return this._resourceType;
    }

    /**
     * Returns the value of field 'wmiClass'. The field 'wmiClass'
     * has the following description: This is the WMI object class
     * that we'll be checking.
     *  
     * 
     * @return the value of field 'WmiClass'.
     */
    public java.lang.String getWmiClass(
    ) {
        return this._wmiClass;
    }

    /**
     * Method hasRecheckInterval.
     * 
     * @return true if at least one RecheckInterval has been added
     */
    public boolean hasRecheckInterval(
    ) {
        return this._has_recheckInterval;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_wmiClass != null) {
           result = 37 * result + _wmiClass.hashCode();
        }
        if (_keyvalue != null) {
           result = 37 * result + _keyvalue.hashCode();
        }
        result = 37 * result + _recheckInterval;
        if (_ifType != null) {
           result = 37 * result + _ifType.hashCode();
        }
        if (_resourceType != null) {
           result = 37 * result + _resourceType.hashCode();
        }
        if (_attribList != null) {
           result = 37 * result + _attribList.hashCode();
        }
        
        return result;
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
     * Method iterateAttrib.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.wmi.Attrib> iterateAttrib(
    ) {
        return this._attribList.iterator();
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
    public void removeAllAttrib(
    ) {
        this._attribList.clear();
    }

    /**
     * Method removeAttrib.
     * 
     * @param vAttrib
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttrib(
            final com.netxforge.oss2.config.wmi.Attrib vAttrib) {
        boolean removed = _attribList.remove(vAttrib);
        return removed;
    }

    /**
     * Method removeAttribAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.wmi.Attrib removeAttribAt(
            final int index) {
        java.lang.Object obj = this._attribList.remove(index);
        return (com.netxforge.oss2.config.wmi.Attrib) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAttrib
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttrib(
            final int index,
            final com.netxforge.oss2.config.wmi.Attrib vAttrib)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attribList.size()) {
            throw new IndexOutOfBoundsException("setAttrib: Index value '" + index + "' not in range [0.." + (this._attribList.size() - 1) + "]");
        }
        
        this._attribList.set(index, vAttrib);
    }

    /**
     * 
     * 
     * @param vAttribArray
     */
    public void setAttrib(
            final com.netxforge.oss2.config.wmi.Attrib[] vAttribArray) {
        //-- copy array
        _attribList.clear();
        
        for (int i = 0; i < vAttribArray.length; i++) {
                this._attribList.add(vAttribArray[i]);
        }
    }

    /**
     * Sets the value of '_attribList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vAttribList the Vector to copy.
     */
    public void setAttrib(
            final java.util.List<com.netxforge.oss2.config.wmi.Attrib> vAttribList) {
        // copy vector
        this._attribList.clear();
        
        this._attribList.addAll(vAttribList);
    }

    /**
     * Sets the value of '_attribList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param attribList the Vector to set.
     */
    public void setAttribCollection(
            final java.util.List<com.netxforge.oss2.config.wmi.Attrib> attribList) {
        this._attribList = attribList;
    }

    /**
     * Sets the value of field 'ifType'. The field 'ifType' has the
     * following description: Specifies the interface collection
     * type.
     *  
     * 
     * @param ifType the value of field 'ifType'.
     */
    public void setIfType(
            final java.lang.String ifType) {
        this._ifType = ifType;
    }

    /**
     * Sets the value of field 'keyvalue'. The field 'keyvalue' has
     * the following description: The Key value which, if present,
     * indicates that the rest of this group should be collected
     *  
     * 
     * @param keyvalue the value of field 'keyvalue'.
     */
    public void setKeyvalue(
            final java.lang.String keyvalue) {
        this._keyvalue = keyvalue;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The name of this group, for user id
     * purposes
     *  
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'recheckInterval'. The field
     * 'recheckInterval' has the following description: Specifies
     * how often the key value of this group
     *  should be rechecked for existence. In milliseconds
     *  
     * 
     * @param recheckInterval the value of field 'recheckInterval'.
     */
    public void setRecheckInterval(
            final int recheckInterval) {
        this._recheckInterval = recheckInterval;
        this._has_recheckInterval = true;
    }

    /**
     * Sets the value of field 'resourceType'. The field
     * 'resourceType' has the following description: Specifies the
     * name of the resource type that pertains to the attributes
     *  in this group. For scalar attributes (those occurring once
     * per node,
     *  such as available system memory) this should be "node". For
     *  multi-instanced attributes, this should be the name of a
     * custom
     *  resource type declared in datacollection-config.xml.
     *  
     * 
     * @param resourceType the value of field 'resourceType'.
     */
    public void setResourceType(
            final java.lang.String resourceType) {
        this._resourceType = resourceType;
    }

    /**
     * Sets the value of field 'wmiClass'. The field 'wmiClass' has
     * the following description: This is the WMI object class that
     * we'll be checking.
     *  
     * 
     * @param wmiClass the value of field 'wmiClass'.
     */
    public void setWmiClass(
            final java.lang.String wmiClass) {
        this._wmiClass = wmiClass;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.netxforge.oss2.config.wmi.Wpm
     */
    public static com.netxforge.oss2.config.wmi.Wpm unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.wmi.Wpm) Unmarshaller.unmarshal(com.netxforge.oss2.config.wmi.Wpm.class, reader);
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
