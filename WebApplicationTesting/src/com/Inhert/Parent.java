package com.Inhert;

public class Parent extends GrandParent{
	
	public void test2()
	{
		System.out.println(" Method Test2 executed Succesfully ");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.test2();
		p.test1();
		
		

	}

}
