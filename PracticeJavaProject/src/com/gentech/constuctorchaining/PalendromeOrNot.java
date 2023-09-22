package com.gentech.constuctorchaining;
/*
 reverse number is:2332
2332is palendrome
 */
class palendrome
{
	palendrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("reverse number is:"+rev);
		
		if(rev==temp)
		{
			System.out.println(temp+"is palendrome");
		}
		else 
		{
			System.out.println(temp+"is not a palendrome");
		}
	}
	
}
public class PalendromeOrNot {

	public static void main(String[] args) {
		palendrome obj=new palendrome(2332);	

	}

}
