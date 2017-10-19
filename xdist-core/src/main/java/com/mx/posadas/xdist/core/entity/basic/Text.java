package com.mx.posadas.xdist.core.entity.basic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Text")
public class Text {
	
	private String value;
	private String language;

	public String getLanguage() {
		return language;
	}

	@XmlAttribute(name = "Language")
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getValue() {
		return value;
	}

	@XmlValue
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
