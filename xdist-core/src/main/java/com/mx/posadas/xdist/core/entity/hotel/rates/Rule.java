package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Rule")
public class Rule {
	
	private String description;
	private String nightNumber;
	
	public String getDescription() {
		return description;
	}
	@XmlAttribute(name = "Description")
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNightNumber() {
		return nightNumber;
	}
	@XmlAttribute(name = "NightNumber")
	public void setNightNumber(String nightNumber) {
		this.nightNumber = nightNumber;
	}	

}

