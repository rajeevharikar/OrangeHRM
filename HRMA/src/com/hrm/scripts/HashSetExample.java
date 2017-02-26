package com.hrm.scripts;

import java.util.ArrayList;
import java.util.HashSet;

import generics.Utility;

public class HashSetExample {
	
	public static void main(String[] args) {
		ArrayList<String> allText = new ArrayList<String>();
		allText.add("a");
		allText.add("b");
		allText.add("b");
		
		boolean v = Utility.ArrayListBoxHasDuplicate(allText);
		
	
//		HashSet<String> clone= new HashSet<String>(allText);
//		System.out.println(allText.size());
//		System.out.println(clone.size());
		
//		HashSet<String> clone2= new HashSet<String>();
//		for(String s:allText)
//		{
//			boolean v = clone2.add(s);
		System.out.println(v);
			
		
    	}
	}

