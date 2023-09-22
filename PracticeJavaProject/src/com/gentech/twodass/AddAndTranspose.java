package com.gentech.twodass;
/*
11 22 
33 44 
transpose
11 33 
22 44 
 */
public class AddAndTranspose {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40}};
		int b[][]= {{1,2},{3,4}};
		if((a.length==b.length)&&(a[0].length==b[0].length))
		{
			int z[][]=new int[a[0].length][b[0].length];
			int i,k;
			for(i=0;i<a.length;i++)
			{
				for(k=0;k<a[i].length;k++)
				
					z[i][k]=a[i][k]+b[i][k];	
				
			}
			for(i=0;i<a.length;i++)
			{
				for(k=0;k<a[i].length;k++) {
					System.out.print(z[k][i]+" ");
				}
				System.out.println();
			}
			
		}
	}

}
