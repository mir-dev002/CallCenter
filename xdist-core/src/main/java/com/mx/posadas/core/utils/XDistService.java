package com.mx.posadas.core.utils;

import java.io.File;
import java.io.FileWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Node;

import com.mx.posadas.core.ctes.RQ;

public class XDistService<T> {
	
	RQ rq;
	T entity;
	
	public XDistService(T entity, RQ rq) {
		this.rq = rq;
		this.entity = entity;		
	}

	@SuppressWarnings("unchecked")
	public T executor() {

		try {
			
			Node xml = ConnectionWS.executeWS(rq.getXml());
			this.entity = (T) Marshallable.unmarshal(xml, entity.getClass());
			
			
 	       try{
	        	
		        DOMSource source = new DOMSource(xml);
		        FileWriter writer = new FileWriter(new File("C:\\temp\\document.xml"));
		        StreamResult result = new StreamResult(writer);
		
		        TransformerFactory transformerFactory = TransformerFactory.newInstance();
		        Transformer transformer = transformerFactory.newTransformer();
		        transformer.transform(source, result);
	        
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			
	        
			
			/*
			String HOTEL_AVAIL_RS = "HotelAvailRS.xsl";
    	    Document doc = DocumentUtils.getDocumentXMLResource(HOTEL_AVAIL_RS);
	    	
	        JAXBContext jc = JAXBContext.newInstance( HotelAvailRS.class );
	        Unmarshaller u = jc.createUnmarshaller();
	      
	    	
	    	this.entity =  (T) u.unmarshal(doc);
			*/
	      
 		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return this.getEntity();
	}

	public RQ getRq() {
		return rq;
	}

	public void setRq(RQ rq) {
		this.rq = rq;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	
}
