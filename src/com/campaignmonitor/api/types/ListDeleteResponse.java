
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
 *         &lt;element name="List.DeleteResult" type="{http://api.createsend.com/api/}Result" minOccurs="0"/>
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
    "listDeleteResult"
})
@XmlRootElement(name = "List.DeleteResponse")
public class ListDeleteResponse {

    @XmlElement(name = "List.DeleteResult")
    protected Result listDeleteResult;

    /**
     * Gets the value of the listDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getListDeleteResult() {
        return listDeleteResult;
    }

    /**
     * Sets the value of the listDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setListDeleteResult(Result value) {
        this.listDeleteResult = value;
    }

}
