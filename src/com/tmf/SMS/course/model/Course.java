package com.tmf.SMS.course.model;

public class Course {
	private int courseId,duration;
	private double fee;
	private String courseName, modulesToBeCovered,qualification;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getModulesToBeCovered() {
		return modulesToBeCovered;
	}
	public void setModulesToBeCovered(String modulesToBeCovered) {
		this.modulesToBeCovered = modulesToBeCovered;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", duration=" + duration + ", fee=" + fee + ", courseName=" + courseName
				+ ", modulesToBeCovered=" + modulesToBeCovered + ", qualification=" + qualification + "]";
	}
	public Course(int courseId, int duration, double fee, String courseName, String modulesToBeCovered,
			String qualification) {
		super();
		this.courseId = courseId;
		this.duration = duration;
		this.fee = fee;
		this.courseName = courseName;
		this.modulesToBeCovered = modulesToBeCovered;
		this.qualification = qualification;
	}
	
	
}
