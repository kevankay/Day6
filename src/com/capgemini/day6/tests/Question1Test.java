package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class Question1Test {

	@Test
	void testLaptopProducts() {
		ArrayList<Laptop> laptops = new ArrayList<>();

		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("Lenovo", "HP677", "Windows 10", "i7"));

		assertEquals(3, laptops.size());
	}

	@Test
	void testCarProducts() {
		ArrayList<Car> cars = new ArrayList<>();

		assertEquals(true, cars.add(new Car("Renault", "duster", 2012, 2500000)));
		cars.add(new Car("Mahindra", "ilo", 2015, 1500000));
		cars.add(new Car("Ford", "eco", 2018, 2000000));

		assertEquals(3, cars.size());
	}

	@Test
	void testTelevisionProducts() {
		ArrayList<Television> televisions = new ArrayList<>();

		assertEquals(true, televisions.add(new Television("Samsung", "plasma", true, 25000)));
		televisions.add(new Television("Panasonic", "LCD", false, 15000));
		televisions.add(new Television("LG", "LED", true, 20000));

		assertEquals(3, televisions.size());
	}
	
	@Test
	void testCellPhoneProducts() {
		ArrayList<CellPhone> phones = new ArrayList<>();

		assertEquals(true, phones.add(new CellPhone("Samsung", "duo","Good","Android", 5000)));
		phones.add(new CellPhone("Vivo", "V9", "Better","Windows", 15000));
		phones.add(new CellPhone("Redmi", "Note5", "java", "Worst", 1000));

		assertEquals(3, phones.size());
	}
	
	@Test
	void testSchoolDetails() {
		ArrayList<School> schools = new ArrayList<>();

		assertEquals(true, schools.add(new School("Vasavi", "Narasaraopet","Guntur",1)));
		schools.add(new School("St annes", "Bhimavaram,","West Godavari", 5));
		schools.add(new School("Bk school", "Rajamundry", "east Godavari", 2));

		assertEquals(3, schools.size());
	}
	
	
	
	
	
	@Test
	void testLaptopDuplicate() {
		HashSet<Laptop> laptops = new HashSet<>();

		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5"));

		assertEquals(2, laptops.size());
	}
	
	@Test
	void testCarDuplicate() {
		HashSet<Car> cars = new HashSet<>();

		assertEquals(true, cars.add(new Car("Renault", "duster", 2012, 2500000)));
		cars.add(new Car("Mahindra", "ilo", 2015, 1500000));
		cars.add(new Car("Mahindra", "ilo", 2015, 1500000));

		assertEquals(2, cars.size());
	}
	
	
}
	
	
	
	
