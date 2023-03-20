package com.einfochips.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Student {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String course;
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", course=" + course + "]";
	}
	public Student() {
		super();
	}
	
	public Student(int id, String fname, String lname, String course) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
