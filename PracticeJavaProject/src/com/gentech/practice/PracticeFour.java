package com.gentech.practice;

/*
 
1 
3 2 
6 5 4 
10 9 8 7 
15 14 13 12 11 
 */
public class PracticeFour {

	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=5;i++)
		{   
			n=n+i;
			for(int j=n;j>n-i;j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();	
				
		}

	}

}
