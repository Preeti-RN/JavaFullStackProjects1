package com.gentech.constuctorchaining;
/*
reverse number is:54321

 */
class Reverse
{
	Reverse(int num)
	{ 
		
		int Reverse=0;
		while(num>0)
		{
			int lastdigit=num%10;
			Reverse=Reverse*10+lastdigit;
			num=num/10;
		}
		System.out.println("reverse number is:"+Reverse);
		
	}
}
public class ReverseTheNUm {

	public static void main(String[] args) {
		
     Reverse obj=new Reverse(12345);
	}

}
