
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
 *         &lt;element name="Subscriber.AddAndResubscribeWithCustomFieldsResult" type="{http://api.createsend.com/api/}Result" minOccurs="0"/>
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
    "subscriberAddAndResubscribeWithCustomFieldsResult"
})
@XmlRootElement(name = "Subscriber.AddAndResubscribeWithCustomFieldsResponse")
public class SubscriberAddAndResubscribeWithCustomFieldsResponse {

    @XmlElement(name = "Subscriber.AddAndResubscribeWithCustomFieldsResult")
    protected Result subscriberAddAndResubscribeWithCustomFieldsResult;

    /**
     * Gets the value of the subscriberAddAndResubscribeWithCustomFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getSubscriberAddAndResubscribeWithCustomFieldsResult() {
        return subscriberAddAndResubscribeWithCustomFieldsResult;
    }

    /**
     * Sets the value of the subscriberAddAndResubscribeWithCustomFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setSubscriberAddAndResubscribeWithCustomFieldsResult(Result value) {
        this.subscriberAddAndResubscribeWithCustomFieldsResult = value;
    }

}
