package com.gentech.dowhile;

public class DoDivByTen {

	public static void main(String[] args) {
		int i=250;
		int count=0;
		do
		{
			if(i%10==0)
			{
				count=count+1;
			}
			i++;
		}while(i<=500);
		System.out.println(count);
	}

}
