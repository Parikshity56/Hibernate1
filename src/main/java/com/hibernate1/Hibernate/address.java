package com.hibernate1.Hibernate;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Embeddable
public class address {
	
	@Id
	private int sno;
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	private String place;
	private String city;
	

	
	@Override
	public String toString() {
		return "address [sno=" + sno + ", place=" + place + ", city=" + city + "]";
	}

	public address() {
	}
	public address( String place, String city) {
		super();
		this.place = place;
		this.city = city;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
}
