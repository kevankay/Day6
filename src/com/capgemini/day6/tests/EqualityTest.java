package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.CarEquality;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.LaptopEquality;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class EqualityTest {

	
		@Test
		void testLaptopEquality() {
			HashSet<LaptopEquality> laptops = new HashSet<>();

			assertEquals(true, laptops.add(new LaptopEquality("Dell", "Inspiron5558", "Windows 5", "i5")));
			laptops.add(new LaptopEquality("HP", "HP234", "Windows 10", "i3"));
			laptops.add(new LaptopEquality("HP", "HP234", "Windows 8", "i7"));

			assertEquals(2, laptops.size());
		}
		
		@Test
		void testCarEquality() {
			HashSet<CarEquality> cars = new HashSet<>();

			assertEquals(true, cars.add(new CarEquality("Renault", "duster", 2012, 2500000)));
			cars.add(new CarEquality("Renault", "duster", 2015, 1500000));
			cars.add(new CarEquality("Ford", "eco", 2018, 2000000));

			assertEquals(2, cars.size());
		}

		@Test
		void testTelevisionEquality() {
			HashSet<Television> televisions = new HashSet<>();

			assertEquals(true, televisions.add(new Television("Samsung", "plasma", true, 25000)));
			televisions.add(new Television("Panasonic", "LCD", false, 15000));
			televisions.add(new Television("Panasonic", "LCD", true, 15000));

			assertEquals(2, televisions.size());
		}
		
		@Test
		void testCellPhoneEquality() {
			HashSet<CellPhone> phones = new HashSet<>();

			assertEquals(true, phones.add(new CellPhone("Redmi", "Note5","Good", "java", 5000)));
			phones.add(new CellPhone("Vivo", "V9", "Better","Windows", 15000));
			phones.add(new CellPhone("Redmi", "Note5", "Worst","java", 1000));

			assertEquals(2, phones.size());
		}
		
		@Test
		void testSchoolEquality() {
			HashSet<School> schools = new HashSet<>();

			assertEquals(true, schools.add(new School("St annes", "Bhimavaram,","West Godavari",1)));
			schools.add(new School("St annes", "Bhimavaram,","West Godavari", 5));
			schools.add(new School("Bk school", "Rajamundry", "east Godavari", 2));

			assertEquals(2, schools.size());
		}
		
	}


