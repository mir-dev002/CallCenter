package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "PriceAdjustments")
@XmlSeeAlso({PriceAdjustment.class})
public class PriceAdjustments {
	
	private String amount;
	private String currencyCode;
	private PriceAdjustment priceAdjustment;
	
	public String getAmount() {
		return amount;
	}
	@XmlAttribute(name = "Amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	@XmlAttribute(name = "CurrencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public PriceAdjustment getPriceAdjustment() {
		return priceAdjustment;
	}
	@XmlElement(name="PriceAdjustment", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
		this.priceAdjustment = priceAdjustment;
	}
	
	

}
