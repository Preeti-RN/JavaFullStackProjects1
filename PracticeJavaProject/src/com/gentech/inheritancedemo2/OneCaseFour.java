package com.gentech.inheritancedemo2;
class collage
{
	void showcollage(String collagename)
	{
		System.out.println("collage name is:"+collagename);
	}
}
class institute extends collage
{
	institute(String institutename)
	{
		super.showcollage(institutename);
	}

	void showcollage(String collagename)
	{
		System.out.println("institute name in sub class:"+collagename);
	}
}
class address extends institute
{
	address(String clg)
	{
		super(clg);
		super.showcollage(clg);	

	}
	void showcollage(String Area)
	{
		System.out.println("address of collage:"+Area);
	}
}
public class OneCaseFour {

	public static void main(String[] args) {
		address obj=new address("Poojya Doddappa Appa collage");
		obj.showcollage("kalaburagi");

	}

}
