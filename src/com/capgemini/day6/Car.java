package com.capgemini.day6;

import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private int year;
	private double price;

	public Car() {
		super();
	}

	public Car(String make, String model, int year, double price) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Car c2 = (Car) obj;
		return this.make == c2.make && this.model == c2.model && this.year == c2.year && this.price == c2.price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model, year, price);
	}
}
