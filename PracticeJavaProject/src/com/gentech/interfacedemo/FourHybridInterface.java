package com.gentech.interfacedemo;
interface school4
{
	void schoolname(String name);
}
interface faculty4 extends school4
{
	void facultyname(String name);
}
interface subject4 extends faculty4
{
	void subname(String sub);
}
interface address extends school4
{
	void addressofschool(String ads);
}

class details4 implements subject4
{
	
	public void subname(String sub)
	{
		System.out.println("subject name:"+sub);
	}
	public void facultyname(String name)
	{
		System.out.println("faculty name:"+name);
	}
	public void schoolname(String name)
	{
		System.out.println("school name:"+name);
	}
}
class location implements address
{
	public void addressofschool(String ads)
	{
		System.out.println("address of school in second class:"+ads);
	}
	public void schoolname(String name)
	{
		System.out.println("school name in second class:"+name);
	}
}
public class FourHybridInterface {

	public static void main(String[] args) {
		details4 o=new details4();
		o.subname("python");
		o.facultyname("chetan sir");
		o.schoolname("Sanket school");
		
		location o2=new location();
		o2.schoolname("vidya bharati");
		o2.addressofschool("Karajagi");
		

	}

}
