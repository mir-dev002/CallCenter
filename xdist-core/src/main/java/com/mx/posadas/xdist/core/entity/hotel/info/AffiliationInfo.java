package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "AffiliationInfo")
@XmlSeeAlso({DistribSystems.class, Awards.class})
public class AffiliationInfo {
	
	private Awards awards;
	private DistribSystems distribSystems;

	public Awards getAwards() {
		return awards;
	}

	@XmlElement(name="Awards", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setAwards(Awards awards) {
		this.awards = awards;
	}

	public DistribSystems getDistribSystems() {
		return distribSystems;
	}

	@XmlElement(name="DistribSystems", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setDistribSystems(DistribSystems distribSystems) {
		this.distribSystems = distribSystems;
	}

}
