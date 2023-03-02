package com.tmf.SMS.course.services;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.util.List;

import com.tmf.SMS.course.model.Course;

public class CourseServiceImpl implements CourseServices {

	@Override
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.addCourse(course);
	}

	@Override
	public Course displayCourse(int courseId) {
		// TODO Auto-generated method stub
		return dao.displayCourse(courseId);
	}

	@Override
	public List<Course> displayCourse(String qualification) {
		// TODO Auto-generated method stub
		return dao.displayCourse(qualification);
	}

	@Override
	public List<Course> displayCourse() {
		// TODO Auto-generated method stub
		return dao.displayCourse();
	}

	@Override
	public boolean updateCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.updateCourse(course);
	}

	@Override
	public boolean deleteCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.deleteCourse(course);
	}

}
