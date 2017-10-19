package com.mx.posadas.xdist.core.entity.hotel.rates;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "Rate")
@XmlSeeAlso({Base.class, NightlyRates.class, Total.class, TPAExtensions.class, PriceAdjustments.class})
public class Rate {
	
	private Base base;
	private NightlyRates nightlyRates;
	private Total  total;
	private TPAExtensions  tpaExtensions;
	private PriceAdjustments priceAdjustments;
	
	public Base getBase() {
		return base;
	}
	@XmlElement(name="Base", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setBase(Base base) {
		this.base = base;
	}
	public NightlyRates getNightlyRates() {
		return nightlyRates;
	}
	
	@XmlElement(name="NightlyRates", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setNightlyRates(NightlyRates nightlyRates) {
		this.nightlyRates = nightlyRates;
	}
	public Total getTotal() {
		return total;
	}
	@XmlElement(name="Total", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setTotal(Total total) {
		this.total = total;
	}
	public TPAExtensions getTpaExtensions() {
		return tpaExtensions;
	}
	@XmlElement(name="TPA_Extensions", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setTpaExtensions(TPAExtensions tpaExtensions) {
		this.tpaExtensions = tpaExtensions;
	}
	public PriceAdjustments getPriceAdjustments() {
		return priceAdjustments;
	}
	@XmlElement(name="PriceAdjustments", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setPriceAdjustments(PriceAdjustments priceAdjustments) {
		this.priceAdjustments = priceAdjustments;
	}
	


}
