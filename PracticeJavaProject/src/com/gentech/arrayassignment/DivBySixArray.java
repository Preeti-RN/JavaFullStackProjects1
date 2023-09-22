package com.gentech.arrayassignment;
/*
countof num 17
150
156
162
168
174
180
186
192
198
*/

public class DivBySixArray {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
			
		}
		System.out.println("countof num "+count);
		int q[]=new int[count];
		int z=0;
		for(int c=100;c<=200;c++)
		{
			if(c%6==0)
			{
				q[z]=c;
				z++;
			}
		}
		for(int x=q.length/2;x<=q.length-1;x++)
		{
			System.out.println(q[x]);
		}

	}

}
