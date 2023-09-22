package com.gentech.arrayassignment;
/*
count is 10
8
16
24
32
40
*/

public class EightTableArray {

	public static void main(String[] args) {
		int count=0;
		for(int i=8;i<=80;i++)
		{
			if(i%8==0)
			{
				count=count+1;
			}
		}
		System.out.println("count is "+count);
		int q[]=new int[count];
		int k=0;
		for(int j=8;j<=80;j++)
		{
			if(j%8==0)
			{
				q[k]=j;
				k++;
			}
		}
		for(int z=0;z<q.length/2;z++)
		{
			System.out.println(q[z]);
		}
	}

}
