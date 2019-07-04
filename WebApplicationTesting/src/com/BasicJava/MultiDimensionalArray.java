package com.BasicJava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		String a[][] = new String[2][2];
		
		a[0][0] = "LiveTech";
		a[0][1] = "Testing";
		
		a[1][0] = "Selenium";
		a[1][1] = "Srini";
		
		/*
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		*/
		
		for(int i=0;i<2;i++) // will goto every Row
		{
			for(int k=0;k<2;k++) // will goto every Row of all the Columns
			{
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
	}

}
