package com.gentech.dowhilepattern;

/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/

public class OneToFiveDemo {

	public static void main(String[] args) {
		int i=1;
		do {
			int k=1;
			do {
				System.out.print(i+" ");
				k++;
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
