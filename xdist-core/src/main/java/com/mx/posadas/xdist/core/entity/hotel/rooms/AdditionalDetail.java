package com.mx.posadas.xdist.core.entity.hotel.rooms;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "AdditionalDetail")
@XmlSeeAlso({DetailDescription.class})
public class AdditionalDetail {
	
	private DetailDescription detailDescription;

	public DetailDescription getDetailDescription() {
		return detailDescription;
	}
	@XmlElement(name = "DetailDescription", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setDetailDescription(DetailDescription detailDescription) {
		this.detailDescription = detailDescription;
	}
	
	

}
