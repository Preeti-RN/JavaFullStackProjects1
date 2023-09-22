package com.gentech.inheritancedemo2;
class college5
{
	String clgname;
    void show()
	{
    	System.out.println("college name in super class:"+clgname);
		
	}
}
class institute5 extends college5
{
	institute5(String instname)
	{
		super.clgname=instname;
	}
	String clgname;
	void display()
	{
		System.out.println("institute name in sub class:"+clgname);
	}
}
class cityname5 extends institute5
{
	cityname5(String name)
	{
		super(name);
		super.clgname=name;
	}
	
	void display1(String name)
	{
		System.out.println("city name of the college:"+name);
	}
}

public class CaseFive {

	public static void main(String[] args) {
		cityname5 o=new cityname5("PDA");
		o.clgname="Visheshwarya";
		o.show();
		o.display();
		o.display1("Kalaburagi");
	}

}
