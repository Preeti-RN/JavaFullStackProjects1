package com.gentech.interfacedemo;
interface school5
{
	void schoolname(String name);
}
interface faculty5 extends school5
{
	void facultyname(String name);
}
interface subject5 extends school5
{
	void subname(String sub);
}

class details5 implements subject5
{
	public void schoolname(String name)
	{
		System.out.println("school name:"+name);
	}
	public void facultyname(String name)
	{
		System.out.println("faculty name:"+name);
	}
	public void subname(String sub)
	{
		System.out.println("subject name:"+sub);
	}
	
}
class info implements faculty5
{
	public void facultyname(String name)
	{
		System.out.println("faculty name in second class:"+name);
	}
	public void schoolname(String name)
	{
		System.out.println("school name in second class:"+name);
	}
}
public class FiveHeirarchicalInheritance {

	public static void main(String[] args) {
		details5 o=new details5();
		o.schoolname("Shanti Niketan");
		o.facultyname("Akash sir");
		o.subname("maths");
		
		info o2=new info();
		o2.schoolname("shanti niketan");
		o2.facultyname("Vijayendr sir");
		

	}

}
