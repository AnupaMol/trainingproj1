package com.training.demo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	@Id

	@Column(name = "courseId")
	private long courseId;
	@Column(name = "courseName")
	private String courseName;
	@Column(name = "credits")
	private int credits;
	@Column(name = "department")
	private String department;
	@Column(name = "faculty")
	private String faculty;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits + "]";
	}

}
