package com.gentech.whiledowhile;

public class NewSumofEven {

	public static void main(String[] args) {
		int i=250;
		int sum=0;
		while(i<=500)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			i++;
		}
		System.out.println(sum);
	}

}
