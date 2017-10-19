package com.mx.posadas.xdist.core.entity.hotel.info;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="DistribSystem")
@XmlSeeAlso({CompanyName.class, Marketing.class})
public class DistribSystem {

	private String brandCode;
	private String chainCode;
	private String enabled;
	private String external;
	private String hotelCode;
	private String priority;
	private CompanyName companyName;
	private Marketing marketing;
	
	public String getBrandCode() {
		return brandCode;
	}
	@XmlAttribute(name = "BrandCode")
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public String getChainCode() {
		return chainCode;
	}
	@XmlAttribute(name = "ChainCode")
	public void setChainCode(String chainCode) {
		this.chainCode = chainCode;
	}
	public String getEnabled() {
		return enabled;
	}
	@XmlAttribute(name = "Enabled")
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getExternal() {
		return external;
	}
	@XmlAttribute(name = "External")
	public void setExternal(String external) {
		this.external = external;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	@XmlAttribute(name = "HotelCode")
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getPriority() {
		return priority;
	}
	@XmlAttribute(name = "Priority")
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public CompanyName getCompanyName() {
		return companyName;
	}
	@XmlElement(name="CompanyName", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setCompanyName(CompanyName companyName) {
		this.companyName = companyName;
	}
	public Marketing getMarketing() {
		return marketing;
	}
	@XmlElement(name="Marketing", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setMarketing(Marketing marketing) {
		this.marketing = marketing;
	}
	
}


