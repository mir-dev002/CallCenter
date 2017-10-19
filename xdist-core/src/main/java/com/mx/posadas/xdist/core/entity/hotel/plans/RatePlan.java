package com.mx.posadas.xdist.core.entity.hotel.plans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RatePlan")
public class RatePlan {
	
	private String bookingOffice;
	private String checkout24H;
	private String currencyCode;
	private String enabled;
	private String end;
	private String lowAllocThreshold;
	private String paymentModel;
	private String paymentType;
	private String priority;
	private String promotionCode;
	private String ratePlanCode;
	private String ratePlanName;
	private String ratePlanType;
	private String start;
	private String status;
	private String stayEnd;
	private String stayStart;
	private String supplierCode;
	private String taxConfiguration;
	
	public String getBookingOffice() {
		return bookingOffice;
	}
	@XmlAttribute(name = "BookingOffice")
	public void setBookingOffice(String bookingOffice) {
		this.bookingOffice = bookingOffice;
	}
	public String getCheckout24H() {
		return checkout24H;
	}
	@XmlAttribute(name = "Checkout24H")
	public void setCheckout24H(String checkout24h) {
		checkout24H = checkout24h;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	@XmlAttribute(name = "CurrencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getEnabled() {
		return enabled;
	}
	@XmlAttribute(name = "Enabled")
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getEnd() {
		return end;
	}
	@XmlAttribute(name = "End")
	public void setEnd(String end) {
		this.end = end;
	}
	public String getLowAllocThreshold() {
		return lowAllocThreshold;
	}
	@XmlAttribute(name = "LowAllocThreshold")
	public void setLowAllocThreshold(String lowAllocThreshold) {
		this.lowAllocThreshold = lowAllocThreshold;
	}
	public String getPaymentModel() {
		return paymentModel;
	}
	@XmlAttribute(name = "PaymentModel")
	public void setPaymentModel(String paymentModel) {
		this.paymentModel = paymentModel;
	}
	public String getPaymentType() {
		return paymentType;
	}
	@XmlAttribute(name = "PaymentType")
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPriority() {
		return priority;
	}
	@XmlAttribute(name = "Priority")
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getPromotionCode() {
		return promotionCode;
	}
	@XmlAttribute(name = "PromotionCode")
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
	public String getRatePlanCode() {
		return ratePlanCode;
	}
	@XmlAttribute(name = "RatePlanCode")
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	public String getRatePlanName() {
		return ratePlanName;
	}
	@XmlAttribute(name = "RatePlanName")
	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}
	public String getRatePlanType() {
		return ratePlanType;
	}
	@XmlAttribute(name = "RatePlanType")
	public void setRatePlanType(String ratePlanType) {
		this.ratePlanType = ratePlanType;
	}
	public String getStart() {
		return start;
	}
	@XmlAttribute(name = "Start")
	public void setStart(String start) {
		this.start = start;
	}
	public String getStatus() {
		return status;
	}
	@XmlAttribute(name = "Status")
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStayEnd() {
		return stayEnd;
	}
	@XmlAttribute(name = "StayEnd")
	public void setStayEnd(String stayEnd) {
		this.stayEnd = stayEnd;
	}
	public String getStayStart() {
		return stayStart;
	}
	@XmlAttribute(name = "StayStart")
	public void setStayStart(String stayStart) {
		this.stayStart = stayStart;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	@XmlAttribute(name = "SupplierCode")
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getTaxConfiguration() {
		return taxConfiguration;
	}
	@XmlAttribute(name = "TaxConfiguration")
	public void setTaxConfiguration(String taxConfiguration) {
		this.taxConfiguration = taxConfiguration;
	}

}


