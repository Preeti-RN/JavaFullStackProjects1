package com.gentech.twodass;

/*
9 18 
27 36 
 */
public class SubtractionOfMatrix {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40}};
		int b[][]= {{1,2},{3,4}};
		if((a.length==b.length)&&(a[0].length==b[0].length))
		{
			//int z[][]=new int[a[0].length][b[0].length];
			
			for(int i=0;i<a.length;i++)
			{
				for(int k=0;k<b[i].length;k++)
				{
					int res=a[i][k]-b[i][k];
					System.out.print(res+" ");
					
				}
				System.out.println();
			}
		}
	}

}
