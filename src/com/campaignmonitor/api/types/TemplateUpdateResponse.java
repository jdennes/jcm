
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
 *         &lt;element name="Template.UpdateResult" type="{http://api.createsend.com/api/}Result" minOccurs="0"/>
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
    "templateUpdateResult"
})
@XmlRootElement(name = "Template.UpdateResponse")
public class TemplateUpdateResponse {

    @XmlElement(name = "Template.UpdateResult")
    protected Result templateUpdateResult;

    /**
     * Gets the value of the templateUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getTemplateUpdateResult() {
        return templateUpdateResult;
    }

    /**
     * Sets the value of the templateUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setTemplateUpdateResult(Result value) {
        this.templateUpdateResult = value;
    }

}
