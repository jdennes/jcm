
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberClick complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberClick">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClickedLinks" type="{http://api.createsend.com/api/}ArrayOfSubscriberClickedLink" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberClick", propOrder = {
    "emailAddress",
    "listID",
    "clickedLinks"
})
public class SubscriberClick {

    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "ClickedLinks")
    protected ArrayOfSubscriberClickedLink clickedLinks;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the clickedLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriberClickedLink }
     *     
     */
    public ArrayOfSubscriberClickedLink getClickedLinks() {
        return clickedLinks;
    }

    /**
     * Sets the value of the clickedLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriberClickedLink }
     *     
     */
    public void setClickedLinks(ArrayOfSubscriberClickedLink value) {
        this.clickedLinks = value;
    }

}
