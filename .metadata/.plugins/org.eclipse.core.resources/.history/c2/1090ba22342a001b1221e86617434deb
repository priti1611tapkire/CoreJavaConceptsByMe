package com.treeset;

public class Employee implements Comparable<Employee> {
	private int emid; 
	private String emname; 
	private double salary;
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEmname() {
		return emname;
	}
	public void setEmname(String emname) {
		this.emname = emname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee ee) {
		// TODO Auto-generated method stub
		//return this.getEmid()-ee.getEmid();
		
		return (int)(this.getSalary()-ee.getSalary());
		//return this.getEmname().compareTo(ee.getEmname());
	}
}
