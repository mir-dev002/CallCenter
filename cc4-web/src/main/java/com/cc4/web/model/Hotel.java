package com.cc4.web.model;

public class Hotel {
	
	private String id;
	private String code;
	private String name;
	private String image;
	private Double puntos;
	private Integer rating;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Double getPuntos() {
		return puntos;
	}
	public void setPuntos(Double puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", code=" + code + ", name=" + name + ", image=" + image + ", puntos=" + puntos
				+ ", rating=" + rating + "]";
	}
	
	
	
}
