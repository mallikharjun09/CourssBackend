package com.tmf.SMS.course.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.tmf.SMS.course.model.Course;

public class CourseDAOImpl implements CourseDAO {

	private PreparedStatement ps;
	private ResultSet rs;
	private String query;
	@Override
	public boolean addCourse(Course course) {
		boolean result=false;
		try {
			String query="insert into course values (?,?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, course.getCourseId());
			ps.setString(2, course.getCourseName());
			ps.setString(3, course.getModulesToBeCovered());
			ps.setString(4, course.getQualification());
			ps.setInt(5, course.getDuration());
			ps.setDouble(6, course.getFee());
			ps.execute();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Course displayCourse(int courseId) {
		Course course = new Course(0,0,0,null,null,null);
		try {
			query = "select * from course";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				int cid = rs.getInt("courseId");
				String cname = rs.getString("courseName");
				String modules = rs.getString("modulesTobeCovered");
				String qual = rs.getString("requiredQualification");
				int duration = rs.getInt("duration");
				double fee = rs.getDouble("fee");
				
				course = new Course(cid, duration, fee, cname, modules, qual);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return course;
	}

	@Override
	public List<Course> displayCourse(String qualification) {
		courses.clear();
		try {
			query = "select * from course where qualification like ?";
			String q = "%"+qualification+"%";
			ps = con.prepareStatement(query);
			ps.setString(1, q);
			rs = ps.executeQuery();
			while(rs.next()) {
				int cid = rs.getInt("courseId");
				String cname = rs.getString("courseName");
				String modules = rs.getString("modulesTobeCovered");
				String qual = rs.getString("requiredQualification");
				int duration = rs.getInt("duration");
				double fee = rs.getDouble("fee");
				
				Course course = new Course(cid, duration, fee, cname, modules, qual);
				courses.add(course);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return courses;
	}

	@Override
	public List<Course> displayCourse() {
		courses.clear();
		try {
			query = "select * from course";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				int cid = rs.getInt("courseId");
				String cname = rs.getString("courseName");
				String modules = rs.getString("modulesTobeCovered");
				String qual = rs.getString("requiredQualification");
				int duration = rs.getInt("duration");
				double fee = rs.getDouble("fee");
				
				Course course = new Course(cid, duration, fee, cname, modules, qual);
				courses.add(course);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return courses;
	}

	@Override
	public boolean updateCourse(Course course) {
		boolean result=false;
		try {
			String query="update course set courseName=?,requiredQualification=?"
					+ ",fee=?,duration=?,modulesTobeCovered=? where courseId=?";
			ps = con.prepareStatement(query);
			ps.setInt(6, course.getCourseId());
			ps.setString(1, course.getCourseName());
			ps.setString(5, course.getModulesToBeCovered());
			ps.setString(2, course.getQualification());
			ps.setInt(4, course.getDuration());
			ps.setDouble(3, course.getFee());
			ps.execute();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteCourse(Course course) {
		boolean result = false;
		try {
			query = "delete from course where courseId=?";
			ps = con.prepareStatement(query);
			ps.setInt(1, course.getCourseId());
			ps.execute();
			result = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
