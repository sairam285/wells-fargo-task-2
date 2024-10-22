package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
	
	
	@Id
	@GeneratedValue()
	private long portfolioId;
	private int clientId;
	private Date creationDate;
	
	
	protected Portfolio() {
		
	}
	
	public Portfolio(Date creationDate ) {
		
		this.creationDate = creationDate;
	
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
