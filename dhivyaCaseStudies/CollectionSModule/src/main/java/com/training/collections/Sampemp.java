package com.training.collections;

import java.util.Arrays;

public class Sampemp implements Comparable<Sampemp> {
	private int id;
	private int sal;
	private String name;
	private String desig;

	public Sampemp(int id, String name, int sal, String desig) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.desig = desig;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int compareTo(Sampemp samp) {
		return (this.id - samp.id);

	}

	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", desig=" + this.desig + ", sal=" + this.sal + "]";
	}
	
	public static void main(String[] args) {
		Sampemp[] empArr = new Sampemp[4];
		empArr[0] = new Sampemp(10, "Mikey", 10000, "manager");
		empArr[1] = new Sampemp(9, "Arun", 20000, "contr");
		empArr[2] = new Sampemp(30, "Lisa", 5000, "xy");
		empArr[3] = new Sampemp(4, "Pankaj", 50000, "ads");

		// sorting employees array using Comparable interface implementation
		// Arrays.sort(empArr);
		// System.out.println("Default Sorting of Employees
		// list:\n"+Arrays.toString(empArr));
	}

}
