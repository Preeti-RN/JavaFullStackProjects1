package com.gentech.parameterizedconstructor;
/*
 first namestud:preeti
std last name:Talle
std mail id :preeti@gmail.com
std id:10
std mobile number:5353667
+++++++
library id:3
library name:janata
noof books:10
college name:PDA
+++++++++++
sports id:11
sports name:TT
no of players:12
coach name:somanath

 */

class Student
{
	
	Student(String studfirstname,String studlastname,String studemail,int studid,long studmobileno)
	{
		
	
	System.out.println("first namestud:"+studfirstname);
	System.out.println("std last name:"+studlastname);
	System.out.println("std mail id :"+studemail);
	System.out.println("std id:"+studid);
	System.out.println("std mobile number:"+studmobileno);
}
}
class Library
{
	
	Library(int libid,String libname,int noofbooks,String clgname)
	{
		
		System.out.println("library id:"+libid);
		System.out.println("library name:"+libname);
		System.out.println("noof books:"+noofbooks);
		System.out.println("college name:"+clgname);
	}
}
class Sports
{
	
	Sports(int sportid,String sportname,int noofplayers,String coachname)
	{
		
		System.out.println("sports id:"+sportid);
		System.out.println("sports name:"+sportname);
		System.out.println(("no of players:"+noofplayers));
		System.out.println("coach name:"+coachname);
	}
}
public class StudentData {

	public static void main(String[] args) {
      Student preeti=new Student("preeti","Talle","preeti@gmail.com",10,5353667);
		
		System.out.println("+++++++");
		Library lib=new Library(3,"janata",10,"PDA");
		
		System.out.println("+++++++++++");
		Sports sport=new Sports(11,"TT",12,"somanath");	

	}

}
