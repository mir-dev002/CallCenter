package com.mx.posadas.xdist.core.entity.basic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Position")
public class Position {
	
	private String latitude;
	private String longitude;
	
	public String getLatitude() {
		return latitude;
	}
	@XmlAttribute(name = "Latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	@XmlAttribute(name = "Longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
