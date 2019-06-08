package org.lakhan.com.model;

public class Circle {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Circle [id=" + id + ", name=" + name + "]";
	}
	public void Circle(int id,String name){
		setId(id);
		setName(name);
		
	}

}
