package com.mx.posadas.xdist.core.entity.basic;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "PostalCode")
public class PostalCode {
	
	private String value;

	public String getValue() {
		return value;
	}
	@XmlValue
	public void setValue(String value) {
		this.value = value;
	}

}