package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class StudentTest {

	@Test
		void testStudentDetails() {
			ArrayList<Student> students = new ArrayList<Student>();

			assertEquals(true, students.add(new Student("shiny",285,"EEE")));
			students.add(new Student("george",284,"CSE"));
	
			for (Student student : students) {
			System.out.println(student);
		}
		}
	
	
	@Test
	void testStudentOrder() {
		TreeSet<Student> students = new TreeSet<Student>();

		assertEquals(true, students.add(new Student("shiny",283,"EEE")));
		students.add(new Student("george",284,"CSE"));
		
		for (Student student : students) {
			System.out.println(student);
		}
    
	}
	}


