
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recipients" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalOpened" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Unsubscribed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Bounced" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignSummary", propOrder = {
    "recipients",
    "totalOpened",
    "clicks",
    "unsubscribed",
    "bounced"
})
public class CampaignSummary {

    @XmlElement(name = "Recipients")
    protected int recipients;
    @XmlElement(name = "TotalOpened")
    protected int totalOpened;
    @XmlElement(name = "Clicks")
    protected int clicks;
    @XmlElement(name = "Unsubscribed")
    protected int unsubscribed;
    @XmlElement(name = "Bounced")
    protected int bounced;

    /**
     * Gets the value of the recipients property.
     * 
     */
    public int getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     */
    public void setRecipients(int value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the totalOpened property.
     * 
     */
    public int getTotalOpened() {
        return totalOpened;
    }

    /**
     * Sets the value of the totalOpened property.
     * 
     */
    public void setTotalOpened(int value) {
        this.totalOpened = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     */
    public int getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     */
    public void setClicks(int value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the unsubscribed property.
     * 
     */
    public int getUnsubscribed() {
        return unsubscribed;
    }

    /**
     * Sets the value of the unsubscribed property.
     * 
     */
    public void setUnsubscribed(int value) {
        this.unsubscribed = value;
    }

    /**
     * Gets the value of the bounced property.
     * 
     */
    public int getBounced() {
        return bounced;
    }

    /**
     * Sets the value of the bounced property.
     * 
     */
    public void setBounced(int value) {
        this.bounced = value;
    }

}
