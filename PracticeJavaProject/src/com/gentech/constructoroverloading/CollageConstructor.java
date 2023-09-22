package com.gentech.constructoroverloading;
/*
 college name:PDA
 college adress:Gulbarga
 college code :PDA3567

 usn number :55
 pincode code:585101

 */
class college
{
	college(String clgname,String clgadress,String clgcode)
	{
		System.out.println(" college name:"+clgname);
		System.out.println(" college adress:"+clgadress);
		System.out.println(" college code :"+clgcode);
		System.out.println();
	}
	college(int usn,int pincode)
	{
		System.out.println("usn number :"+usn);
		System.out.println(" pincode code:"+pincode);
	}

}

public class CollageConstructor {

	public static void main(String[] args) {

		college o1=new college("PDA","Gulbarga","PDA3567");
		college o2=new college(067,585101);
	}

}
