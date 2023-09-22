package com.gentech.constuctorchaining;
//sorted array is:[1, 3, 4, 6, 8, 9]
import java.util.Arrays;

class Ascend
{
	Ascend(int a[])
	{
		Arrays.sort(a);
		System.out.println("sorted array is:"+Arrays.toString(a));
	}
}

public class SortArray {

	public static void main(String[] args) {
		int x[]= {1,6,3,8,4,9};
		Ascend obj=new Ascend(x);

	}

}
