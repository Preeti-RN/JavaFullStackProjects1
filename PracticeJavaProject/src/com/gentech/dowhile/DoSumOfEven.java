package com.gentech.dowhile;

public class DoSumOfEven {
	public static void main(String[] args)
	{
		int i=250;
		int sum=0;
		do
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}while(i<=500);
		System.out.println(sum);
	}

}
