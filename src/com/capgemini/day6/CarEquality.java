package com.capgemini.day6;

import java.util.Objects;

public class CarEquality {
	private String make;
	private String model;
	private int year;
	private double price;
	public CarEquality() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarEquality(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarEquality [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		CarEquality C2 = (CarEquality) obj;
		return this.make == C2.getMake() && this.model == C2.getModel() ;
					
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(make, model);
	}
	

	public int compareTo(CarEquality C2) {
		
		int result = this.make.compareTo(C2.getMake());
		if(result == 0)
			return this.model.compareTo(C2.getModel());
		return result;
	}
	
}
