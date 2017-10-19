package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TPA_Extensions_Rates")
@XmlRootElement(name = "TPA_Extensions")
@XmlSeeAlso({Base.class, NightlyRates.class, Total.class, Rules.class})
public class TPAExtensions {
	
	private Base base;
	private NightlyRates nightlyRates;
	private Total  total;
	private Rules rules;
	
	public Base getBase() {
		return base;
	}
	@XmlElement(name="Base", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setBase(Base base) {
		this.base = base;
	}
	public NightlyRates getNightlyRates() {
		return nightlyRates;
	}
	
	@XmlElement(name="NightlyRates", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setNightlyRates(NightlyRates nightlyRates) {
		this.nightlyRates = nightlyRates;
	}
	public Total getTotal() {
		return total;
	}
	@XmlElement(name="Total", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setTotal(Total total) {
		this.total = total;
	}
	public Rules getRules() {
		return rules;
	}
	@XmlElement(name="Rules", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRules(Rules rules) {
		this.rules = rules;
	}
	
	

}
