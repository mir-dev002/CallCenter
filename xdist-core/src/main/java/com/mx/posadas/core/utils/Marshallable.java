package com.mx.posadas.core.utils;

import java.io.File;
import java.io.StringWriter;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.MarshalException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.w3c.dom.Node;

public abstract class Marshallable {

    /**
     * Marshalling itself to XML document by JAXB annotations and serializing it to String
     * @return serialized XML document
     * @throws MarshalException
     */
    public String marshal() throws MarshalException{
       return marshal(this);
    }

    /**
     * Unmarshalling itself from XML document by JAXB annotations
     * @param xml xml document serialized as String
     * @return deserialized object
     * @throws JAXBException
     * @throws URISyntaxException 
     */
    public Object unmarshal(String xml) throws JAXBException, URISyntaxException{
        return unmarshal(xml, this.getClass());
    }

    /**
     * Marshalling supplied object to XML document by JAXB annotations and serializing it to String
     * @param obj object to be marshalled
     * @return serialized XML document
     * @throws MarshalException
     */
    public static String marshal(Object obj) throws MarshalException{
        try {
            StringWriter sw = new StringWriter();
            JAXBContext jc = JAXBContext.newInstance(obj.getClass());
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(obj, sw);
            return sw.toString();
        } catch( JAXBException jbe ){
            throw new MarshalException("Error when marshalling " +obj.getClass().getCanonicalName(),jbe);
        }
    }

    /**
     * Unmarshalling itself from XML document by JAXB annotations
     * @param xml xml document serialized as String
     * @param clazz Class to which shoud be object unmarshalled
     * @return serialized XML document
     * @throws JAXBException
     * @throws URISyntaxException 
     */
    public static Object unmarshal(String xml, Class clazz) throws JAXBException, URISyntaxException{
    	File file = new File(Marshallable.class.getClassLoader().getResource(xml).toURI());
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller u = jc.createUnmarshaller();
        return u.unmarshal(file);
    }
    
    
    /**
     * Unmarshalling itself from Node document by JAXB annotations
     * @param xml node document´s node
     * @param clazz Class to which shoud be object unmarshalled
     * @return serialized XML document
     * @throws JAXBException
     * @throws URISyntaxException 
     */
    public static Object unmarshal(Node node, Class clazz) throws JAXBException, URISyntaxException{
        JAXBContext jc = JAXBContext.newInstance( clazz );
        Unmarshaller u = jc.createUnmarshaller();
        return u.unmarshal(node);
    }
}
