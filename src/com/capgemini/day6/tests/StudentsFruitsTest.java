package com.capgemini.day6.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class StudentsFruitsTest {

	@Test
	void test() {
		HashMap<String, ArrayList<String>> students= new HashMap<String,ArrayList<String>>();
		
		String[] favorites = new String[] {"apple","papaya"};
		students.put("shiny", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		students.put("keerthana", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"pineapple","pomogranate"};
		students.put("swathi", new ArrayList<>(Arrays.asList(favorites)));
		
		
		
//		for (Entry<String, ArrayList<String>> entry : students.entrySet()) 
//            System.out.println("Name = " + entry.getKey() + ", Favourite fruits = " + entry.getValue());
		    System.out.println(students.get("keerthana"));
		
	}
	
	
}


