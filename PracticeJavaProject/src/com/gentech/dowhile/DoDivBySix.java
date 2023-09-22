package com.gentech.dowhile;

public class DoDivBySix {

	public static void main(String[] args) {
		int i=150;
		do
		{
			if(i%6==0)
			{
				System.out.println(i);
			}
			i--;
		}while(i>=50);
	}

}
