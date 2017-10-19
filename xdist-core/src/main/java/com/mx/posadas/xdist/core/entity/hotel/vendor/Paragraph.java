package com.mx.posadas.xdist.core.entity.hotel.vendor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.mx.posadas.xdist.core.entity.basic.Image;
import com.mx.posadas.xdist.core.entity.basic.URL;

@XmlRootElement(name = "Paragraph")
@XmlSeeAlso({Image.class, URL.class})
public class Paragraph {
	
	private String contentData;
	private Image image;
	private URL url;
	public String getContentData() {
		return contentData;
	}
	@XmlAttribute(name = "ContentData")
	public void setContentData(String contentData) {
		this.contentData = contentData;
	}
	public Image getImage() {
		return image;
	}
	@XmlElement(name="Image", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setImage(Image image) {
		this.image = image;
	}
	public URL getUrl() {
		return url;
	}
	@XmlElement(name="URL", namespace="http://www.opentravel.org/OTA/2003/05")
	public void setUrl(URL url) {
		this.url = url;
	}
	
	

}
