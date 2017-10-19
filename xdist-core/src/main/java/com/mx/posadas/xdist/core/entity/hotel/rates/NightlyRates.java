package com.mx.posadas.xdist.core.entity.hotel.rates;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NightlyRates")
public class NightlyRates {

	private List<NightlyRate> nightlyRates;

	@XmlElement(name = "NightlyRate", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<NightlyRate> getNightlyRates() {
		return nightlyRates;
	}

	public void setNightlyRates(List<NightlyRate> nightlyRates) {
		this.nightlyRates = nightlyRates;
	}
	
	
	
}
