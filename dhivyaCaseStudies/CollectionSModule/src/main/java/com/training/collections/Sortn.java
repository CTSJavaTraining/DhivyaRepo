package com.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortn {

	public static void main(String[] args) {
		int n[] = { 2, 7, 3, 1, 4, 6, 5 };
		Arrays.sort(n);
		System.out.println((Arrays.toString(n)));

		String s[] = { "A", "D", "C", "B", "E" };
		Arrays.sort(s);
		System.out.println((Arrays.toString(s)));

		List<String> li = new ArrayList<String>();
		li.add("a");
		li.add("c");
		li.add("b");
		Collections.sort(li);
		// System.out.println(li);
		for (String str : li)
			System.out.println(" " + str);
	}
}
