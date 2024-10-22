package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue()
	private int clientId;
	private long advisorId;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String email;
	
	protected Client() {
	}
		public Client(String firstName, String lastName, String address, String phone, String email) {
			
			this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.phone = phone;
	        this.email = email;
			
		}
		
	
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public long getAdvisorId() {
		return advisorId;
	}
	public void setAdvisorId(long advisorId) {
		this.advisorId = advisorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
