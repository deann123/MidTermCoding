package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	
	private Enrollment(){
		SetID(EnrollmentID);
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){

		this.StudentID = StudentID;
		this.SectionID = SectionID;
		
	}
	
	public void SetID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	public void SetGrade(double Grade){
		this.Grade = Grade;
	}
}