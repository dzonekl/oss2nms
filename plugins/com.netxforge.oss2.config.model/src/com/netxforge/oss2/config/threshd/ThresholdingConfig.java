/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.threshd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the thresholds.xml configuration file.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ThresholdingConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Thresholding group element
     */
    private java.util.List<com.netxforge.oss2.config.threshd.Group> _groupList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ThresholdingConfig() {
        super();
        this._groupList = new java.util.ArrayList<com.netxforge.oss2.config.threshd.Group>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vGroup
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroup(
            final com.netxforge.oss2.config.threshd.Group vGroup)
    throws java.lang.IndexOutOfBoundsException {
        this._groupList.add(vGroup);
    }

    /**
     * 
     * 
     * @param index
     * @param vGroup
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroup(
            final int index,
            final com.netxforge.oss2.config.threshd.Group vGroup)
    throws java.lang.IndexOutOfBoundsException {
        this._groupList.add(index, vGroup);
    }

    /**
     * Method enumerateGroup.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.threshd.Group> enumerateGroup(
    ) {
        return java.util.Collections.enumeration(this._groupList);
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
        
        if (obj instanceof ThresholdingConfig) {
        
            ThresholdingConfig temp = (ThresholdingConfig)obj;
            if (this._groupList != null) {
                if (temp._groupList == null) return false;
                else if (!(this._groupList.equals(temp._groupList))) 
                    return false;
            }
            else if (temp._groupList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getGroup.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.threshd.Group at the given index
     */
    public com.netxforge.oss2.config.threshd.Group getGroup(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._groupList.size()) {
            throw new IndexOutOfBoundsException("getGroup: Index value '" + index + "' not in range [0.." + (this._groupList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.threshd.Group) _groupList.get(index);
    }

    /**
     * Method getGroup.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.threshd.Group[] getGroup(
    ) {
        com.netxforge.oss2.config.threshd.Group[] array = new com.netxforge.oss2.config.threshd.Group[0];
        return (com.netxforge.oss2.config.threshd.Group[]) this._groupList.toArray(array);
    }

    /**
     * Method getGroupCollection.Returns a reference to
     * '_groupList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.threshd.Group> getGroupCollection(
    ) {
        return this._groupList;
    }

    /**
     * Method getGroupCount.
     * 
     * @return the size of this collection
     */
    public int getGroupCount(
    ) {
        return this._groupList.size();
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
        if (_groupList != null) {
           result = 37 * result + _groupList.hashCode();
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
     * Method iterateGroup.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.threshd.Group> iterateGroup(
    ) {
        return this._groupList.iterator();
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
    public void removeAllGroup(
    ) {
        this._groupList.clear();
    }

    /**
     * Method removeGroup.
     * 
     * @param vGroup
     * @return true if the object was removed from the collection.
     */
    public boolean removeGroup(
            final com.netxforge.oss2.config.threshd.Group vGroup) {
        boolean removed = _groupList.remove(vGroup);
        return removed;
    }

    /**
     * Method removeGroupAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.threshd.Group removeGroupAt(
            final int index) {
        java.lang.Object obj = this._groupList.remove(index);
        return (com.netxforge.oss2.config.threshd.Group) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vGroup
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGroup(
            final int index,
            final com.netxforge.oss2.config.threshd.Group vGroup)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._groupList.size()) {
            throw new IndexOutOfBoundsException("setGroup: Index value '" + index + "' not in range [0.." + (this._groupList.size() - 1) + "]");
        }
        
        this._groupList.set(index, vGroup);
    }

    /**
     * 
     * 
     * @param vGroupArray
     */
    public void setGroup(
            final com.netxforge.oss2.config.threshd.Group[] vGroupArray) {
        //-- copy array
        _groupList.clear();
        
        for (int i = 0; i < vGroupArray.length; i++) {
                this._groupList.add(vGroupArray[i]);
        }
    }

    /**
     * Sets the value of '_groupList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vGroupList the Vector to copy.
     */
    public void setGroup(
            final java.util.List<com.netxforge.oss2.config.threshd.Group> vGroupList) {
        // copy vector
        this._groupList.clear();
        
        this._groupList.addAll(vGroupList);
    }

    /**
     * Sets the value of '_groupList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param groupList the Vector to set.
     */
    public void setGroupCollection(
            final java.util.List<com.netxforge.oss2.config.threshd.Group> groupList) {
        this._groupList = groupList;
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
     * com.netxforge.oss2.config.threshd.ThresholdingConfig
     */
    public static com.netxforge.oss2.config.threshd.ThresholdingConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.threshd.ThresholdingConfig) Unmarshaller.unmarshal(com.netxforge.oss2.config.threshd.ThresholdingConfig.class, reader);
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
