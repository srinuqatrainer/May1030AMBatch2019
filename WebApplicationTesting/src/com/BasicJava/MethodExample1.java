package com.BasicJava;

public class MethodExample1 {

	public void test1()
	{
		System.out.println(" Test1 Method executed successfully ");
	}
		
	public static void main(String []args)
	{
	    // Object creation for a Class 
		// m is converted as an object for the class MethodExample1
		
		MethodExample1 m  = new MethodExample1();
		
		// a Class can be interacted with its Object only
		m.test2(); // calling the methods
		m.test1();
		
	}
	
	public void test2()
	{
		System.out.println(" Test2 Method executed successfully ");
	}

}
