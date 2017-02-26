package com.hrm.scripts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {
	
	public static void main(String[] args) {
		ArrayList<String> allText = new ArrayList<String>();
		allText.add("a");
		allText.add("b");
		allText.add("c");
		
		ArrayList<String> clone = new ArrayList<String>(allText);
		Collections.sort(clone);
		
		System.out.println(allText.equals(clone));
		
		
		
	}

}
