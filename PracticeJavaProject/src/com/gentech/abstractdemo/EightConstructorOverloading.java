package com.gentech.abstractdemo;

abstract class student8
{
	String name;
	int id;
	student8(String stname,int id)
	{
		this.name=stname;
		this.id=id;
		System.out.println("parentclass constructor1: name="+stname);
		System.out.println("parentclass constructor1: id="+id);

	}
	student8(int id)
	{
		this.id=id;
		System.out.println("parentclass constructor2: id="+id);
	}
	student8(String stname)
	{
		this.name=stname;
		System.out.println("parentclass constructor3: name="+stname);
	}
}
class college8 extends student8
{
	college8(String name,int id)
	{
		super(name,id);
		System.out.println("childclass1 constructor1 name=" +name);
		System.out.println("childclass1 constructor1 id=" +id);

	}
	college8(int id)
	{
		super(id);
		System.out.println("childclass1 constructor2: id="+id);
	}
	college8(String name)
	{
		super(name);
		System.out.println("childclass1 constructor3: name="+name);
	}
}
class library8 extends college8
{
	library8(String name,int id)
	{
		super(name,id);
		System.out.println("childclass2 constructor1 name=" +name);
		System.out.println("childclass2 constructor1 id=" +id);

	}
	library8(int id)
	{
		super(id);
		System.out.println("childclass2 constructor2: id="+id);
	}
	library8(String name)
	{
		super(name);
		System.out.println("childclass2 constructor3: name="+name);
	}
}


public class EightConstructorOverloading {

	public static void main(String[] args) {
		library8 o1=new library8("Ananad",2003);




	}

}
