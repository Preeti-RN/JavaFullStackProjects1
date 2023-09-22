package com.gentech.dowhile;

public class DoSqSum {

	public static void main(String[] args) {
		int i=20;
		int sum=0;
		int sq;
		do
		{   sq=i*i;
			sum=sum+sq;
			i--;
			
		}while(i>=1);
		System.out.println(sum);
	}

}
