package com.studentinfo;
public class EnrollmentManager implements Enrollment{

	@Override
	public void enroll(StudentDetails student, CourseDetails course) {
		// TODO Auto-generated method stub
		student.enrollInCourse(course);
        course.enrollStudent(student);
	}

}
