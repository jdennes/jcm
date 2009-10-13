
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
 *         &lt;element name="ApiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostPerRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignAndSpamTestFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "apiKey",
    "clientID",
    "accessLevel",
    "username",
    "password",
    "billingType",
    "currency",
    "deliveryFee",
    "costPerRecipient",
    "designAndSpamTestFee"
})
@XmlRootElement(name = "Client.UpdateAccessAndBilling")
public class ClientUpdateAccessAndBilling {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "AccessLevel")
    protected int accessLevel;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "BillingType")
    protected String billingType;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "DeliveryFee")
    protected String deliveryFee;
    @XmlElement(name = "CostPerRecipient")
    protected String costPerRecipient;
    @XmlElement(name = "DesignAndSpamTestFee")
    protected String designAndSpamTestFee;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     */
    public void setAccessLevel(int value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the billingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Sets the value of the billingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the deliveryFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * Sets the value of the deliveryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryFee(String value) {
        this.deliveryFee = value;
    }

    /**
     * Gets the value of the costPerRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostPerRecipient() {
        return costPerRecipient;
    }

    /**
     * Sets the value of the costPerRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostPerRecipient(String value) {
        this.costPerRecipient = value;
    }

    /**
     * Gets the value of the designAndSpamTestFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignAndSpamTestFee() {
        return designAndSpamTestFee;
    }

    /**
     * Sets the value of the designAndSpamTestFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignAndSpamTestFee(String value) {
        this.designAndSpamTestFee = value;
    }

}
