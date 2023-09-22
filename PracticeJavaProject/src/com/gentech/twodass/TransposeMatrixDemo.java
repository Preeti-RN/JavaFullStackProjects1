package com.gentech.twodass;
/*
1 4 7 
2 5 8 
3 6 9 

 */
public class TransposeMatrixDemo {
	private static void transpose(int[][] a, int[][] b) {
		
		
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		
		int i,j;
		for( i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				
				System.out.print(a[j][i]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
	}

	

}
