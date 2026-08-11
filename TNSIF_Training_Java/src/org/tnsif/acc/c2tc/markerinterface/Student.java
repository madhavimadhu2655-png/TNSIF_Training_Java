package org.tnsif.acc.c2tc.markerinterface;

public class Student implements Registration {
	private int id;
	private String name;
	private double fees;
	private String course;
	Student(int id,String name,double fees,String course){
		this.id=id;
		this.name=name;
		this.fees=fees;
		this.course=course;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
	
	

}
