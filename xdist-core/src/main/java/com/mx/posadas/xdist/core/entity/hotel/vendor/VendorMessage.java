package com.mx.posadas.xdist.core.entity.hotel.vendor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "VendorMessage")
@XmlSeeAlso({SubSection.class})
public class VendorMessage {
	
	private SubSection subSection;
	private String infoType;
	
	public String getInfoType() {
		return infoType;
	}
	@XmlAttribute(name = "InfoType")
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}
	
	public SubSection getSubSection() {
		return subSection;
	}
	@XmlElement(name="SubSection", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setSubSection(SubSection subSection) {
		this.subSection = subSection;
	}
	
	

}
