package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Base")
public class Base {

	private String amountAfterTax;
	private String amountBeforeTax;
	private String currencyCode;
	private String originalAmountAfterTax;
	private String originalAmountBeforeTax;
	private String originalCurrencyCode;
	
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
	public String getCurrencyCode() {
		return currencyCode;
	}
	@XmlAttribute(name = "CurrencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getOriginalAmountAfterTax() {
		return originalAmountAfterTax;
	}
	@XmlAttribute(name = "OriginalAmountAfterTax")
	public void setOriginalAmountAfterTax(String originalAmountAfterTax) {
		this.originalAmountAfterTax = originalAmountAfterTax;
	}
	public String getOriginalAmountBeforeTax() {
		return originalAmountBeforeTax;
	}
	@XmlAttribute(name = "OriginalAmountBeforeTax")
	public void setOriginalAmountBeforeTax(String originalAmountBeforeTax) {
		this.originalAmountBeforeTax = originalAmountBeforeTax;
	}
	public String getOriginalCurrencyCode() {
		return originalCurrencyCode;
	}
	@XmlAttribute(name = "OriginalCurrencyCode")
	public void setOriginalCurrencyCode(String originalCurrencyCode) {
		this.originalCurrencyCode = originalCurrencyCode;
	}	
	
}


