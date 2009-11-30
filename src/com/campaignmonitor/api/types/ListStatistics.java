
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
 *         &lt;element name="TotalUnsubscribes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnsubscribesToday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnsubscribesYesterday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnsubscribesThisWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnsubscribesThisMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnsubscribesThisYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeletedToday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeletedYesterday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeletedThisWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeletedThisMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeletedThisYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalBounces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BouncesToday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BouncesYesterday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BouncesThisWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BouncesThisMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BouncesThisYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "newActiveSubscribersThisYear",
    "totalUnsubscribes",
    "unsubscribesToday",
    "unsubscribesYesterday",
    "unsubscribesThisWeek",
    "unsubscribesThisMonth",
    "unsubscribesThisYear",
    "totalDeleted",
    "deletedToday",
    "deletedYesterday",
    "deletedThisWeek",
    "deletedThisMonth",
    "deletedThisYear",
    "totalBounces",
    "bouncesToday",
    "bouncesYesterday",
    "bouncesThisWeek",
    "bouncesThisMonth",
    "bouncesThisYear"
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
    @XmlElement(name = "TotalUnsubscribes")
    protected int totalUnsubscribes;
    @XmlElement(name = "UnsubscribesToday")
    protected int unsubscribesToday;
    @XmlElement(name = "UnsubscribesYesterday")
    protected int unsubscribesYesterday;
    @XmlElement(name = "UnsubscribesThisWeek")
    protected int unsubscribesThisWeek;
    @XmlElement(name = "UnsubscribesThisMonth")
    protected int unsubscribesThisMonth;
    @XmlElement(name = "UnsubscribesThisYear")
    protected int unsubscribesThisYear;
    @XmlElement(name = "TotalDeleted")
    protected int totalDeleted;
    @XmlElement(name = "DeletedToday")
    protected int deletedToday;
    @XmlElement(name = "DeletedYesterday")
    protected int deletedYesterday;
    @XmlElement(name = "DeletedThisWeek")
    protected int deletedThisWeek;
    @XmlElement(name = "DeletedThisMonth")
    protected int deletedThisMonth;
    @XmlElement(name = "DeletedThisYear")
    protected int deletedThisYear;
    @XmlElement(name = "TotalBounces")
    protected int totalBounces;
    @XmlElement(name = "BouncesToday")
    protected int bouncesToday;
    @XmlElement(name = "BouncesYesterday")
    protected int bouncesYesterday;
    @XmlElement(name = "BouncesThisWeek")
    protected int bouncesThisWeek;
    @XmlElement(name = "BouncesThisMonth")
    protected int bouncesThisMonth;
    @XmlElement(name = "BouncesThisYear")
    protected int bouncesThisYear;

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

    /**
     * Gets the value of the totalUnsubscribes property.
     * 
     */
    public int getTotalUnsubscribes() {
        return totalUnsubscribes;
    }

    /**
     * Sets the value of the totalUnsubscribes property.
     * 
     */
    public void setTotalUnsubscribes(int value) {
        this.totalUnsubscribes = value;
    }

    /**
     * Gets the value of the unsubscribesToday property.
     * 
     */
    public int getUnsubscribesToday() {
        return unsubscribesToday;
    }

    /**
     * Sets the value of the unsubscribesToday property.
     * 
     */
    public void setUnsubscribesToday(int value) {
        this.unsubscribesToday = value;
    }

    /**
     * Gets the value of the unsubscribesYesterday property.
     * 
     */
    public int getUnsubscribesYesterday() {
        return unsubscribesYesterday;
    }

    /**
     * Sets the value of the unsubscribesYesterday property.
     * 
     */
    public void setUnsubscribesYesterday(int value) {
        this.unsubscribesYesterday = value;
    }

    /**
     * Gets the value of the unsubscribesThisWeek property.
     * 
     */
    public int getUnsubscribesThisWeek() {
        return unsubscribesThisWeek;
    }

    /**
     * Sets the value of the unsubscribesThisWeek property.
     * 
     */
    public void setUnsubscribesThisWeek(int value) {
        this.unsubscribesThisWeek = value;
    }

    /**
     * Gets the value of the unsubscribesThisMonth property.
     * 
     */
    public int getUnsubscribesThisMonth() {
        return unsubscribesThisMonth;
    }

    /**
     * Sets the value of the unsubscribesThisMonth property.
     * 
     */
    public void setUnsubscribesThisMonth(int value) {
        this.unsubscribesThisMonth = value;
    }

    /**
     * Gets the value of the unsubscribesThisYear property.
     * 
     */
    public int getUnsubscribesThisYear() {
        return unsubscribesThisYear;
    }

    /**
     * Sets the value of the unsubscribesThisYear property.
     * 
     */
    public void setUnsubscribesThisYear(int value) {
        this.unsubscribesThisYear = value;
    }

    /**
     * Gets the value of the totalDeleted property.
     * 
     */
    public int getTotalDeleted() {
        return totalDeleted;
    }

    /**
     * Sets the value of the totalDeleted property.
     * 
     */
    public void setTotalDeleted(int value) {
        this.totalDeleted = value;
    }

    /**
     * Gets the value of the deletedToday property.
     * 
     */
    public int getDeletedToday() {
        return deletedToday;
    }

    /**
     * Sets the value of the deletedToday property.
     * 
     */
    public void setDeletedToday(int value) {
        this.deletedToday = value;
    }

    /**
     * Gets the value of the deletedYesterday property.
     * 
     */
    public int getDeletedYesterday() {
        return deletedYesterday;
    }

    /**
     * Sets the value of the deletedYesterday property.
     * 
     */
    public void setDeletedYesterday(int value) {
        this.deletedYesterday = value;
    }

    /**
     * Gets the value of the deletedThisWeek property.
     * 
     */
    public int getDeletedThisWeek() {
        return deletedThisWeek;
    }

    /**
     * Sets the value of the deletedThisWeek property.
     * 
     */
    public void setDeletedThisWeek(int value) {
        this.deletedThisWeek = value;
    }

    /**
     * Gets the value of the deletedThisMonth property.
     * 
     */
    public int getDeletedThisMonth() {
        return deletedThisMonth;
    }

    /**
     * Sets the value of the deletedThisMonth property.
     * 
     */
    public void setDeletedThisMonth(int value) {
        this.deletedThisMonth = value;
    }

    /**
     * Gets the value of the deletedThisYear property.
     * 
     */
    public int getDeletedThisYear() {
        return deletedThisYear;
    }

    /**
     * Sets the value of the deletedThisYear property.
     * 
     */
    public void setDeletedThisYear(int value) {
        this.deletedThisYear = value;
    }

    /**
     * Gets the value of the totalBounces property.
     * 
     */
    public int getTotalBounces() {
        return totalBounces;
    }

    /**
     * Sets the value of the totalBounces property.
     * 
     */
    public void setTotalBounces(int value) {
        this.totalBounces = value;
    }

    /**
     * Gets the value of the bouncesToday property.
     * 
     */
    public int getBouncesToday() {
        return bouncesToday;
    }

    /**
     * Sets the value of the bouncesToday property.
     * 
     */
    public void setBouncesToday(int value) {
        this.bouncesToday = value;
    }

    /**
     * Gets the value of the bouncesYesterday property.
     * 
     */
    public int getBouncesYesterday() {
        return bouncesYesterday;
    }

    /**
     * Sets the value of the bouncesYesterday property.
     * 
     */
    public void setBouncesYesterday(int value) {
        this.bouncesYesterday = value;
    }

    /**
     * Gets the value of the bouncesThisWeek property.
     * 
     */
    public int getBouncesThisWeek() {
        return bouncesThisWeek;
    }

    /**
     * Sets the value of the bouncesThisWeek property.
     * 
     */
    public void setBouncesThisWeek(int value) {
        this.bouncesThisWeek = value;
    }

    /**
     * Gets the value of the bouncesThisMonth property.
     * 
     */
    public int getBouncesThisMonth() {
        return bouncesThisMonth;
    }

    /**
     * Sets the value of the bouncesThisMonth property.
     * 
     */
    public void setBouncesThisMonth(int value) {
        this.bouncesThisMonth = value;
    }

    /**
     * Gets the value of the bouncesThisYear property.
     * 
     */
    public int getBouncesThisYear() {
        return bouncesThisYear;
    }

    /**
     * Sets the value of the bouncesThisYear property.
     * 
     */
    public void setBouncesThisYear(int value) {
        this.bouncesThisYear = value;
    }

}
