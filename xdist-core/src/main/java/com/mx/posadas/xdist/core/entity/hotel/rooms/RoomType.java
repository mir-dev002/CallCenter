package com.mx.posadas.xdist.core.entity.hotel.rooms;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "RoomType")
@XmlSeeAlso({RoomDescription.class, AdditionalDetails.class, TPAExtensions.class})
public class RoomType {

	private Integer numberOfUnits;
	private String roomTypeCode;
	private String roomTypeName;
	private RoomDescription roomDescription;
	private AdditionalDetails additionalDetails;
	private TPAExtensions tpaExtensions;
	
	public Integer getNumberOfUnits() {
		return numberOfUnits;
	}
	@XmlAttribute(name = "NumberOfUnits")
	public void setNumberOfUnits(Integer numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	@XmlAttribute(name = "RoomTypeCode")
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	@XmlAttribute(name = "RoomTypeName")
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	public RoomDescription getRoomDescription() {
		return roomDescription;
	}
	@XmlElement(name="RoomDescription", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRoomDescription(RoomDescription roomDescription) {
		this.roomDescription = roomDescription;
	}
	public AdditionalDetails getAdditionalDetails() {
		return additionalDetails;
	}
	@XmlElement(name="AdditionalDetails", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setAdditionalDetails(AdditionalDetails additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	public TPAExtensions getTpaExtensions() {
		return tpaExtensions;
	}
	@XmlElement(name="TPA_Extensions", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setTpaExtensions(TPAExtensions tpaExtensions) {
		this.tpaExtensions = tpaExtensions;
	}
	
	
}
