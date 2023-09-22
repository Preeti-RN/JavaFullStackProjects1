package com.gentech.dowhilepattern;

/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/
public class FifteenToOneDo {

	public static void main(String[] args) {
		int num=15;
		int i=5;
		do {
			int k=1;
			do {
				System.out.print(num+" ");
				k++;
				num--;
			}while(k<=i);
			i--;
			System.out.println();
		}while(i>=1);
		

	}

}
