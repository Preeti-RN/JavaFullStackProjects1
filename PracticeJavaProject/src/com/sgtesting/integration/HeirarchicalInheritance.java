package com.sgtesting.integration;

//HeirarchicalInheritance
class empl
{
	void employee(String empname,int empid)
	{
		System.out.println("employee name:"+empname);
		System.out.println("emp id:"+empid);
	}
}
class salaray extends empl
{
	void empsalary(int salary,String jobrole)
	{
		System.out.println("salary:"+salary);
		System.out.println("jobrole:"+jobrole);
	}
}
class depatment extends empl
{
	void dept(String deptname)
	{
		System.out.println("department name:"+deptname);
	}
}
public class HeirarchicalInheritance {

	public static void main(String[] args) {
		department o=new department();
		o.dept("HR");
		o.employee("preeti",4);
		
		salary o2=new salary();
		o2.empsalary(2000, "Data engineer");
		o2.employee("Prashant",5);


	}

}
