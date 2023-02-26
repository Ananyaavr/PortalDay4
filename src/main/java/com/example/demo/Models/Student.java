package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
    private String StudentName;
    private String DeptName;
    private long mailid;
    
	public Student(int id, String studentName, String deptName, long mailid) {
		super();
		this.id = id;
		StudentName = studentName;
		DeptName = deptName;
		this.mailid = mailid;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public long getMailid() {
		return mailid;
	}
	public void setMailid(long mailid) {
		this.mailid = mailid;
	}
}
