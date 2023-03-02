package com.tmf.SMS.course.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.tmf.SMS.course.config.DBConfig;
import com.tmf.SMS.course.model.Course;

public interface CourseDAO {
	List<Course> courses = new ArrayList<Course>();
	DBConfig config = new DBConfig();
	Connection con = config.getConnection();
	boolean addCourse(Course course);
	Course displayCourse(int courseId);
	List<Course> displayCourse(String qualification);
	List<Course> displayCourse();
	boolean updateCourse(Course course);
	boolean deleteCourse(Course course);
}
