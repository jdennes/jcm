
package com.campaignmonitor.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubscriberUnsubscribe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubscriberUnsubscribe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberUnsubscribe" type="{http://api.createsend.com/api/}SubscriberUnsubscribe" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubscriberUnsubscribe", propOrder = {
    "subscriberUnsubscribe"
})
public class ArrayOfSubscriberUnsubscribe {

    @XmlElement(name = "SubscriberUnsubscribe", nillable = true)
    protected List<SubscriberUnsubscribeType> subscriberUnsubscribe;

    /**
     * Gets the value of the subscriberUnsubscribe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberUnsubscribe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberUnsubscribe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberUnsubscribeType }
     * 
     * 
     */
    public List<SubscriberUnsubscribeType> getSubscriberUnsubscribe() {
        if (subscriberUnsubscribe == null) {
            subscriberUnsubscribe = new ArrayList<SubscriberUnsubscribeType>();
        }
        return this.subscriberUnsubscribe;
    }

}
