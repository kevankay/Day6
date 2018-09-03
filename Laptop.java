package com.capgemini.day6;

import java.util.HashSet;
import java.util.Set;

public class Laptop {
	public static void main(String[] args) {
		private String company;
		private long model;
		private String operatingSystem;
		private String processor;
		
		public Laptop(String company,long model,String processor) {
			this.company=company;
			this.model=model;
			this.processor=processor;
		}
        Set<Object> LaptopDetails = new HashSet<>();

        LaptopDetails.add("dell");
        
        
        LaptopDetails.add("dell",1234,"I5");

        System.out.println(LaptopDetails);
    }
}
	
	public String toString() {
		return "company is "+this.company + " model is "+this.model+ " processor is "+this.processor; 
	}
    
	} 
}
