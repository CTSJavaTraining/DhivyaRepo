package com.training.collections;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
/**
 * 
 * @author 542320
 *
 */
public class Arraylist1 {
	
	
	
	static Logger logger=Logger.getLogger(Arraylist1.class);
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("dhivya");
		al.add("priya");
		al.add("sindhu");
		al.add("raj");
		al.add("ram");
		al.add("rita");
		
		logger.info("MAven test loggeer");
		System.out.println("elements in the list is: " + al);
		al.remove(0);
		al.remove("priya");
		System.out.println("after removal:" + al);

		al.add(2, "priya");
		System.out.println("with index 2 and string:" + al);

		al.set(3, "king");
		System.out.println("updation: " + al);

		int position = al.indexOf("king");
		System.out.println(position);

		String str = al.get(0);
		System.out.println(str);

		// al.removeAll(al);
		// al.clear();
		System.out.println(al);

		ArrayList<String> al1 = new ArrayList<String>(al.subList(0, 3));
		System.out.println(al1);

		List<String> li = al.subList(0, 2);
		System.out.println(li);

		ArrayList<String> al2 = new ArrayList<String>();
		for (String temp : al) {
			al2.add(al1.contains(temp) ? "yes " : "no");
		}
		System.out.println(al2);

	}

}
