
package com.platoon.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeartbeatResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeartbeatResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespHeader" type="{http://8bitplatoon.com/c3m/api}RespHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartbeatResp", namespace = "http://8bitplatoon.com/c3m/api", propOrder = {
    "respHeader"
})
public class HeartbeatResp {

    @XmlElement(name = "RespHeader", required = true)
    protected RespHeader respHeader;

    /**
     * Gets the value of the respHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RespHeader }
     *     
     */
    public RespHeader getRespHeader() {
        return respHeader;
    }

    /**
     * Sets the value of the respHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespHeader }
     *     
     */
    public void setRespHeader(RespHeader value) {
        this.respHeader = value;
    }

}
