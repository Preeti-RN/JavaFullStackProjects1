package com.gentech.abstractdemo;
abstract class Adress
{
	static void location(String loc)
	{
		System.out.println("location is:"+loc);
	}
	static void college(String clgname)
	{
		System.out.println("college name:"+clgname);
	}
	static void branch(String branchname)
	{
		System.out.println("branch name:"+branchname);
	}
}

public class StaticMethodAbstract {

	public static void main(String[] args) {
		
		Adress.location("bidar");
		Adress.college("Godutai college");
		Adress.branch("Eletronics");

	}

}
