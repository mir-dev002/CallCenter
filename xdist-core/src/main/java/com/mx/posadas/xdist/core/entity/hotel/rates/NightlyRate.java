package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NightlyRate")
public class NightlyRate {
	
	private String amountAfterTax;
	private String amountBeforeTax;
	private String available;
	private String buyingAmount;
	private String currencyCode;
	private String effectiveDate;
	private String expireDate;
	private String nightNumber;
	private String ratePlanCode;
	private String maxPayment;
	
	public String getAmountAfterTax() {
		return amountAfterTax;
	}
	@XmlAttribute(name = "AmountAfterTax")
	public void setAmountAfterTax(String amountAfterTax) {
		this.amountAfterTax = amountAfterTax;
	}
	public String getAmountBeforeTax() {
		return amountBeforeTax;
	}
	@XmlAttribute(name = "AmountBeforeTax")
	public void setAmountBeforeTax(String amountBeforeTax) {
		this.amountBeforeTax = amountBeforeTax;
	}
	public String getAvailable() {
		return available;
	}
	@XmlAttribute(name = "Available")
	public void setAvailable(String available) {
		this.available = available;
	}
	public String getBuyingAmount() {
		return buyingAmount;
	}
	@XmlAttribute(name = "BuyingAmoun")
	public void setBuyingAmount(String buyingAmount) {
		this.buyingAmount = buyingAmount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	@XmlAttribute(name = "CurrencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	@XmlAttribute(name = "EffectiveDate")
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getExpireDate() {
		return expireDate;
	}
	@XmlAttribute(name = "ExpireDate")
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getNightNumber() {
		return nightNumber;
	}
	@XmlAttribute(name = "NightNumber")
	public void setNightNumber(String nightNumber) {
		this.nightNumber = nightNumber;
	}
	public String getRatePlanCode() {
		return ratePlanCode;
	}
	@XmlAttribute(name = "RatePlanCode")
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	public String getMaxPayment() {
		return maxPayment;
	}
	@XmlAttribute(name = "MaxPayment")
	public void setMaxPayment(String maxPayment) {
		this.maxPayment = maxPayment;
	}
	
}


