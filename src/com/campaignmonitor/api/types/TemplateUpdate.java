
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
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HTMLPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipFileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScreenshotURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "templateID",
    "templateName",
    "htmlPageURL",
    "zipFileURL",
    "screenshotURL"
})
@XmlRootElement(name = "Template.Update")
public class TemplateUpdate {

    @XmlElement(name = "ApiKey")
    protected String apiKey;
    @XmlElement(name = "TemplateID")
    protected String templateID;
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "HTMLPageURL")
    protected String htmlPageURL;
    @XmlElement(name = "ZipFileURL")
    protected String zipFileURL;
    @XmlElement(name = "ScreenshotURL")
    protected String screenshotURL;

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
     * Gets the value of the templateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the htmlPageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLPageURL() {
        return htmlPageURL;
    }

    /**
     * Sets the value of the htmlPageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLPageURL(String value) {
        this.htmlPageURL = value;
    }

    /**
     * Gets the value of the zipFileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipFileURL() {
        return zipFileURL;
    }

    /**
     * Sets the value of the zipFileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipFileURL(String value) {
        this.zipFileURL = value;
    }

    /**
     * Gets the value of the screenshotURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenshotURL() {
        return screenshotURL;
    }

    /**
     * Sets the value of the screenshotURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenshotURL(String value) {
        this.screenshotURL = value;
    }

}
