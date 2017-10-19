package com.mx.posadas.xdist.core.entity.hotel.rates;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RoomRates")
public class RoomRates {

	private List<RoomRate> roomRates;

	@XmlElement(name = "RoomRate", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<RoomRate> getRoomRates() {
		return roomRates;
	}

	public void setRoomRates(List<RoomRate> roomRates) {
		this.roomRates = roomRates;
	}
	
	
}
