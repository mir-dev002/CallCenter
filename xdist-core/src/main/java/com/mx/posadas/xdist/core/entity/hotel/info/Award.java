package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Award")
public class Award {

	private String provider;
	private String rating;
	
	public String getProvider() {
		return provider;
	}
	@XmlAttribute(name = "Provider")
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getRating() {
		return rating;
	}
	@XmlAttribute(name = "Rating")
	public void setRating(String rating) {
		this.rating = rating;
	}	
	
}
