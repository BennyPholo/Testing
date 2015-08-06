
package com.platoon.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReqHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ApiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApiAuthentication" type="{http://8bitplatoon.com/c3m/api}ApiAuthentication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqHeader", namespace = "http://8bitplatoon.com/c3m/api", propOrder = {
    "requestTimestamp",
    "apiVersion",
    "apiKey",
    "apiAuthentication"
})
public class ReqHeader {

    @XmlElement(name = "RequestTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTimestamp;
    @XmlElement(name = "ApiVersion", required = true)
    protected String apiVersion;
    @XmlElement(name = "ApiKey", required = true)
    protected String apiKey;
    @XmlElement(name = "ApiAuthentication")
    protected ApiAuthentication apiAuthentication;

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTimestamp(XMLGregorianCalendar value) {
        this.requestTimestamp = value;
    }

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

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
     * Gets the value of the apiAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link ApiAuthentication }
     *     
     */
    public ApiAuthentication getApiAuthentication() {
        return apiAuthentication;
    }

    /**
     * Sets the value of the apiAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiAuthentication }
     *     
     */
    public void setApiAuthentication(ApiAuthentication value) {
        this.apiAuthentication = value;
    }

}
