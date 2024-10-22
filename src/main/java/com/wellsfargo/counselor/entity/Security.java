package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
	
	
	@Id
	@GeneratedValue()
	private long secutityId;
	private long portfolioId;
	private String name;
	private String category;
	private long purchasePrice;
	private Date purchaseDate;
	private String quantity;
	
	
	protected Security() {
		
	}
	
	public Security (String name, String category, long purchasePrice, Date purchaseDate, String quantity) {
		
		this.name = name;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quantity = quantity;
		
	}

	public long getSecutityId() {
		return secutityId;
	}

	public void setSecutityId(long secutityId) {
		this.secutityId = secutityId;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
