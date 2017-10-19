package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CompanyName")
public class CompanyName {
	
	private String code;

	public String getCode() {
		return code;
	}

	@XmlAttribute(name = "Code")
	public void setCode(String code) {
		this.code = code;
	}
	
}
