package com.gentech.dowhile;

public class DoFactorial {

	public static void main(String[] args) {
		int i=1;
		int fact=1;
		do
		{
			fact=fact*i;
			i++;
		}while(i<=4);
		System.out.println(fact);

	}

}
