package com.mx.posadas.xdist.core.entity.hotel.rooms;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "AdditionalDetails")
@XmlSeeAlso({AdditionalDetail.class})
public class AdditionalDetails {
	
	private AdditionalDetail additionalDetail;

	public AdditionalDetail getAdditionalDetail() {
		return additionalDetail;
	}
	@XmlElement(name="AdditionalDetail", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setAdditionalDetail(AdditionalDetail additionalDetail) {
		this.additionalDetail = additionalDetail;
	}

}
