package com.mx.posadas.xdist.core.entity.hotel.vendor;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SubSection")
public class SubSection {
	
	private String subTitle;
	private List<Paragraph> paragraphs;
	
	public String getSubTitle() {
		return subTitle;
	}
	@XmlAttribute(name = "SubTitle")
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	
	@XmlElement(name = "Paragraph", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}
	public void setParagraphs(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

	

}
