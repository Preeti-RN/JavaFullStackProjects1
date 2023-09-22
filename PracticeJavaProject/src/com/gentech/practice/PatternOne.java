package com.gentech.practice;

public class PatternOne {

	public static void main(String[] args) {
		int n1=10,n2=20,maximum;
		maximum=max(n1,n2);
		System.out.println("maximum is:"+maximum);
		System.out.println("maximum is:"+max(22,55));
		}
	public static int max(int num1,int num2)
	{
		if(num1>num2)
			return num1;
		else
		return num2;

	}

}
