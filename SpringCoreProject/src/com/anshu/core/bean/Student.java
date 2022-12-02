package com.anshu.core.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int studentRollNo;
	private Integer studentAge;
	private String studentName;
	private Date studentEnrollDate;
	private Course couseName;
	private List<String> studentMobNo;
	private Set<Address> studentAddress;
	private Map<String, Integer> subjectMarks;
	
	public Student(int studentRollNo, Integer studentAge, String studentName, Date studentEnrollDate, Course couseName,
			List<String> studentMobNo, Set<Address> studentAddress, Map<String, Integer> subjectMarks) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentEnrollDate = studentEnrollDate;
		this.couseName = couseName;
		this.studentMobNo = studentMobNo;
		this.studentAddress = studentAddress;
		this.subjectMarks = subjectMarks;
	}

	@Override
	public String toString() {
		return "\n*************************************\n"
				+ "---------Student Information----------"
				+ "\n*************************************\n"
				+ "\nStudent RollNumber : " + studentRollNo + "\nStudent Age 	   : " +studentAge + "\nStudent Name       : " + studentName
				+ "\nStudent EnrollDate : " + studentEnrollDate+ couseName + ", \nstudent Mobile No :\n\t "
				+ studentMobNo + ",\n\nstudent Address Details :\n\t-------------------------- " + studentAddress + "\n SubjectMarks :\n\t" + subjectMarks ;
	}
	
	

}
