package com.gentech.dowhilepattern;
/*
1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225
*/
public class SquareDo {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		do {
			int k=1;
			do {
				System.out.print(num*num+" ");
				k++;
				num++;
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
