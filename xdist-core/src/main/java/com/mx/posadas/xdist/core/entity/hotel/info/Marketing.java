package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Marketing")
public class Marketing {
	
	private String value;

	public String getValue() {
		return value;
	}
	@XmlValue
	public void setValue(String value) {
		this.value = value;
	}

}
