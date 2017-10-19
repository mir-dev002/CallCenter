package com.mx.posadas.xdist.core.entity.hotel.vendor;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VendorMessages")
public class VendorMessages {
	
	private String infoType;
	private List<VendorMessage> vendorMessages;
	
	public String getInfoType() {
		return infoType;
	}
	@XmlAttribute(name = "InfoType")
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	@XmlElement(name = "VendorMessage", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<VendorMessage> getVendorMessages() {
		return vendorMessages;
	}

	public void setVendorMessages(List<VendorMessage> vendorMessages) {
		this.vendorMessages = vendorMessages;
	}
	
	
	

}
