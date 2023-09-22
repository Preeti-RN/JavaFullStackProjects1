package com.gentech.twodarray;
/*
  a
  p
  x
 */
public class FirstColumnTwoD {

	public static void main(String[] args) {
		char a[][]= {{'a','b','c'},
			    {'p','q','r'},
			    {'x','y','z'}};
	    
        for(int i=0;i<a[0].length;i++)
        {
    	System.out.println(a[i][0]+" ");
        }

	}

}
