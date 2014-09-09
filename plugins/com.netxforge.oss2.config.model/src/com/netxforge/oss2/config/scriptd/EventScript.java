/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.scriptd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class EventScript.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class EventScript implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _language.
     */
    private java.lang.String _language;

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Field _ueiList.
     */
    private java.util.List<com.netxforge.oss2.config.scriptd.Uei> _ueiList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventScript() {
        super();
        setContent("");
        this._ueiList = new java.util.ArrayList<com.netxforge.oss2.config.scriptd.Uei>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUei(
            final com.netxforge.oss2.config.scriptd.Uei vUei)
    throws java.lang.IndexOutOfBoundsException {
        this._ueiList.add(vUei);
    }

    /**
     * 
     * 
     * @param index
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUei(
            final int index,
            final com.netxforge.oss2.config.scriptd.Uei vUei)
    throws java.lang.IndexOutOfBoundsException {
        this._ueiList.add(index, vUei);
    }

    /**
     * Method enumerateUei.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.scriptd.Uei> enumerateUei(
    ) {
        return java.util.Collections.enumeration(this._ueiList);
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
        
        if (obj instanceof EventScript) {
        
            EventScript temp = (EventScript)obj;
            if (this._language != null) {
                if (temp._language == null) return false;
                else if (!(this._language.equals(temp._language))) 
                    return false;
            }
            else if (temp._language != null)
                return false;
            if (this._content != null) {
                if (temp._content == null) return false;
                else if (!(this._content.equals(temp._content))) 
                    return false;
            }
            else if (temp._content != null)
                return false;
            if (this._ueiList != null) {
                if (temp._ueiList == null) return false;
                else if (!(this._ueiList.equals(temp._ueiList))) 
                    return false;
            }
            else if (temp._ueiList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public java.lang.String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'language'.
     * 
     * @return the value of field 'Language'.
     */
    public java.lang.String getLanguage(
    ) {
        return this._language;
    }

    /**
     * Method getUei.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.scriptd.Uei at the given index
     */
    public com.netxforge.oss2.config.scriptd.Uei getUei(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiList.size()) {
            throw new IndexOutOfBoundsException("getUei: Index value '" + index + "' not in range [0.." + (this._ueiList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.scriptd.Uei) _ueiList.get(index);
    }

    /**
     * Method getUei.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.scriptd.Uei[] getUei(
    ) {
        com.netxforge.oss2.config.scriptd.Uei[] array = new com.netxforge.oss2.config.scriptd.Uei[0];
        return (com.netxforge.oss2.config.scriptd.Uei[]) this._ueiList.toArray(array);
    }

    /**
     * Method getUeiCollection.Returns a reference to '_ueiList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.scriptd.Uei> getUeiCollection(
    ) {
        return this._ueiList;
    }

    /**
     * Method getUeiCount.
     * 
     * @return the size of this collection
     */
    public int getUeiCount(
    ) {
        return this._ueiList.size();
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
        if (_language != null) {
           result = 37 * result + _language.hashCode();
        }
        if (_content != null) {
           result = 37 * result + _content.hashCode();
        }
        if (_ueiList != null) {
           result = 37 * result + _ueiList.hashCode();
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
     * Method iterateUei.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.scriptd.Uei> iterateUei(
    ) {
        return this._ueiList.iterator();
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
    public void removeAllUei(
    ) {
        this._ueiList.clear();
    }

    /**
     * Method removeUei.
     * 
     * @param vUei
     * @return true if the object was removed from the collection.
     */
    public boolean removeUei(
            final com.netxforge.oss2.config.scriptd.Uei vUei) {
        boolean removed = _ueiList.remove(vUei);
        return removed;
    }

    /**
     * Method removeUeiAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.scriptd.Uei removeUeiAt(
            final int index) {
        java.lang.Object obj = this._ueiList.remove(index);
        return (com.netxforge.oss2.config.scriptd.Uei) obj;
    }

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.lang.String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'language'.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(
            final java.lang.String language) {
        this._language = language;
    }

    /**
     * 
     * 
     * @param index
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUei(
            final int index,
            final com.netxforge.oss2.config.scriptd.Uei vUei)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiList.size()) {
            throw new IndexOutOfBoundsException("setUei: Index value '" + index + "' not in range [0.." + (this._ueiList.size() - 1) + "]");
        }
        
        this._ueiList.set(index, vUei);
    }

    /**
     * 
     * 
     * @param vUeiArray
     */
    public void setUei(
            final com.netxforge.oss2.config.scriptd.Uei[] vUeiArray) {
        //-- copy array
        _ueiList.clear();
        
        for (int i = 0; i < vUeiArray.length; i++) {
                this._ueiList.add(vUeiArray[i]);
        }
    }

    /**
     * Sets the value of '_ueiList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vUeiList the Vector to copy.
     */
    public void setUei(
            final java.util.List<com.netxforge.oss2.config.scriptd.Uei> vUeiList) {
        // copy vector
        this._ueiList.clear();
        
        this._ueiList.addAll(vUeiList);
    }

    /**
     * Sets the value of '_ueiList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ueiList the Vector to set.
     */
    public void setUeiCollection(
            final java.util.List<com.netxforge.oss2.config.scriptd.Uei> ueiList) {
        this._ueiList = ueiList;
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
     * com.netxforge.oss2.config.scriptd.EventScript
     */
    public static com.netxforge.oss2.config.scriptd.EventScript unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.scriptd.EventScript) Unmarshaller.unmarshal(com.netxforge.oss2.config.scriptd.EventScript.class, reader);
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
