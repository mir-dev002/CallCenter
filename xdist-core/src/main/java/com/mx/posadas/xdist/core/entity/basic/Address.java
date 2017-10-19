package com.mx.posadas.xdist.core.entity.basic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "Address")
@XmlSeeAlso({StreetNmbr.class, AddressLine.class, Area.class, CityName.class,
			 PostalCode.class, StateProv.class, CountryName.class})
public class Address {
	
	private String useType;
	private StreetNmbr streetNmbr;
	private AddressLine addressLine;
	private Area area;
	private CityName cityName;
	private PostalCode postalCode;
	private StateProv stateProv;
	private CountryName countryName;
	
	public String getUseType() {
		return useType;
	}
	@XmlAttribute(name = "UseType")
	public void setUseType(String useType) {
		this.useType = useType;
	}
	public StreetNmbr getStreetNmbr() {
		return streetNmbr;
	}
	@XmlElement(name="StreetNmbr", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setStreetNmbr(StreetNmbr streetNmbr) {
		this.streetNmbr = streetNmbr;
	}
	public AddressLine getAddressLine() {
		return addressLine;
	}
	@XmlElement(name="AddressLine", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setAddressLine(AddressLine addressLine) {
		this.addressLine = addressLine;
	}
	public Area getArea() {
		return area;
	}
	@XmlElement(name="Area", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setArea(Area area) {
		this.area = area;
	}
	public CityName getCityName() {
		return cityName;
	}
	@XmlElement(name="CityName", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setCityName(CityName cityName) {
		this.cityName = cityName;
	}
	public PostalCode getPostalCode() {
		return postalCode;
	}
	@XmlElement(name="PostalCode", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}
	public StateProv getStateProv() {
		return stateProv;
	}
	@XmlElement(name="StateProv", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setStateProv(StateProv stateProv) {
		this.stateProv = stateProv;
	}
	public CountryName getCountryName() {
		return countryName;
	}
	@XmlElement(name="CountryName", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setCountryName(CountryName countryName) {
		this.countryName = countryName;
	}
	
}
