package com.BasicJava;

public class StringCmp {

	public static void main(String[] args) {
		
		String a= "LiveTech";
		String b= "LiveTech";

		if(a.equals(b))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Stings are Not Equal ");
		}
		
		System.out.println(" ************************** ");
		
		
		String c="LiveTech";
		String d="Livetech";
		
		if(c.equalsIgnoreCase(d))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Stings are Not Equal ");
		}
		
		System.out.println(" ####################### ");
		
		String e="LiveTech";
		String f="Live";
		
		if(e.contains(f))
		{
			System.out.println(" String existing");
		}
		else
		{
			System.out.println(" String not found");
		}
		
		System.out.println(" ------------------------- ");
		
		String g="Hello";
		String h=" Hello";
		
		if(g.equalsIgnoreCase(h))
		{
			System.out.println("Both Strings are Equal");
		}
		else
		{
			System.out.println("Both Stings are not equal");
		}
		
		System.out.println(" ========================= ");
		
		String i="Srini";
		int text_length=i.length();
		
		System.out.println(" The length of the String is :"+text_length);
		
		String j="LiveTech";
		String k="Testing";
		
		if(j.length()>k.length())
		{
			System.out.println(" j is greater than k");
		}
		else
		{
			System.out.println(" k is greater than j ");
		}
	}

}
