package com.zc.vo;

public class Score {
	  /*`id` varchar(32) NOT NULL,
	  `name` varchar(16) NOT NULL,
	  `results` int(8) DEFAULT NULL,*/
	private String id;
	private String name;
	private int results;
	
	public Score() {
	}
	
	public Score(String id, String name, int results) {
		super();
		this.id = id;
		this.name = name;
		this.results = results;
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
	public int getResults() {
		return results;
	}
	public void setResults(int results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", name=" + name + ", results=" + results + "]";
	}
	
}
