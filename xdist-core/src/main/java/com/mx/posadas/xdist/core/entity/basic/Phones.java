package com.mx.posadas.xdist.core.entity.basic;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Phones")
public class Phones {

	private List<Phone> phones;

	@XmlElement(name = "Phone", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	
}
