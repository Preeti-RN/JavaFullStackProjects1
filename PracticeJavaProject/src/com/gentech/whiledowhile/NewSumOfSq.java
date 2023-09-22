package com.gentech.whiledowhile;

public class NewSumOfSq {

	public static void main(String[] args) {
		int i=20;
		int sqr;
		int sum=0;
		while(i>=1)
		{
			sqr=i*i;
			sum=sum+sqr;
			i--;
		}
	
		System.out.println(sum);
	}

}
