package com.training.collections;

public class Employee {
	private String name;
	private int id;
	private String designation;
	private String doj;
	private String street;
	private int salary;

	public Employee(String name, String doj, int id, String designation, String street, int salary) {
		this.name = name;
		this.doj = doj;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		this.street = street;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String toString() {
		return String.format("%s\t%d\t%s\t%s\t%s\t%d", name, id, designation, doj, street, salary);
	}

}
