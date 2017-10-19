package com.mx.posadas.xdist.core.entity.hotel.info;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Awards")
public class Awards {

	private List<Award> awards;

	@XmlElement(name = "Award", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<Award> getAwards() {
		return awards;
	}

	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}
	
	
	
}
