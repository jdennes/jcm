
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnsubscribePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfirmationSuccessPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDetail", propOrder = {
    "listID",
    "title",
    "unsubscribePage",
    "confirmOptIn",
    "confirmationSuccessPage"
})
public class ListDetail {

    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "UnsubscribePage")
    protected String unsubscribePage;
    @XmlElement(name = "ConfirmOptIn")
    protected boolean confirmOptIn;
    @XmlElement(name = "ConfirmationSuccessPage")
    protected String confirmationSuccessPage;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the unsubscribePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubscribePage() {
        return unsubscribePage;
    }

    /**
     * Sets the value of the unsubscribePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubscribePage(String value) {
        this.unsubscribePage = value;
    }

    /**
     * Gets the value of the confirmOptIn property.
     * 
     */
    public boolean isConfirmOptIn() {
        return confirmOptIn;
    }

    /**
     * Sets the value of the confirmOptIn property.
     * 
     */
    public void setConfirmOptIn(boolean value) {
        this.confirmOptIn = value;
    }

    /**
     * Gets the value of the confirmationSuccessPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationSuccessPage() {
        return confirmationSuccessPage;
    }

    /**
     * Sets the value of the confirmationSuccessPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationSuccessPage(String value) {
        this.confirmationSuccessPage = value;
    }

}
