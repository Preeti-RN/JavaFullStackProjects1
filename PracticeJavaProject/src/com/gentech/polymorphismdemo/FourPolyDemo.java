package com.gentech.polymorphismdemo;
abstract class sameword
{
	abstract void watch();
}
class nounwatch extends sameword
{
	void watch()
	{
		System.out.println("Here watch is a noun like:");
		System.out.println("she is wearing watch");
		System.out.println();
	}
}

class verbwatch extends sameword
{
	void watch()
	{
		System.out.println("Here watch is a verb like:");
		System.out.println("I am watching your actions ");
	}
}
public class FourPolyDemo {

	public static void main(String[] args) {
		sameword s=null;
		
		nounwatch n=new nounwatch();
		verbwatch v=new verbwatch();
		
		s=n;
		s.watch();
		
		s=v;
		s.watch();

	}

}
