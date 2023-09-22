package com.gentech.whiledowhile;

public class NewFactOfNum {

	public static void main(String[] args) {
		int i=1;
		int fact=1;
		int num=Integer.parseInt(args[0]);
		while(i<=num)
		{
			fact=fact*i;
		i++;
			
		}
		System.out.println(fact);
		

	}

}
