package com.BasicJava;

public class NestedIfExample {

	public static void main(String[] args) {
		
		int a=50;
		int b=60;
		
		if(a == 40)
		{
			if(b == 30)
			{
				System.out.println(" a=50 and b=30");
			}
			else
			{
				System.out.println(" Only a variable condition is true - a=50");
			}
		}
		else
		{
			System.out.println(" condition failed at a variable");
		}

	}

}
