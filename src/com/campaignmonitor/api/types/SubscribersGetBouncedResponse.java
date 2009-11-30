
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
 *         &lt;element name="Subscribers.GetBouncedResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "subscribersGetBouncedResult"
})
@XmlRootElement(name = "Subscribers.GetBouncedResponse")
public class SubscribersGetBouncedResponse {

    @XmlElement(name = "Subscribers.GetBouncedResult")
    protected Object subscribersGetBouncedResult;

    /**
     * Gets the value of the subscribersGetBouncedResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubscribersGetBouncedResult() {
        return subscribersGetBouncedResult;
    }

    /**
     * Sets the value of the subscribersGetBouncedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubscribersGetBouncedResult(Object value) {
        this.subscribersGetBouncedResult = value;
    }

}
