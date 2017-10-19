package com.mx.posadas.xdist.core.entity.hotel;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RoomStays")
public class RoomStays {
	
	private List<RoomStay> roomStays;

	@XmlElement(name = "RoomStay", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<RoomStay> getRoomStays() {
		return roomStays;
	}

	public void setRoomStays(List<RoomStay> roomStays) {
		this.roomStays = roomStays;
	}

}


