/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.netxforge.oss2.config.filter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Join.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Join implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type.
     */
    private java.lang.String _type = "inner";

    /**
     * Field _column.
     */
    private java.lang.String _column;

    /**
     * Field _table.
     */
    private java.lang.String _table;

    /**
     * Field _tableColumn.
     */
    private java.lang.String _tableColumn;


      //----------------/
     //- Constructors -/
    //----------------/

    public Join() {
        super();
        setType("inner");
    }


      //-----------/
     //- Methods -/
    //-----------/

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
        
        if (obj instanceof Join) {
        
            Join temp = (Join)obj;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type))) 
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._column != null) {
                if (temp._column == null) return false;
                else if (!(this._column.equals(temp._column))) 
                    return false;
            }
            else if (temp._column != null)
                return false;
            if (this._table != null) {
                if (temp._table == null) return false;
                else if (!(this._table.equals(temp._table))) 
                    return false;
            }
            else if (temp._table != null)
                return false;
            if (this._tableColumn != null) {
                if (temp._tableColumn == null) return false;
                else if (!(this._tableColumn.equals(temp._tableColumn))) 
                    return false;
            }
            else if (temp._tableColumn != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'column'.
     * 
     * @return the value of field 'Column'.
     */
    public java.lang.String getColumn(
    ) {
        return this._column;
    }

    /**
     * Returns the value of field 'table'.
     * 
     * @return the value of field 'Table'.
     */
    public java.lang.String getTable(
    ) {
        return this._table;
    }

    /**
     * Returns the value of field 'tableColumn'.
     * 
     * @return the value of field 'TableColumn'.
     */
    public java.lang.String getTableColumn(
    ) {
        return this._tableColumn;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_column != null) {
           result = 37 * result + _column.hashCode();
        }
        if (_table != null) {
           result = 37 * result + _table.hashCode();
        }
        if (_tableColumn != null) {
           result = 37 * result + _tableColumn.hashCode();
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
     * Sets the value of field 'column'.
     * 
     * @param column the value of field 'column'.
     */
    public void setColumn(
            final java.lang.String column) {
        this._column = column;
    }

    /**
     * Sets the value of field 'table'.
     * 
     * @param table the value of field 'table'.
     */
    public void setTable(
            final java.lang.String table) {
        this._table = table;
    }

    /**
     * Sets the value of field 'tableColumn'.
     * 
     * @param tableColumn the value of field 'tableColumn'.
     */
    public void setTableColumn(
            final java.lang.String tableColumn) {
        this._tableColumn = tableColumn;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.netxforge.oss2.config.filter.Join
     */
    public static com.netxforge.oss2.config.filter.Join unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.netxforge.oss2.config.filter.Join) Unmarshaller.unmarshal(com.netxforge.oss2.config.filter.Join.class, reader);
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
