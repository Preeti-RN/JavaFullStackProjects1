package com.gentech.abstractdemo;
abstract class library
{
	
	static 
	{
		
		System.out.println("book name is oops");
	}
}
class college extends library
{
	
}

public class StaticAbstract {

	public static void main(String[] args) {
		college o=new college();

	}
}
