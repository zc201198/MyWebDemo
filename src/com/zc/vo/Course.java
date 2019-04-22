package com.zc.vo;

public class Course {
	  /*`id` varchar(16) NOT NULL,
	  `name` varchar(16) DEFAULT NULL,
	  `teacher` varchar(16) DEFAULT NULL,*/
	private String id;
	private String name;
	private String teacher;
	
	public Course() {
	}
	
	public Course(String id, String name, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
	
}
