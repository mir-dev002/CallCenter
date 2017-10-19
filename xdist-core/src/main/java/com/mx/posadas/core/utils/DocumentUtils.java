package com.mx.posadas.core.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class DocumentUtils {

	
	public static String convertDocumentToString(Document doc) {
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tf.newTransformer();
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			String output = writer.getBuffer().toString();
			return output;
		} catch (TransformerException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Document convertStringToDocument(String xmlStr) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			factory.setNamespaceAware(true);
			builder = factory.newDocumentBuilder();
			
			Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static String getStringXMLResource(String xmlFile){
		
		String result;
		InputStream is;		
		
		is = DocumentUtils.class.getClassLoader().getResourceAsStream(xmlFile);	
		result = getStringFromInputStream(is);
		
		return result;
		
	}
	
	public static Document getDocumentXMLResource(String xmlFile){
		
		Document doc;
		String xmlStr;
		
		xmlStr = getStringXMLResource(xmlFile);
		doc = convertStringToDocument(xmlStr);
			
		return doc;
		
	}
	

	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}	
	
	
	public static void convertXSLtoDocument(){
		
		String xslFile = "", xmlFile = "";
	    
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer;
		try {
			transformer = factory.newTransformer( new StreamSource( xslFile ) );
	        StreamSource xmlsource = new StreamSource( xmlFile );
	        StreamResult output = new StreamResult( System.out );

	        transformer.transform( xmlsource, output );
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
}
