package com.sgtesting.methoddemo;
class logical
{
	void andlogic(int a,int b,int c)
	{
		boolean d=(a>b)&&(a>c);

		System.out.println(d);


	}
	void notlogic(int num)
	{
		boolean x=!(num%2==0);
		System.out.println(x);

	}
	void orlogic(int age)
	{
		boolean z=age>18||age==18;

		System.out.println("age "+age+" is eligible for voting");


	}

}
public class MethodLogicalOperator {

	public static void main(String[] args) {
		logical o=new logical();
		o.andlogic(10, 5, 4);
		o.notlogic(13);
		o.orlogic(18);

	}

}
