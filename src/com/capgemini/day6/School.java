package com.capgemini.day6;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	
	public School() {
		super();
		
	}
	
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		School S2 = (School) obj;
		return this.name == S2.getName() && this.city== S2.getCity() && this.schoolDistrict == S2.getSchoolDistrict();
					
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(name,city, schoolDistrict);
	}
	
    public int compareTo(School S2) {
		
		int result = this.name.compareTo(S2.getName());
		if(result == 0)
			return this.city.compareTo(S2.getCity());
		
		return result;
	}
	
}
