package com.mx.posadas.xdist.core.entity.basic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CountryName")
public class CountryName {

	private String code;

	public String getCode() {
		return code;
	}
	@XmlAttribute(name = "Code")
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
