package com.gentech.constuctorchaining;
//digits count is:5
class Number
{
	Number(int num)
	{
		int count=0;
		while(num>0)
		{
			count=count+1;
			num=num/10;
		}
		System.out.println("digits count is:"+count);
	}
}
public class NumberOfDigitInNum {

	public static void main(String[] args) {
		Number obj=new Number(15478);

	}

}
