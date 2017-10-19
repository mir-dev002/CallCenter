package com.mx.posadas.core.ctes;

public enum RQ {
	
	HOTEL_AVAIL("HotelAvailRQ.xsl");
	
	private String xml;
	
	private RQ(String xml){
		this.xml = xml;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}
	


}
