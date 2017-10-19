package com.mx.posadas.xdist.core.entity.hotel.rooms;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.mx.posadas.xdist.core.entity.hotel.vendor.VendorMessages;

@XmlType(name="TPA_Extensions_Rooms")
@XmlRootElement(name = "TPA_Extensions")
@XmlSeeAlso({VendorMessages.class})
public class TPAExtensions {
	
	private VendorMessages vendorMessages;

	public VendorMessages getVendorMessages() {
		return vendorMessages;
	}
	@XmlElement(name="VendorMessages", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setVendorMessages(VendorMessages vendorMessages) {
		this.vendorMessages = vendorMessages;
	}
		
	
}
