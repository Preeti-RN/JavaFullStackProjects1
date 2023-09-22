package com.gentech.classes;
/*
Preeti
Namagond
preeti@gmail.com
1
+++++++
Marketing
10
banglore
+++++++++++
12
normal


 */
class Emp
{
	int empno;
	String empfirstname;
	String emplastname;
	String empemail;
	Emp()
	{
		empno=2;
		empfirstname="ram";
		emplastname="namagond";
		System.out.println("emp no:"+empno);
		System.out.println("emp first name:"+empfirstname);
		System.out.println("emp last name:"+emplastname);
	}
}
class Dept
{
	String deptname;
	int deptno;
	String address;
	Dept()
	{
		deptname="marketing";
		deptno=3;
		address="Bengalore";
		System.out.println("department name:"+deptname);
		System.out.println("department name:"+deptno);
		System.out.println("adress:"+address);
	}
}
class insurence
{
	int insid;
	String instype;
	insurence()
	{
		insid=15;
		instype="healthinsurence";
		System.out.println("insurence id:"+insid);
		System.out.println("instype:"+instype);
	}
}
public class ClassEmp {

	public static void main(String[] args) {
		Emp preet=new Emp();
		
		Dept ece=new Dept();
		
		insurence insure=new insurence();
		
	}

}
