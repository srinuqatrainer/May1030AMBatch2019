package com.BasicJava;

public class ExceptionHanding {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		int c;
		
		/*c=a/b;
		
		System.out.println(" the value of c is :"+c);*/
		
		try
		{
			c=a/b;
			System.out.println(" The value is c is :"+c);
		}
		catch(Exception p)
		{
			System.out.println(" cannot perform the operation ");
			System.out.println(p);
		}

	}

}
