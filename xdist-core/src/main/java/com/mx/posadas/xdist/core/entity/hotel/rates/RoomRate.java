package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "RoomRate")
@XmlSeeAlso({Rates.class})
public class RoomRate {
	
	private String hotelReference;
	private String numberOfGuests;
	private String numberOfUnits;
	private String onRequest;
	private String ratePlanID;
	private String reference;
	private String roomRPH;
	private String roomTypeCode;
	private Rates rates;
	
	public String getHotelReference() {
		return hotelReference;
	}
	@XmlAttribute(name = "HotelReference")
	public void setHotelReference(String hotelReference) {
		this.hotelReference = hotelReference;
	}
	public String getNumberOfGuests() {
		return numberOfGuests;
	}
	@XmlAttribute(name = "NumberOfGuests")
	public void setNumberOfGuests(String numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	public String getNumberOfUnits() {
		return numberOfUnits;
	}
	@XmlAttribute(name = "NumberOfUnits")
	public void setNumberOfUnits(String numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	public String getOnRequest() {
		return onRequest;
	}
	@XmlAttribute(name = "OnRequest")
	public void setOnRequest(String onRequest) {
		this.onRequest = onRequest;
	}
	public String getRatePlanID() {
		return ratePlanID;
	}
	@XmlAttribute(name = "RatePlanID")
	public void setRatePlanID(String ratePlanID) {
		this.ratePlanID = ratePlanID;
	}
	public String getReference() {
		return reference;
	}
	@XmlAttribute(name = "Reference")
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getRoomRPH() {
		return roomRPH;
	}
	@XmlAttribute(name = "RoomRPH")
	public void setRoomRPH(String roomRPH) {
		this.roomRPH = roomRPH;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	@XmlAttribute(name = "RoomTypeCode")
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	public Rates getRates() {
		return rates;
	}
	@XmlElement(name="Rates", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRates(Rates rates) {
		this.rates = rates;
	}
	
	
}

