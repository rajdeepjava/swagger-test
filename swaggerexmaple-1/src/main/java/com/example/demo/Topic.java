package com.example.demo;

public class Topic {

	private String id;
	private String name;
	private String type;
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topic(String id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}
	
}
