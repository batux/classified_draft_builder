package com.design.pattern.builder.model;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 8252859260800024064L;
	
	private String cityName;
	private String townName;
	private String address;
	
	public Address(String cityName, String townName, String address) {
		this.cityName = cityName;
		this.townName = townName;
		this.address = address;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", townName=" + townName + ", address=" + address + "]";
	}
}
