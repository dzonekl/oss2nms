/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.destinationPaths;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Escalate.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Escalate implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _delay.
     */
    private java.lang.String _delay;

    /**
     * Field _targetList.
     */
    private java.util.List<com.netxforge.oss2.config.destinationPaths.Target> _targetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Escalate() {
        super();
        this._targetList = new java.util.ArrayList<com.netxforge.oss2.config.destinationPaths.Target>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final com.netxforge.oss2.config.destinationPaths.Target vTarget)
    throws java.lang.IndexOutOfBoundsException {
        this._targetList.add(vTarget);
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final int index,
            final com.netxforge.oss2.config.destinationPaths.Target vTarget)
    throws java.lang.IndexOutOfBoundsException {
        this._targetList.add(index, vTarget);
    }

    /**
     * Method enumerateTarget.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.destinationPaths.Target> enumerateTarget(
    ) {
        return java.util.Collections.enumeration(this._targetList);
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
        
        if (obj instanceof Escalate) {
        
            Escalate temp = (Escalate)obj;
            if (this._delay != null) {
                if (temp._delay == null) return false;
                else if (!(this._delay.equals(temp._delay))) 
                    return false;
            }
            else if (temp._delay != null)
                return false;
            if (this._targetList != null) {
                if (temp._targetList == null) return false;
                else if (!(this._targetList.equals(temp._targetList))) 
                    return false;
            }
            else if (temp._targetList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'delay'.
     * 
     * @return the value of field 'Delay'.
     */
    public java.lang.String getDelay(
    ) {
        return this._delay;
    }

    /**
     * Method getTarget.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.destinationPaths.Target at the
     * given index
     */
    public com.netxforge.oss2.config.destinationPaths.Target getTarget(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("getTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.destinationPaths.Target) _targetList.get(index);
    }

    /**
     * Method getTarget.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.destinationPaths.Target[] getTarget(
    ) {
        com.netxforge.oss2.config.destinationPaths.Target[] array = new com.netxforge.oss2.config.destinationPaths.Target[0];
        return (com.netxforge.oss2.config.destinationPaths.Target[]) this._targetList.toArray(array);
    }

    /**
     * Method getTargetCollection.Returns a reference to
     * '_targetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.destinationPaths.Target> getTargetCollection(
    ) {
        return this._targetList;
    }

    /**
     * Method getTargetCount.
     * 
     * @return the size of this collection
     */
    public int getTargetCount(
    ) {
        return this._targetList.size();
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
        if (_delay != null) {
           result = 37 * result + _delay.hashCode();
        }
        if (_targetList != null) {
           result = 37 * result + _targetList.hashCode();
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
     * Method iterateTarget.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.destinationPaths.Target> iterateTarget(
    ) {
        return this._targetList.iterator();
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
    public void removeAllTarget(
    ) {
        this._targetList.clear();
    }

    /**
     * Method removeTarget.
     * 
     * @param vTarget
     * @return true if the object was removed from the collection.
     */
    public boolean removeTarget(
            final com.netxforge.oss2.config.destinationPaths.Target vTarget) {
        boolean removed = _targetList.remove(vTarget);
        return removed;
    }

    /**
     * Method removeTargetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.destinationPaths.Target removeTargetAt(
            final int index) {
        java.lang.Object obj = this._targetList.remove(index);
        return (com.netxforge.oss2.config.destinationPaths.Target) obj;
    }

    /**
     * Sets the value of field 'delay'.
     * 
     * @param delay the value of field 'delay'.
     */
    public void setDelay(
            final java.lang.String delay) {
        this._delay = delay;
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTarget(
            final int index,
            final com.netxforge.oss2.config.destinationPaths.Target vTarget)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("setTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }
        
        this._targetList.set(index, vTarget);
    }

    /**
     * 
     * 
     * @param vTargetArray
     */
    public void setTarget(
            final com.netxforge.oss2.config.destinationPaths.Target[] vTargetArray) {
        //-- copy array
        _targetList.clear();
        
        for (int i = 0; i < vTargetArray.length; i++) {
                this._targetList.add(vTargetArray[i]);
        }
    }

    /**
     * Sets the value of '_targetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vTargetList the Vector to copy.
     */
    public void setTarget(
            final java.util.List<com.netxforge.oss2.config.destinationPaths.Target> vTargetList) {
        // copy vector
        this._targetList.clear();
        
        this._targetList.addAll(vTargetList);
    }

    /**
     * Sets the value of '_targetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param targetList the Vector to set.
     */
    public void setTargetCollection(
            final java.util.List<com.netxforge.oss2.config.destinationPaths.Target> targetList) {
        this._targetList = targetList;
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
     * com.netxforge.oss2.config.destinationPaths.Escalate
     */
    public static com.netxforge.oss2.config.destinationPaths.Escalate unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.destinationPaths.Escalate) Unmarshaller.unmarshal(com.netxforge.oss2.config.destinationPaths.Escalate.class, reader);
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
