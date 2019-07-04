package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
//ArrayList is a dynamic data Structure which is capable of saving any dataType value and 
// can save any amount of data (the size need not be declared)
		
		List<Object> a = new ArrayList<>();
		
		a.add("Selenium");
		a.add("LoadRunner");
		a.add(100);
		a.add(10.1234);

		for(int k=0;k<a.size();k++)
		{
			System.out.println(a.get(k));
		}
		
		System.out.println(" ******************* ");
		
		for(Object var:a)
		{
			System.out.println(var);
		}
	}

}
