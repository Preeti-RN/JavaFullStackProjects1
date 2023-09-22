package com.gentech.arrayassignment;
/*
count of even11
80
78
76
74
72
70
68
66
64
62
60
*/
public class SixtyToEightyArray {

	public static void main(String[] args) {
		int count=0;
		for(int i=60;i<=80;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		System.out.println("count of even"+count);
		int q[]=new int[count];
		int z=0;
		for(int k=60;k<=80;k++)
		{
			if(k%2==0)
			{
				q[z]=k;
				z++;
			}
		}
		for(int s=q.length-1;s>=0;s--)
		{
			System.out.println(q[s]);
		}
		
	}

}
