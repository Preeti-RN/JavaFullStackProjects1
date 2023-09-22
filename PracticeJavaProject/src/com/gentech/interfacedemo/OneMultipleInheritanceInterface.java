package com.gentech.interfacedemo;

interface school
{
	void schoolname(String name);
}
interface faculty
{
	void facultyname(String name);
}
interface subject
{
	void subname(String sub);
}
interface student
{
	void studentname(String name);
}
class details implements school,faculty,subject,student
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
	public void studentname(String name)
	{
		System.out.println("student name:"+name);
	}
}
public class OneMultipleInheritanceInterface {

	public static void main(String[] args) {
		details o=new details();
		o.schoolname("sarvajna");
		o.facultyname("Hipparagi sir");
		o.subname("java");
		o.studentname("Preeti namagond");
	
	}
	
}
