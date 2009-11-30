
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
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberListIDs" type="{http://api.createsend.com/api/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ListSegments" type="{http://api.createsend.com/api/}ArrayOfList" minOccurs="0"/>
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
    "campaignName",
    "campaignSubject",
    "fromName",
    "fromEmail",
    "replyTo",
    "htmlUrl",
    "textUrl",
    "subscriberListIDs",
    "listSegments"
})
@XmlRootElement(name = "Campaign.Create")
public class CampaignCreate {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "CampaignName")
    protected String campaignName;
    @XmlElement(name = "CampaignSubject")
    protected String campaignSubject;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "FromEmail")
    protected String fromEmail;
    @XmlElement(name = "ReplyTo")
    protected String replyTo;
    @XmlElement(name = "HtmlUrl")
    protected String htmlUrl;
    @XmlElement(name = "TextUrl")
    protected String textUrl;
    @XmlElement(name = "SubscriberListIDs")
    protected ArrayOfString subscriberListIDs;
    @XmlElement(name = "ListSegments")
    protected ArrayOfList listSegments;

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
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the campaignSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignSubject() {
        return campaignSubject;
    }

    /**
     * Sets the value of the campaignSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignSubject(String value) {
        this.campaignSubject = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the fromEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEmail() {
        return fromEmail;
    }

    /**
     * Sets the value of the fromEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEmail(String value) {
        this.fromEmail = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the htmlUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Sets the value of the htmlUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlUrl(String value) {
        this.htmlUrl = value;
    }

    /**
     * Gets the value of the textUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextUrl() {
        return textUrl;
    }

    /**
     * Sets the value of the textUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextUrl(String value) {
        this.textUrl = value;
    }

    /**
     * Gets the value of the subscriberListIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSubscriberListIDs() {
        return subscriberListIDs;
    }

    /**
     * Sets the value of the subscriberListIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSubscriberListIDs(ArrayOfString value) {
        this.subscriberListIDs = value;
    }

    /**
     * Gets the value of the listSegments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfList }
     *     
     */
    public ArrayOfList getListSegments() {
        return listSegments;
    }

    /**
     * Sets the value of the listSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfList }
     *     
     */
    public void setListSegments(ArrayOfList value) {
        this.listSegments = value;
    }

}
