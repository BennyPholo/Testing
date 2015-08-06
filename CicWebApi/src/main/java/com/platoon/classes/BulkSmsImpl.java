package com.platoon.classes;

import java.io.StringWriter;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import com.platoon.jaxb.RespHeader;

@WebService
public class BulkSmsImpl implements BulkSms{
	public String bulkCicRequest(String bulkCicReq){
        RespHeader respHeader = new RespHeader();
        respHeader.setApiVersion("Testing API Version");
        respHeader.setRespCode(1);
        respHeader.setRespMsg("Testing API Version");
        try {
            respHeader.setResponseTimestamp(DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar()));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        try {
            respHeader.setResponseTimestamp(DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar()));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        StringWriter writer = new StringWriter();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(RespHeader.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.marshal(respHeader,writer);
        } catch (JAXBException e) {
            //e.printStackTrace();
        }
        return "Testing phase 1";
    }
}
