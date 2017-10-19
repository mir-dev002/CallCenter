package com.mx.posadas.xdist.core.entity.hotel.plans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "RatePlans")
@XmlSeeAlso({RatePlan.class})
public class RatePlans {

	private String OJHotelCode;
	private RatePlan ratePlan;

	public String getOJHotelCode() {
		return OJHotelCode;
	}

	@XmlAttribute(name = "OJHotelCode")
	public void setOJHotelCode(String oJHotelCode) {
		OJHotelCode = oJHotelCode;
	}

	public RatePlan getRatePlan() {
		return ratePlan;
	}

	@XmlElement(name="RatePlan", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRatePlan(RatePlan ratePlan) {
		this.ratePlan = ratePlan;
	}
	
	
	
}
