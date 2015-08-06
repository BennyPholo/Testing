
package com.platoon.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eigthbitplatoon.c3m.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReqHeader_QNAME = new QName("http://8bitplatoon.com/c3m/api", "ReqHeader");
    private final static QName _HeartbeatResp_QNAME = new QName("http://8bitplatoon.com/c3m/api", "HeartbeatResp");
    private final static QName _RespHeader_QNAME = new QName("http://8bitplatoon.com/c3m/api", "RespHeader");
    private final static QName _ApiAuthentication_QNAME = new QName("http://8bitplatoon.com/c3m/api", "ApiAuthentication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eigthbitplatoon.c3m.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReqHeader }
     * 
     */
    public ReqHeader createReqHeader() {
        return new ReqHeader();
    }

    /**
     * Create an instance of {@link HeartbeatResp }
     * 
     */
    public HeartbeatResp createHeartbeatResp() {
        return new HeartbeatResp();
    }

    /**
     * Create an instance of {@link RespHeader }
     * 
     */
    public RespHeader createRespHeader() {
        return new RespHeader();
    }

    /**
     * Create an instance of {@link ApiAuthentication }
     * 
     */
    public ApiAuthentication createApiAuthentication() {
        return new ApiAuthentication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://8bitplatoon.com/c3m/api", name = "ReqHeader")
    public JAXBElement<ReqHeader> createReqHeader(ReqHeader value) {
        return new JAXBElement<ReqHeader>(_ReqHeader_QNAME, ReqHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeartbeatResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://8bitplatoon.com/c3m/api", name = "HeartbeatResp")
    public JAXBElement<HeartbeatResp> createHeartbeatResp(HeartbeatResp value) {
        return new JAXBElement<HeartbeatResp>(_HeartbeatResp_QNAME, HeartbeatResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://8bitplatoon.com/c3m/api", name = "RespHeader")
    public JAXBElement<RespHeader> createRespHeader(RespHeader value) {
        return new JAXBElement<RespHeader>(_RespHeader_QNAME, RespHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiAuthentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://8bitplatoon.com/c3m/api", name = "ApiAuthentication")
    public JAXBElement<ApiAuthentication> createApiAuthentication(ApiAuthentication value) {
        return new JAXBElement<ApiAuthentication>(_ApiAuthentication_QNAME, ApiAuthentication.class, null, value);
    }

}
