package com.gentech.constuctorchaining;
//sum of each digit is:10
class sumdigit
{
	sumdigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("sum of each digit is:"+sum);
	}
}
public class SumOfDigit {

	public static void main(String[] args) {
		
		sumdigit obj=new sumdigit(1234);
	}

}
