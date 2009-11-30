
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
 *         &lt;element name="Client.DeleteResult" type="{http://api.createsend.com/api/}Result" minOccurs="0"/>
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
    "clientDeleteResult"
})
@XmlRootElement(name = "Client.DeleteResponse")
public class ClientDeleteResponse {

    @XmlElement(name = "Client.DeleteResult")
    protected Result clientDeleteResult;

    /**
     * Gets the value of the clientDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getClientDeleteResult() {
        return clientDeleteResult;
    }

    /**
     * Sets the value of the clientDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setClientDeleteResult(Result value) {
        this.clientDeleteResult = value;
    }

}
