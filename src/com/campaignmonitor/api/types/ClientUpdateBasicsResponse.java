
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
 *         &lt;element name="Client.UpdateBasicsResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "clientUpdateBasicsResult"
})
@XmlRootElement(name = "Client.UpdateBasicsResponse")
public class ClientUpdateBasicsResponse {

    @XmlElement(name = "Client.UpdateBasicsResult")
    protected Object clientUpdateBasicsResult;

    /**
     * Gets the value of the clientUpdateBasicsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClientUpdateBasicsResult() {
        return clientUpdateBasicsResult;
    }

    /**
     * Sets the value of the clientUpdateBasicsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClientUpdateBasicsResult(Object value) {
        this.clientUpdateBasicsResult = value;
    }

}
