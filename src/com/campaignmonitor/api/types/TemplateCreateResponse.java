
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
 *         &lt;element name="Template.CreateResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "templateCreateResult"
})
@XmlRootElement(name = "Template.CreateResponse")
public class TemplateCreateResponse {

    @XmlElement(name = "Template.CreateResult")
    protected Object templateCreateResult;

    /**
     * Gets the value of the templateCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTemplateCreateResult() {
        return templateCreateResult;
    }

    /**
     * Sets the value of the templateCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTemplateCreateResult(Object value) {
        this.templateCreateResult = value;
    }

}
