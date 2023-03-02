package com.tmf.SMS.course.services;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.tmf.SMS.course.config.DBConfig;
import com.tmf.SMS.course.dao.CourseDAO;
import com.tmf.SMS.course.dao.CourseDAOImpl;
import com.tmf.SMS.course.model.Course;

public interface CourseServices{
	CourseDAO dao = new CourseDAOImpl();
	boolean addCourse(Course course);
	Course displayCourse(int courseId);
	List<Course> displayCourse(String qualification);
	List<Course> displayCourse();
	boolean updateCourse(Course course);
	boolean deleteCourse(Course course);
}
