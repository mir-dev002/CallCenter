package com.mx.posadas.xdist.core.entity.hotel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


@XmlRootElement(name="OTA_HotelAvailRS", namespace="http://www.opentravel.org/OTA/2003/05")
@XmlSeeAlso({RoomStays.class})
public class HotelAvailRS {


	private RoomStays roomStays = null;
	
	public RoomStays getRoomStays() {
		return roomStays;
	}
	@XmlElement(name="RoomStays", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRoomStays(RoomStays roomStays) {
		this.roomStays = roomStays;
	}
	
}
