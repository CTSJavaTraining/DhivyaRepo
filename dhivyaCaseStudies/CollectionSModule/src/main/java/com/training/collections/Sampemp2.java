package com.training.collections;

public class Sampemp2 {
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
