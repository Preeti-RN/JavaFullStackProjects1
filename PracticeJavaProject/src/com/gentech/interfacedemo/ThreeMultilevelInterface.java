package com.gentech.interfacedemo;

interface school13
{
	void schoolname(String name);
}
interface faculty13 extends school13
{
	void facultyname(String name);
}
interface subject13 extends faculty13
{
	void subname(String sub);
}
class details13 implements subject13
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
public class ThreeMultilevelInterface {

	public static void main(String[] args) {
		details13 o=new details13();
		o.subname("HTML & CSS");
		o.facultyname("sujata");
		o.schoolname("siddharudha school");

	}

}
