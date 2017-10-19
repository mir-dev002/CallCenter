package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PriceAdjustment")
public class PriceAdjustment {
	
	private String amount;
	private String code;
	private String codeContext;
	private String currencyCode;
	private String date;
	private String description;
	private String manual;
	private String modular;
	
	public String getAmount() {
		return amount;
	}
	@XmlAttribute(name = "Amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCode() {
		return code;
	}
	@XmlAttribute(name = "Code")
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeContext() {
		return codeContext;
	}
	@XmlAttribute(name = "CodeContext")
	public void setCodeContext(String codeContext) {
		this.codeContext = codeContext;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	@XmlAttribute(name = "CurrencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getDate() {
		return date;
	}
	@XmlAttribute(name = "Date")
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	@XmlAttribute(name = "Description")
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManual() {
		return manual;
	}
	@XmlAttribute(name = "Manual")
	public void setManual(String manual) {
		this.manual = manual;
	}
	public String getModular() {
		return modular;
	}
	@XmlAttribute(name = "Modular")
	public void setModular(String modular) {
		this.modular = modular;
	}
	
}

