package com.anshu.core.bean;

public class Course {
	private Integer courseId;
	private String courseName;
	private String courseDuration;
	private Double courseFee;
	
	public Course(Integer courseId, String courseName, String courseDuration, Double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "\n\nCourse Details :\n\tCourse Id is 	  : " + courseId + "\n\tCourse Name is 	  : " + courseName + "\n\tcourseDuration is : " + courseDuration
				+ "\n\tCourse Fees is	  : " + courseFee+"\n";
	}
	

}
