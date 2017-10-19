package com.mx.posadas.xdist.core.entity.basic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Phone")
public class Phone {

	private String phoneNumber;
	private String phoneUsageType;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@XmlAttribute(name = "PhoneNumber")
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneUsageType() {
		return phoneUsageType;
	}
	@XmlAttribute(name = "PhoneUsageType")
	public void setPhoneUsageType(String phoneUsageType) {
		this.phoneUsageType = phoneUsageType;
	}	
	
}

