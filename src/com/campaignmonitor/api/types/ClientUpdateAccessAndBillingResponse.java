
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
 *         &lt;element name="Client.UpdateAccessAndBillingResult" type="{http://api.createsend.com/api/}Result" minOccurs="0"/>
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
    "clientUpdateAccessAndBillingResult"
})
@XmlRootElement(name = "Client.UpdateAccessAndBillingResponse")
public class ClientUpdateAccessAndBillingResponse {

    @XmlElement(name = "Client.UpdateAccessAndBillingResult")
    protected Result clientUpdateAccessAndBillingResult;

    /**
     * Gets the value of the clientUpdateAccessAndBillingResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getClientUpdateAccessAndBillingResult() {
        return clientUpdateAccessAndBillingResult;
    }

    /**
     * Sets the value of the clientUpdateAccessAndBillingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setClientUpdateAccessAndBillingResult(Result value) {
        this.clientUpdateAccessAndBillingResult = value;
    }

}
