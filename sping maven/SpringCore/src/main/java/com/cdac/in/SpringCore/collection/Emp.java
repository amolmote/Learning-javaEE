package com.cdac.in.SpringCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private String empName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Emp(String empName, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		System.out.println(" set empName");
		
		this.empName = empName;
	}



	public List<String> getPhones() {
		
		return phones;
	}



	public void setPhones(List<String> phones) {
		
		System.out.println(" set empphone");
		this.phones = phones;
	}



	public Set<String> getAddresses() {
		return addresses;
	}



	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}



	public Map<String, String> getCourses() {
		return courses;
	}



	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}



	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}
	
	
	
	
}
