package com.sgtesting.integration;
class emp
{
	void employee(String empname,int empid)
	{
		System.out.println("employee name:"+empname);
		System.out.println("emp id:"+empid);
	}
}
class salary extends emp
{
	void empsalary(int salary,String jobrole)
	{
		System.out.println("salary:"+salary);
		System.out.println("jobrole:"+jobrole);
	}
}
class department extends salary
{
	void dept(String deptname)
	{
		System.out.println("department name:"+deptname);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		department o=new department();
		o.dept("HR");
		o.empsalary(2000, "Data engineer");
		o.employee("preeti",4);
	}
}
