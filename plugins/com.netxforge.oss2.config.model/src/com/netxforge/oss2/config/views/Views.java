/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.views;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Views.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Views implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _viewList.
     */
    private java.util.List<com.netxforge.oss2.config.views.View> _viewList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Views() {
        super();
        this._viewList = new java.util.ArrayList<com.netxforge.oss2.config.views.View>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vView
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addView(
            final com.netxforge.oss2.config.views.View vView)
    throws java.lang.IndexOutOfBoundsException {
        this._viewList.add(vView);
    }

    /**
     * 
     * 
     * @param index
     * @param vView
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addView(
            final int index,
            final com.netxforge.oss2.config.views.View vView)
    throws java.lang.IndexOutOfBoundsException {
        this._viewList.add(index, vView);
    }

    /**
     * Method enumerateView.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.views.View> enumerateView(
    ) {
        return java.util.Collections.enumeration(this._viewList);
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
        
        if (obj instanceof Views) {
        
            Views temp = (Views)obj;
            if (this._viewList != null) {
                if (temp._viewList == null) return false;
                else if (!(this._viewList.equals(temp._viewList))) 
                    return false;
            }
            else if (temp._viewList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getView.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.views.View at the given index
     */
    public com.netxforge.oss2.config.views.View getView(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._viewList.size()) {
            throw new IndexOutOfBoundsException("getView: Index value '" + index + "' not in range [0.." + (this._viewList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.views.View) _viewList.get(index);
    }

    /**
     * Method getView.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.views.View[] getView(
    ) {
        com.netxforge.oss2.config.views.View[] array = new com.netxforge.oss2.config.views.View[0];
        return (com.netxforge.oss2.config.views.View[]) this._viewList.toArray(array);
    }

    /**
     * Method getViewCollection.Returns a reference to '_viewList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.views.View> getViewCollection(
    ) {
        return this._viewList;
    }

    /**
     * Method getViewCount.
     * 
     * @return the size of this collection
     */
    public int getViewCount(
    ) {
        return this._viewList.size();
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
        if (_viewList != null) {
           result = 37 * result + _viewList.hashCode();
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
     * Method iterateView.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.views.View> iterateView(
    ) {
        return this._viewList.iterator();
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
    public void removeAllView(
    ) {
        this._viewList.clear();
    }

    /**
     * Method removeView.
     * 
     * @param vView
     * @return true if the object was removed from the collection.
     */
    public boolean removeView(
            final com.netxforge.oss2.config.views.View vView) {
        boolean removed = _viewList.remove(vView);
        return removed;
    }

    /**
     * Method removeViewAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.views.View removeViewAt(
            final int index) {
        java.lang.Object obj = this._viewList.remove(index);
        return (com.netxforge.oss2.config.views.View) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vView
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setView(
            final int index,
            final com.netxforge.oss2.config.views.View vView)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._viewList.size()) {
            throw new IndexOutOfBoundsException("setView: Index value '" + index + "' not in range [0.." + (this._viewList.size() - 1) + "]");
        }
        
        this._viewList.set(index, vView);
    }

    /**
     * 
     * 
     * @param vViewArray
     */
    public void setView(
            final com.netxforge.oss2.config.views.View[] vViewArray) {
        //-- copy array
        _viewList.clear();
        
        for (int i = 0; i < vViewArray.length; i++) {
                this._viewList.add(vViewArray[i]);
        }
    }

    /**
     * Sets the value of '_viewList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vViewList the Vector to copy.
     */
    public void setView(
            final java.util.List<com.netxforge.oss2.config.views.View> vViewList) {
        // copy vector
        this._viewList.clear();
        
        this._viewList.addAll(vViewList);
    }

    /**
     * Sets the value of '_viewList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param viewList the Vector to set.
     */
    public void setViewCollection(
            final java.util.List<com.netxforge.oss2.config.views.View> viewList) {
        this._viewList = viewList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.netxforge.oss2.config.views.Views
     */
    public static com.netxforge.oss2.config.views.Views unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.views.Views) Unmarshaller.unmarshal(com.netxforge.oss2.config.views.Views.class, reader);
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
