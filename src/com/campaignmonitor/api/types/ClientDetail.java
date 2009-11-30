
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasicDetails" type="{http://api.createsend.com/api/}ClientBasicDetails" minOccurs="0"/>
 *         &lt;element name="AccessAndBilling" type="{http://api.createsend.com/api/}ClientAccessAndBilling" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientDetail", propOrder = {
    "basicDetails",
    "accessAndBilling"
})
public class ClientDetail {

    @XmlElement(name = "BasicDetails")
    protected ClientBasicDetails basicDetails;
    @XmlElement(name = "AccessAndBilling")
    protected ClientAccessAndBilling accessAndBilling;

    /**
     * Gets the value of the basicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClientBasicDetails }
     *     
     */
    public ClientBasicDetails getBasicDetails() {
        return basicDetails;
    }

    /**
     * Sets the value of the basicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientBasicDetails }
     *     
     */
    public void setBasicDetails(ClientBasicDetails value) {
        this.basicDetails = value;
    }

    /**
     * Gets the value of the accessAndBilling property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAccessAndBilling }
     *     
     */
    public ClientAccessAndBilling getAccessAndBilling() {
        return accessAndBilling;
    }

    /**
     * Sets the value of the accessAndBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAccessAndBilling }
     *     
     */
    public void setAccessAndBilling(ClientAccessAndBilling value) {
        this.accessAndBilling = value;
    }

}
