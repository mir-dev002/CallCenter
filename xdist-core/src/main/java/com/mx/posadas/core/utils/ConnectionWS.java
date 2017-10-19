package com.mx.posadas.core.utils;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ConnectionWS {
	
	public static Node executeWS(String xmlResourceName){
		
		SOAPBody body = callSoapWebService(xmlResourceName);
		
		return body.getFirstChild();
		
	}

	
    private static SOAPBody callSoapWebService(String xmlResourceName) {
        
    	SOAPBody body = null;
    	    	
    	try {
        	
        	/***********************************************************************************/
        	/***********************************************************************************/
        	//VARIABLE DE AMBIENTE
        	/***********************************************************************************/
        	/***********************************************************************************/
        	String soapEndpointUrl = "http://10.36.51.133:8077/services/spm/spm";
        	
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapMessage = createSOAPRequest(xmlResourceName);
            SOAPMessage soapResponse = soapConnection.call(soapMessage, soapEndpointUrl);

            // Print the SOAP Response
            /*
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();
            */
                        
            body = soapResponse.getSOAPPart().getEnvelope().getBody();
            
            soapConnection.close();
            
 ;  
            
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }

        
    	
        return body;
    }
    
    
    private static SOAPMessage createSOAPRequest(String xmlresourceName) throws Exception {
        
    	MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage, xmlresourceName);
      
        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
        
    }
    
    private static void createSoapEnvelope(SOAPMessage soapMessage, String xmlresourceName) throws SOAPException {
        
    	// SOAP Part
    	SOAPPart soapPart = soapMessage.getSOAPPart();
        
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ser", "http://serviceProvider.openjaw.com");        
        
        //Document SOAP Body
        Document doc = DocumentUtils.getDocumentXMLResource(xmlresourceName);

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        
        soapBody.addDocument(doc);
        
    } 
	
}
