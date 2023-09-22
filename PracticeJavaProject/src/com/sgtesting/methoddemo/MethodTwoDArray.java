package com.sgtesting.methoddemo;
class reverse
{
	void Twod(char x[][])
	{
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
	}
	}
	
}
public class MethodTwoDArray {

	public static void main(String[] args) {
		char a[][]= {{'a','b','c'},
		            {'i','d','e'}};
		reverse o= new reverse();
		o.Twod(a);

	}

}
