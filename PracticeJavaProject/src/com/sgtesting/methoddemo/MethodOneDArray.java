package com.sgtesting.methoddemo;
class samlpedemo
{
	void onearray(int x[])

	{ 

		int y[]=new int[x.length];
		int k=0;
		for(int i=(x.length-1);i>=0;i--)
		{
			y[k]=x[i];

			k++;
		}
		System.out.println();
		for(int j=0;j<y.length/2;j++)
		{
			System.out.print(y[j]+" ");
		}
	}


	void vowelornot(char ch)
	{
		System.out.println();
		switch(ch)
		{
		case'a':case'A':
			System.out.println(ch+" is vowel");
			break;
		case'e':case'E':
			System.out.println(ch+" is vowel");
			break;
		case'i':case'I':
			System.out.println(ch+" is vowel");
			break;
		case'o':case'O':
			System.out.println(ch+" is vowel");
			break;
		case'U':case'u':
			System.out.println(ch+" is vowel");
			break;
		default:
			System.out.println(ch+" is not a Vowel");
		}

	}
	void Twod(char x[][])
	{System.out.println("reverse 2D array");
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
public class MethodOneDArray {

	public static void main(String[] args) {
		char a[][]= {{'a','b','c'},
				{'i','d','e'}};
		int z[]= {1,2,3,4,5,6};
		samlpedemo obj=new samlpedemo();
		obj.onearray(z);
		obj.vowelornot('a');
		obj.Twod(a);
	}

}
