package com.cdac.in.SpringCore;

public class Student {
	

	private int studId;
	private String studName;
	private String studAddress;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String studName, String studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}
	
	
	
	

}
