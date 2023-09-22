package com.gentech.noargs;
/*
emp no:2
emp first name:ram
emp last name:namagond
department name:marketing
department name:3
adress:Bengalore
insurence id:15
instype:healthinsurence
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
public class EmpDept {

	public static void main(String[] args) {
		
        Emp preet=new Emp();
		
		Dept ece=new Dept();
		
		insurence insure=new insurence();
		
	}

}
