
package com.campaignmonitor.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfListCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListCustomField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListCustomField" type="{http://api.createsend.com/api/}ListCustomField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListCustomField", propOrder = {
    "listCustomField"
})
public class ArrayOfListCustomField {

    @XmlElement(name = "ListCustomField", nillable = true)
    protected List<ListCustomField> listCustomField;

    /**
     * Gets the value of the listCustomField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCustomField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListCustomField }
     * 
     * 
     */
    public List<ListCustomField> getListCustomField() {
        if (listCustomField == null) {
            listCustomField = new ArrayList<ListCustomField>();
        }
        return this.listCustomField;
    }

}
