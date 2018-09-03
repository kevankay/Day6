package com.capgemini.day6;

import java.util.Objects;

public class CellPhone {
	private String company;
	private String type;
	private String description;
	private String operatingSystem;
	private double price;
	
	public CellPhone() {
		super();
	}
	
	public CellPhone(String company, String type, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.type = type;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		CellPhone C2 = (CellPhone) obj;
		return this.company == C2.getCompany() && this.type== C2.getType() && this.operatingSystem == C2.getOperatingSystem();
					
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(company, type, operatingSystem);
	}
	
    public int compareTo(CellPhone C2) {
		
		int result = this.company.compareTo(C2.getCompany());
		if(result == 0)
			return this.type.compareTo(C2.getType());
		
		return result;
	}

}
