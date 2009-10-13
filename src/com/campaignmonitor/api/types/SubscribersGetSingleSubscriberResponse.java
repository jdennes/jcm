
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
 *         &lt;element name="Subscribers.GetSingleSubscriberResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "subscribersGetSingleSubscriberResult"
})
@XmlRootElement(name = "Subscribers.GetSingleSubscriberResponse")
public class SubscribersGetSingleSubscriberResponse {

    @XmlElement(name = "Subscribers.GetSingleSubscriberResult")
    protected Object subscribersGetSingleSubscriberResult;

    /**
     * Gets the value of the subscribersGetSingleSubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubscribersGetSingleSubscriberResult() {
        return subscribersGetSingleSubscriberResult;
    }

    /**
     * Sets the value of the subscribersGetSingleSubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubscribersGetSingleSubscriberResult(Object value) {
        this.subscribersGetSingleSubscriberResult = value;
    }

}
