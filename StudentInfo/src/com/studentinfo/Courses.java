package com.studentinfo;
import java.util.ArrayList;
import java.util.List;

public class Courses implements CourseDetails{
	private String courseId;
    private String courseName;
    private List<StudentDetails> enrolledStudents;

    public Courses(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

	@Override
	public String getCourseId() {
		// TODO Auto-generated method stub
		return courseId;
	}

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return courseName;
	}

	@Override
	public void enrollStudent(StudentDetails student) {
		// TODO Auto-generated method stub
		enrolledStudents.add(student);
        System.out.println(student.getStudentName() + " enrolled in course " + courseName);
	}
	public List<StudentDetails> getEnrolledStudents() {
        return enrolledStudents;
        
    }

}
