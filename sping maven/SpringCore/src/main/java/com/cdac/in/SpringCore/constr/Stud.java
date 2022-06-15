package com.cdac.in.SpringCore.constr;

public class Stud {
	private int studId;
	private String studName;
	private String studAddress;
	Certi certi;
	
	public Stud(int studId, String studName, String studAddress,Certi certi) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return "Stud [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", certi=" + certi.name
				+ "]";
	}

	
	
	

	
	
}
