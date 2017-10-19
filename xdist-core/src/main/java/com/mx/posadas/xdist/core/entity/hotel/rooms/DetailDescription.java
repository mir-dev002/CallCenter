package com.mx.posadas.xdist.core.entity.hotel.rooms;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.mx.posadas.xdist.core.entity.basic.Text;

@XmlRootElement(name = "DetailDescription")
@XmlSeeAlso({Text.class})
public class DetailDescription {
	
	private String name;
	private Text text;
	
	public String getName() {
		return name;
	}
	@XmlAttribute(name = "Name")
	public void setName(String name) {
		this.name = name;
	}
	public Text getText() {
		return text;
	}
	@XmlElement(name = "Text", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setText(Text text) {
		this.text = text;
	}
	
	

}
