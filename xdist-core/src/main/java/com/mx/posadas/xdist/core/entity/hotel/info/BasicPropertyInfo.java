package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.mx.posadas.xdist.core.entity.basic.Address;
import com.mx.posadas.xdist.core.entity.basic.Phones;
import com.mx.posadas.xdist.core.entity.basic.Position;
import com.mx.posadas.xdist.core.entity.hotel.vendor.VendorMessages;

@XmlRootElement(name="BasicPropertyInfo")
@XmlSeeAlso({HotelName.class, Position.class, Address.class, Phones.class, 
			 AffiliationInfo.class, VendorMessages.class})
public class BasicPropertyInfo {
	
	private String brandCode;
	private String hotelCityCode;
	private String OJhotelName;
	private String OJHotelCode;
	private HotelName hotelName;
	private Position position;
	private Address address;
	private Phones phones;
	private AffiliationInfo affiliationInfo;
	private VendorMessages vendorMessages;
	
	public String getBrandCode() {
		return brandCode;
	}
	@XmlAttribute(name = "BrandCode")
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public String getHotelCityCode() {
		return hotelCityCode;
	}
	@XmlAttribute(name = "HotelCityCode")
	public void setHotelCityCode(String hotelCityCode) {
		this.hotelCityCode = hotelCityCode;
	}
	public String getOJhotelName() {
		return OJhotelName;
	}
	@XmlAttribute(name = "HotelName")
	public void setOJhotelName(String oJhotelName) {
		OJhotelName = oJhotelName;
	}
	public String getOJHotelCode() {
		return OJHotelCode;
	}
	@XmlAttribute(name = "OJHotelCode")
	public void setOJHotelCode(String oJHotelCode) {
		OJHotelCode = oJHotelCode;
	}
	public HotelName getHotelName() {
		return hotelName;
	}
	@XmlElement(name="HotelName", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setHotelName(HotelName hotelName) {
		this.hotelName = hotelName;
	}
	public Position getPosition() {
		return position;
	}
	@XmlElement(name="Position", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setPosition(Position position) {
		this.position = position;
	}
	public Address getAddress() {
		return address;
	}
	@XmlElement(name="Address", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phones getPhones() {
		return phones;
	}
	@XmlElement(name="Phones", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setPhones(Phones phones) {
		this.phones = phones;
	}
	public AffiliationInfo getAffiliationInfo() {
		return affiliationInfo;
	}
	@XmlElement(name="AffiliationInfo", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setAffiliationInfo(AffiliationInfo affiliationInfo) {
		this.affiliationInfo = affiliationInfo;
	}
	public VendorMessages getVendorMessages() {
		return vendorMessages;
	}
	@XmlElement(name="VendorMessages", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setVendorMessages(VendorMessages vendorMessages) {
		this.vendorMessages = vendorMessages;
	}
	

}
