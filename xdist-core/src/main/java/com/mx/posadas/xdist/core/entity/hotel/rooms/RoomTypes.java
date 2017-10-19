package com.mx.posadas.xdist.core.entity.hotel.rooms;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RoomTypes")
public class RoomTypes {
	
	private List<RoomType> roomTypes;

	@XmlElement(name = "RoomType", namespace="http://www.opentravel.org/OTA/2003/05")
	public List<RoomType> getRoomTypes() {
		return roomTypes;
	}

	public void setRoomTypes(List<RoomType> roomTypes) {
		this.roomTypes = roomTypes;
	}
	

}
