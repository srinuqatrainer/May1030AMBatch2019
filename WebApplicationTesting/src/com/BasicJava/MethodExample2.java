package com.BasicJava;

public class MethodExample2 {
	
	
	public void add()
	{
		// a and b are local variables 
		// local variables can be accessed with the same method only
		
		int a=10;
		int b=5;
		int c;
		
		c=a+b;
		System.out.println("The value of c is : "+c);
	}

	public static void main(String[] args) {
		
		MethodExample2 m = new MethodExample2();
		m.add();
		
		int a=20;
		int b=10;
		int c;
		c=a+b;
		
		System.out.println(" The value of C is :"+c);
	}

}
