package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "Rates")
@XmlSeeAlso({Rate.class})
public class Rates {
	
	private Rate rate;

	public Rate getRate() {
		return rate;
	}

	@XmlElement(name="Rate", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRate(Rate rate) {
		this.rate = rate;
	}
	
	
	

}
