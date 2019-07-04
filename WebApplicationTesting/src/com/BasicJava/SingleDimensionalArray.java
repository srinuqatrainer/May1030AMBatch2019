package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// dataType ArrayName[] = new dataType[size]
 		int a[] = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//a[3] = 40;
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		
		//for(int k=0;k<3;k++)
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		// Array can save similer dataType Value
		// Array size is constant/static 
		// if an Array Index is not assigned with a value then the default value is 0
		// Array cannot be save with different dataType values
		// if an array is saved with value more then the size declared then it throws an
		//    exception as ArrayOutOfBound exception
	}

}
