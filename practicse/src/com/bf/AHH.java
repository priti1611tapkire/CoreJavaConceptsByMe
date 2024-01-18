package com.bf;

public class AHH {
private int id;
private String name;
private double salary;

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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
/*@Override
public String toString() {
	return "AHH [id=" + id + ", name=" + name + ", salary=" + salary + "]";*/

public static void main(String[] args) {
	AHH a=new AHH();
	a.setId(1);
	a.setName("p");
	a.setSalary(20000);
	System.out.println(a.getId());
	System.out.println(a.getName());
	System.out.println(a.getSalary());
}
}
