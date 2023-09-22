package com.gentech.abstractdemo;
abstract class department
{
	String deptname;
	department()
	{
	    deptname="Civil";
		System.out.println("dept name is :"+ deptname);
	}
}
class faculty extends department
{
	
}
public class NoArgsConstructorAbstract {

	public static void main(String[] args) {
		faculty o=new faculty();
		
	}

}
