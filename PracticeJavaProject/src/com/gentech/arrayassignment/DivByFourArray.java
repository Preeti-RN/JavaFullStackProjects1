package com.gentech.arrayassignment;
/*
count of num 13
52
56
60
64
68
72
76
80
84
88
92
96
100
*/

public class DivByFourArray {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count=count+1;
			}
		}
		System.out.println("count of num "+count);
		int q[]=new int[count];
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				q[k]=j;
				k++;
			}
		}
		for(int z=q.length-1;z>=0;z--)
		{
			System.out.println(q[z]);
		}
	}

}
