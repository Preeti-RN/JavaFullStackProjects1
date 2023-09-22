package com.gentech.dowhile;

public class DoCube {

	public static void main(String[] args) {
		int i=1;
		int cube;
		do
		{   
			cube=i*i*i;
			System.out.println(cube);
			i++;
		}while(i<=10);
	}

}
