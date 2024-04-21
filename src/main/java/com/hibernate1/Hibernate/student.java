package com.hibernate1.Hibernate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class student {
	@Id
	private int sno;
	private String name;
	private String password;
	
	
	@Override
	public String toString() {
		return "student [ name=" + name + ", password=" + password + ", address=" + address + "]";
	}
	
	public address address;

	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public student() {
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}	
	
	
	

	
}
