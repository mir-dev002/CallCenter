package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "DistribSystems")
@XmlSeeAlso({DistribSystem.class})
public class DistribSystems {

	private DistribSystem distribSystem;

	public DistribSystem getDistribSystem() {
		return distribSystem;
	}

	@XmlElement(name="DistribSystem", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setDistribSystem(DistribSystem distribSystem) {
		this.distribSystem = distribSystem;
	}
	
	
	
}
