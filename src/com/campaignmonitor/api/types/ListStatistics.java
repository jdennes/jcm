
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalActiveSubscribers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewActiveSubscribersToday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewActiveSubscribersYesterday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewActiveSubscribersThisWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewActiveSubscribersThisMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewActiveSubscribersThisYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStatistics", propOrder = {
    "totalActiveSubscribers",
    "newActiveSubscribersToday",
    "newActiveSubscribersYesterday",
    "newActiveSubscribersThisWeek",
    "newActiveSubscribersThisMonth",
    "newActiveSubscribersThisYear"
})
public class ListStatistics {

    @XmlElement(name = "TotalActiveSubscribers")
    protected int totalActiveSubscribers;
    @XmlElement(name = "NewActiveSubscribersToday")
    protected int newActiveSubscribersToday;
    @XmlElement(name = "NewActiveSubscribersYesterday")
    protected int newActiveSubscribersYesterday;
    @XmlElement(name = "NewActiveSubscribersThisWeek")
    protected int newActiveSubscribersThisWeek;
    @XmlElement(name = "NewActiveSubscribersThisMonth")
    protected int newActiveSubscribersThisMonth;
    @XmlElement(name = "NewActiveSubscribersThisYear")
    protected int newActiveSubscribersThisYear;

    /**
     * Gets the value of the totalActiveSubscribers property.
     * 
     */
    public int getTotalActiveSubscribers() {
        return totalActiveSubscribers;
    }

    /**
     * Sets the value of the totalActiveSubscribers property.
     * 
     */
    public void setTotalActiveSubscribers(int value) {
        this.totalActiveSubscribers = value;
    }

    /**
     * Gets the value of the newActiveSubscribersToday property.
     * 
     */
    public int getNewActiveSubscribersToday() {
        return newActiveSubscribersToday;
    }

    /**
     * Sets the value of the newActiveSubscribersToday property.
     * 
     */
    public void setNewActiveSubscribersToday(int value) {
        this.newActiveSubscribersToday = value;
    }

    /**
     * Gets the value of the newActiveSubscribersYesterday property.
     * 
     */
    public int getNewActiveSubscribersYesterday() {
        return newActiveSubscribersYesterday;
    }

    /**
     * Sets the value of the newActiveSubscribersYesterday property.
     * 
     */
    public void setNewActiveSubscribersYesterday(int value) {
        this.newActiveSubscribersYesterday = value;
    }

    /**
     * Gets the value of the newActiveSubscribersThisWeek property.
     * 
     */
    public int getNewActiveSubscribersThisWeek() {
        return newActiveSubscribersThisWeek;
    }

    /**
     * Sets the value of the newActiveSubscribersThisWeek property.
     * 
     */
    public void setNewActiveSubscribersThisWeek(int value) {
        this.newActiveSubscribersThisWeek = value;
    }

    /**
     * Gets the value of the newActiveSubscribersThisMonth property.
     * 
     */
    public int getNewActiveSubscribersThisMonth() {
        return newActiveSubscribersThisMonth;
    }

    /**
     * Sets the value of the newActiveSubscribersThisMonth property.
     * 
     */
    public void setNewActiveSubscribersThisMonth(int value) {
        this.newActiveSubscribersThisMonth = value;
    }

    /**
     * Gets the value of the newActiveSubscribersThisYear property.
     * 
     */
    public int getNewActiveSubscribersThisYear() {
        return newActiveSubscribersThisYear;
    }

    /**
     * Sets the value of the newActiveSubscribersThisYear property.
     * 
     */
    public void setNewActiveSubscribersThisYear(int value) {
        this.newActiveSubscribersThisYear = value;
    }

}
