package com.BasicJava;

public class ObjectArrayExample {

	public static void main(String[] args) {
		
		// Object array is capable of storing/saving different dataType values
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] =" Srini ";
		a[2] = 12.345;
		//a[3] = 12;
		
		/*for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}*/
		
		for(Object var:a)
		{
			System.out.println(var);
		}
		

	}

}
