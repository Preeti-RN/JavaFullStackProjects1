package com.gentech.interfacedemo;

interface school2
{
	String name="Vivekanand";
	String address="karajagi";
	int numofFac=20;
	int numpfstd=30;
	void school();
}
class details2 implements school2
{
	public void school()
	{
		System.out.println("school name:"+name);
		System.out.println("school adress: "+address);
		System.out.println("num of faculty:"+numofFac);
		System.out.println("num of students:"+numpfstd);
	}
}
public class TwoInterfaceMoreThanThreeVariables {

	public static void main(String[] args) {
		details2 o=new details2();
		o.school();

	}

}
