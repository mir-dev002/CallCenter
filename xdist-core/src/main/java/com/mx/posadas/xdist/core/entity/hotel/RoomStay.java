package com.mx.posadas.xdist.core.entity.hotel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.mx.posadas.xdist.core.entity.hotel.exchange.ExchangeRate;
import com.mx.posadas.xdist.core.entity.hotel.exchange.ReportingExchangeRates;
import com.mx.posadas.xdist.core.entity.hotel.info.BasicPropertyInfo;
import com.mx.posadas.xdist.core.entity.hotel.plans.RatePlans;
import com.mx.posadas.xdist.core.entity.hotel.rates.RoomRates;
import com.mx.posadas.xdist.core.entity.hotel.rooms.RoomTypes;

@XmlRootElement(name = "RoomStay")
@XmlSeeAlso({RoomTypes.class, RatePlans.class, RoomRates.class, TimeSpan.class, BasicPropertyInfo.class,
			 ExchangeRate.class})
public class RoomStay {
	
	private String reference;
	private RoomTypes roomTypes;
	private RatePlans ratePlans;
	private RoomRates roomRates;
	private TimeSpan timeSpan;
	private BasicPropertyInfo basicPropertyInfo;
	private ExchangeRate exchangeRate;
	private ReportingExchangeRates reportingExchangeRates;
	
	public String getReference() {
		return reference;
	}

	@XmlAttribute(name = "Reference")
	public void setReference(String reference) {
		this.reference = reference;
	}

	public RoomTypes getRoomTypes() {
		return roomTypes;
	}

	@XmlElement(name="RoomTypes", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRoomTypes(RoomTypes roomTypes) {
		this.roomTypes = roomTypes;
	}

	public RatePlans getRatePlans() {
		return ratePlans;
	}

	@XmlElement(name="RatePlans", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRatePlans(RatePlans ratePlans) {
		this.ratePlans = ratePlans;
	}

	public RoomRates getRoomRates() {
		return roomRates;
	}

	@XmlElement(name="RoomRates", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setRoomRates(RoomRates roomRates) {
		this.roomRates = roomRates;
	}

	public TimeSpan getTimeSpan() {
		return timeSpan;
	}

	@XmlElement(name="TimeSpan", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setTimeSpan(TimeSpan timeSpan) {
		this.timeSpan = timeSpan;
	}

	public BasicPropertyInfo getBasicPropertyInfo() {
		return basicPropertyInfo;
	}

	@XmlElement(name="BasicPropertyInfo", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setBasicPropertyInfo(BasicPropertyInfo basicPropertyInfo) {
		this.basicPropertyInfo = basicPropertyInfo;
	}

	public ExchangeRate getExchangeRate() {
		return exchangeRate;
	}

	@XmlElement(name="ExchangeRate", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public ReportingExchangeRates getReportingExchangeRates() {
		return reportingExchangeRates;
	}

	@XmlElement(name="ReportingExchangeRates", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setReportingExchangeRates(ReportingExchangeRates reportingExchangeRates) {
		this.reportingExchangeRates = reportingExchangeRates;
	}


}

