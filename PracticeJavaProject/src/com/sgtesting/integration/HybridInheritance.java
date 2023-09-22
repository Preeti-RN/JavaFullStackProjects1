package com.sgtesting.integration;
//hibrid inheritance
class emp2
{
	void employee(String empname,int empid)
	{
		System.out.println("employee name:"+empname);
		System.out.println("emp id:"+empid);
	}
}
class salary2 extends emp2
{
	void empsalary(int salary,String jobrole)
	{
		System.out.println("salary:"+salary);
		System.out.println("jobrole:"+jobrole);
	}
}
class depatment2 extends salary2
{
	void dept(String deptname)
	{
		System.out.println("department name:"+deptname);
	}
}
class company extends emp2
{
	void comp(String companyname)
	{
		System.out.println("company name:"+companyname);
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		depatment2 o=new depatment2();
		o.dept("HR");
		o.empsalary(2000, "Data engineer");
		o.employee("preeti",4);
		
		company o1=new company();
		o1.comp("TCS");
		o1.employee("sapan",7);

	}

}
