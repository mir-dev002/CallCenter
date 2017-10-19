package com.mx.posadas.xdist.core.entity.hotel.rates;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Rules")
public class Rules {

	private List<Rule> rules;

	@XmlElement(name = "Rule", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<Rule> getRules() {
		return rules;
	}
	
	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

}
