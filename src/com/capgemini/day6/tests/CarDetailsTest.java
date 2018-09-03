package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.CarDetails;

class CarDetailsTest {

	@Test
	void testCar() {
		TreeSet<CarDetails> car = new TreeSet<CarDetails>();

		car.add(new CarDetails("scoda", "SM320", 2011, 50000));
		car.add(new CarDetails("alto", "A320", 2015, 5000));
		car.add(new CarDetails("maruthi suzuki", "i 10", 2015, 56852));
		assertEquals(3, car.size());

		for (CarDetails cars : car) {
			System.out.println(cars);

		}
	}

}
