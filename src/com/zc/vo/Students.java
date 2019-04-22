package com.zc.vo;

public class Students {
	  /*`studentid` varchar(32) NOT NULL,
	  `name` varchar(16) DEFAULT NULL,
	  `banji` varchar(16) DEFAULT NULL,
	  `sex` varchar(8) DEFAULT NULL,
	  `professional` varchar(32) DEFAULT NULL,
	  `dept` varchar(32) DEFAULT NULL,
	  `age` int(8) DEFAULT NULL,
	  `telephone` varchar(32) DEFAULT NULL,*/
	private String studentid;
	private String name;
	private String banji;
	private String sex;
	private String professional;
	private String dept;
	private int age;
	private String telephone;
	
	public Students() {
	}
	
	public Students(String studentid, String name, String banji, String sex, String professional, String dept, int age,
			String telephone) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.banji = banji;
		this.sex = sex;
		this.professional = professional;
		this.dept = dept;
		this.age = age;
		this.telephone = telephone;
	}
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", name=" + name + ", banji=" + banji + ", sex=" + sex
				+ ", professional=" + professional + ", dept=" + dept + ", age=" + age + ", telephone=" + telephone
				+ "]";
	}
	
}
