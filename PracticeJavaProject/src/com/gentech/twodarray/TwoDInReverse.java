package com.gentech.twodarray;
/*
dinesh renu ramesh 
mohan  raju pavana 
pavitra sapna preeti
*/ 
public class TwoDInReverse {

	public static void main(String[] args) {
		String x[][]= {{"preeti","sapna","pavitra"},
				       {"pavana"," raju","mohan"},
				       {"ramesh","renu","dinesh"}};
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
	