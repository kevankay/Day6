package com.capgemini.day6;

import java.util.Objects;

public class CarDetails implements Comparable<CarDetails> {
	private String make;
	private String model;
	private int year;
	private double price;

	public CarDetails() {

		super();

	}

	public CarDetails(String company, String model, int year, double price) {
		super();
		this.make = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getName() {
		return make;
	}

	public void setName(String name) {
		this.make = name;
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
		return "CarDetails [name=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model, year, price);
	}

	@Override
	public int compareTo(CarDetails Car) {

		int result = this.make.compareTo(Car.make);
//		if(result == 0)
//			return this.model.compareTo(Car.model);
		return result;
	}

}
