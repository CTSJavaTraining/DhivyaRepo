package com.training.collections;


import java.util.LinkedHashMap;
import java.util.Scanner;

public class LetterOccurance {
	
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i),1);
			}
		}
		System.out.println(hm);
		
	}

}
