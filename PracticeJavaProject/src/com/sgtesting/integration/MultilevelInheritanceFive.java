package com.sgtesting.integration;
class employee4
{
	employee4(String empname,int empid)
	{
		System.out.println("employee name:"+empname);
		System.out.println("emp id:"+empid);
	}
}
class salary4 extends employee4
{
	salary4(String en,int eid)
	{
		super(en,eid);
	}
}
class department4 extends salary4
{
	department4(String ename,int emid)
	{
		super(ename,emid);
	}
}
public class MultilevelInheritanceFive {

	public static void main(String[] args) {
		department4 o=new department4("Anand",7);
		salary4 o1=new salary4("sandeep",8);
		employee4 o2=new employee4("vaish",9);
		

	}

}
