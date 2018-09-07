package com.droolspoc.model;

public class InsuranceProduct {
	
	private Integer premium; 
	private String type;
	private Integer maturityPeriod;
	
	public Integer getMaturityPeriod() {
		return maturityPeriod;
	}
	public void setMaturityPeriod(Integer maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public Integer getPremium() {
		return premium;
	}
	public void setPremium(Integer discount) {
		this.premium = discount;
	}


}
