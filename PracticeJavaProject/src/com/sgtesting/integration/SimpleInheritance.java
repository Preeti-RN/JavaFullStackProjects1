package com.sgtesting.integration;
//simple inheritance
class emp1
{
	void employee(String empname,int empid)
	{
		System.out.println("employee name:"+empname);
		System.out.println("emp id:"+empid);
	}
}
class salary1 extends emp1
{
	void empsalary(int salary,String jobrole)
	{
		System.out.println("salary:"+salary);
		System.out.println("jobrole:"+jobrole);
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		salary1 o2=new salary1();
		o2.empsalary(2000, "Data engineer");
		o2.employee("Prashant",5);

	}

}
