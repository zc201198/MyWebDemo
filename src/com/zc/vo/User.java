package com.zc.vo;

public class User {
	  /*`id` int(8) NOT NULL AUTO_INCREMENT,
	  `name` varchar(16) DEFAULT NULL,
	  `password` varchar(32) DEFAULT NULL,
	  `sex` varchar(8) DEFAULT NULL,
	  `age` int(8) DEFAULT NULL,
	  `record` varchar(16) DEFAULT NULL,
	  `telephone` varchar(32) DEFAULT NULL,
	  `email` varchar(64) DEFAULT NULL,
	  PRIMARY KEY (`id`)*/
	private String id;
	private String name;
	private String password;
	private String sex;
	private int age;
	private String record;
	private String telephone;
	private String email;
	
	public User() {
	}
	
	public User(String id, String name, String password, String sex, int age, String record, String telephone,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.record = record;
		this.telephone = telephone;
		this.email = email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ ", record=" + record + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
}
