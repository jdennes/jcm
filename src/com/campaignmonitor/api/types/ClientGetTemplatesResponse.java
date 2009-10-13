
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
 *         &lt;element name="Client.GetTemplatesResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "clientGetTemplatesResult"
})
@XmlRootElement(name = "Client.GetTemplatesResponse")
public class ClientGetTemplatesResponse {

    @XmlElement(name = "Client.GetTemplatesResult")
    protected Object clientGetTemplatesResult;

    /**
     * Gets the value of the clientGetTemplatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClientGetTemplatesResult() {
        return clientGetTemplatesResult;
    }

    /**
     * Sets the value of the clientGetTemplatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClientGetTemplatesResult(Object value) {
        this.clientGetTemplatesResult = value;
    }

}
