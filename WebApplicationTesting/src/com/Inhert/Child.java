package com.Inhert;

public class Child extends Parent {

	public void test3()
	{
		System.out.println(" Method Test3 executed Successfully ");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.test3();
		
		c.test2();
		
		c.test1();
	}

}
