package com.hi5.laundromat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WashDetails {

	@Id
	private Long tokenNumber;
	private String mobileNumber;
	private String customerName;
	private double weight;
	private Boolean isExpressWash;
	private Boolean purchasedBag;
	private String modeOfPayment;

	public Long getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(Long tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Boolean getIsExpressWash() {
		return isExpressWash;
	}

	public void setIsExpressWash(Boolean isExpressWash) {
		this.isExpressWash = isExpressWash;
	}

	public Boolean getPurchasedBag() {
		return purchasedBag;
	}

	public void setPurchasedBag(Boolean purchasedBag) {
		this.purchasedBag = purchasedBag;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

}
