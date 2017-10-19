package com.mx.posadas.xdist.core.entity.hotel.exchange;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExchangeRate")
public class ReportingExchangeRates {
	
	private String date;
	private String fromCurrency;
	private String rate;
	private String toCurrency;
	
	public String getDate() {
		return date;
	}
	@XmlAttribute(name = "Date")
	public void setDate(String date) {
		this.date = date;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	@XmlAttribute(name = "FromCurrency")
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getRate() {
		return rate;
	}
	@XmlAttribute(name = "Rate")
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	@XmlAttribute(name = "ToCurrency")
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
		

}
