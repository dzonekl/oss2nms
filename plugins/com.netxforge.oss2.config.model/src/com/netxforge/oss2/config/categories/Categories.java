/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.categories;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Categories belonging to a category group.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Categories implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A category.
     */
    private java.util.List<com.netxforge.oss2.config.categories.Category> _categoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Categories() {
        super();
        this._categoryList = new java.util.ArrayList<com.netxforge.oss2.config.categories.Category>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final com.netxforge.oss2.config.categories.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(vCategory);
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final int index,
            final com.netxforge.oss2.config.categories.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(index, vCategory);
    }

    /**
     * Method enumerateCategory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<com.netxforge.oss2.config.categories.Category> enumerateCategory(
    ) {
        return java.util.Collections.enumeration(this._categoryList);
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
        
        if (obj instanceof Categories) {
        
            Categories temp = (Categories)obj;
            if (this._categoryList != null) {
                if (temp._categoryList == null) return false;
                else if (!(this._categoryList.equals(temp._categoryList))) 
                    return false;
            }
            else if (temp._categoryList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getCategory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.netxforge.oss2.config.categories.Category at the given
     * index
     */
    public com.netxforge.oss2.config.categories.Category getCategory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("getCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        return (com.netxforge.oss2.config.categories.Category) _categoryList.get(index);
    }

    /**
     * Method getCategory.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.netxforge.oss2.config.categories.Category[] getCategory(
    ) {
        com.netxforge.oss2.config.categories.Category[] array = new com.netxforge.oss2.config.categories.Category[0];
        return (com.netxforge.oss2.config.categories.Category[]) this._categoryList.toArray(array);
    }

    /**
     * Method getCategoryCollection.Returns a reference to
     * '_categoryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<com.netxforge.oss2.config.categories.Category> getCategoryCollection(
    ) {
        return this._categoryList;
    }

    /**
     * Method getCategoryCount.
     * 
     * @return the size of this collection
     */
    public int getCategoryCount(
    ) {
        return this._categoryList.size();
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
        if (_categoryList != null) {
           result = 37 * result + _categoryList.hashCode();
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
     * Method iterateCategory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<com.netxforge.oss2.config.categories.Category> iterateCategory(
    ) {
        return this._categoryList.iterator();
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
    public void removeAllCategory(
    ) {
        this._categoryList.clear();
    }

    /**
     * Method removeCategory.
     * 
     * @param vCategory
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategory(
            final com.netxforge.oss2.config.categories.Category vCategory) {
        boolean removed = _categoryList.remove(vCategory);
        return removed;
    }

    /**
     * Method removeCategoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.netxforge.oss2.config.categories.Category removeCategoryAt(
            final int index) {
        java.lang.Object obj = this._categoryList.remove(index);
        return (com.netxforge.oss2.config.categories.Category) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategory(
            final int index,
            final com.netxforge.oss2.config.categories.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("setCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        this._categoryList.set(index, vCategory);
    }

    /**
     * 
     * 
     * @param vCategoryArray
     */
    public void setCategory(
            final com.netxforge.oss2.config.categories.Category[] vCategoryArray) {
        //-- copy array
        _categoryList.clear();
        
        for (int i = 0; i < vCategoryArray.length; i++) {
                this._categoryList.add(vCategoryArray[i]);
        }
    }

    /**
     * Sets the value of '_categoryList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCategoryList the Vector to copy.
     */
    public void setCategory(
            final java.util.List<com.netxforge.oss2.config.categories.Category> vCategoryList) {
        // copy vector
        this._categoryList.clear();
        
        this._categoryList.addAll(vCategoryList);
    }

    /**
     * Sets the value of '_categoryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param categoryList the Vector to set.
     */
    public void setCategoryCollection(
            final java.util.List<com.netxforge.oss2.config.categories.Category> categoryList) {
        this._categoryList = categoryList;
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
     * com.netxforge.oss2.config.categories.Categories
     */
    public static com.netxforge.oss2.config.categories.Categories unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.categories.Categories) Unmarshaller.unmarshal(com.netxforge.oss2.config.categories.Categories.class, reader);
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
