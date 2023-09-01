package com.StudentManagement.Entity;

public class Student {
	private int rollno,age;
	private String name,email,password,semester,branch,course,fathername;
	private String contactno,address;
	public Student(int rollno,  String name, String email, String password, String branch, String semester,
			int age,String address, String fathername, String course,String contactno) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.email = email;
		this.password = password;
		this.semester = semester;
		this.branch = branch;
		this.course = course;
		this.fathername = fathername;
		this.contactno = contactno;
		this.address = address;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
