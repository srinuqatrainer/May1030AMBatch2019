package com.BasicJava;

public class MethodExample3 {

	int a=30;
	int b=10;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println(" The addition of a and b is :"+c);
	}
	
	public void subtraction()
	{
		c=a-b;
		System.out.println(" The subtraction of a and b is :"+c);
	}
	
	public void multiplication()
	{
		c=a*b;
		System.out.println(" The multiplication of a and b is :"+c);
	}
	
	public void division()
	{
		c=a/b;
		System.out.println(" The division of a and b is :"+c);
	}
	public static void main(String[] args) {
		
		MethodExample3 hello = new MethodExample3();
		hello.add();
		hello.subtraction();
		hello.multiplication();
		hello.division();

	}

	
}
