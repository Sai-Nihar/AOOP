package com.studentinfo;


import java.util.ArrayList;
import java.util.List;

public class Student implements StudentDetails{
	private String studentId;
	private String studentName;
	private List<CourseDetails> courses;

	public Student(String studentId, String studentName) {
	    this.studentId = studentId;
	    this.studentName = studentName;
	    this.courses = new ArrayList<>();
	}

	@Override
	public String getStudentId() {
		// TODO Auto-generated method stub
		return studentId;
	}

	@Override
	public String getStudentName() {
		// TODO Auto-generated method stub
		return studentName;
	}

	@Override
	public void enrollInCourse(CourseDetails course) {
		// TODO Auto-generated method stub
		 courses.add(course);
	        System.out.println(studentName + " enrolled in " + course.getCourseName());
	}
	 public List<CourseDetails> getCourses() {
	        return courses;
	    }

}