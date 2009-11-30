
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List.CreateResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listCreateResult"
})
@XmlRootElement(name = "List.CreateResponse")
public class ListCreateResponse {

    @XmlElement(name = "List.CreateResult")
    protected Object listCreateResult;

    /**
     * Gets the value of the listCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getListCreateResult() {
        return listCreateResult;
    }

    /**
     * Sets the value of the listCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setListCreateResult(Object value) {
        this.listCreateResult = value;
    }

}
