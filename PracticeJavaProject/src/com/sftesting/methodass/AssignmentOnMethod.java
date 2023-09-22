package com.sftesting.methodass;
class methodass
{
	//for the given byte array read the second half of the elements
	void bytearray(byte a[])
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//for the given 1 D short array read the first half of the elements
	void shortarray(short a[])
	{
		for(int i=0;i<a.length/2;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	//for the given 1 D int  array read the fisrt half of the elements  in reverse order
	void intarray(int a[])
	{
		int b[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
			k++;
		}
		for(int j=0;j<a.length/2;j++)
		{
			System.out.print(b[j]+" ");
		}
	}
	
	//for the given 1-D char array concatenate all the charectors
	void concat(char a[],char b[])
	{
		int size=a.length+b.length;
		
		char x[]=new char[size];
		for(int i=0;i<a.length;i++)
		{
			x[i]=a[i];
			 
		}
		for(int j=0;j<b.length;j++)
		{
			x[a.length+j]=b[j];
		}
		System.out.println("concateneted array");
		
		for(char c:x)
			System.out.print(c+" ");	
	}
	
	//for the given 1-D string array read the elements in reverse order
	void stringarray(String a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	//for the given 1-D int array find sum  of all elements
	void sumofelemnts(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
	//for the given 1-D char array display vowel only
	void vowel(char a[])
	{
		
		
		for(int i=0;i<a.length;i++)
	   {
			switch(a[i])
			{
			case'a':case'A':
				System.out.println(a[i]+" is vowel");
				break;
			case'e':case'E':
				System.out.println(a[i]+" is vowel");
				break;
			case'i':case'I':
				System.out.println(a[i]+" is vowel");
				break;
			case'o':case'O':
				System.out.println(a[i]+" is vowel");
				break;
			case'U':case'u':
				System.out.println(a[i]+" is vowel");
				break;
				default:
					continue;	
	
	   }
	}
}
	
	//for the given 2-D 3*3 int array read the last row of the elements
	void readlastrow(int a[][])
	{
		for(int i=0;i<a[2].length;i++)
		{
			System.out.print(a[2][i]+" ");
		}
	}
	
	//for the given 2-D 3*3 int array find the sum of the elements only of first row 
	void sumoffirstrow(int a[][])
	{
		int sum=0;
		for(int i=0;i<a[0].length;i++)
		{
			sum=sum+a[0][i];
		}
		System.out.println("sum of first row is: "+sum);
	}
	
	//subtraction of two matrix and display the result in reverse order  
	void sutraction(int a[][],int b[][])
	{
		if((a.length==b.length)&&(a[0].length==b[0].length))
		{
			int sub[][]=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					sub[i][j]=a[i][j]-b[i][j];
					
				}
				System.out.println();
			}
			for(int i=sub.length-1;i>=0;i--)
			{
				for(int j=sub[i].length-1;j>=0;j--)
				{
					System.out.print(sub[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	//for the given 1-D int array square the each elements and find the sum
	void squretheelements(int a[])
	{
		int sq[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			sq[k]=a[i]*a[i];
			k++;
		}
		int sum=0;
		for(int i=0;i<sq.length;i++)
		{
			sum=sum+sq[i];
		}
		System.out.println("squre of sum of each elements is:"+sum);
	}
	
	//for the given 2-D string array concatenate all the elements
	void sringconcatarray(String a[][])
	{
		System.out.println("concat string");
		String s=" ";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				s=s+a[i][j];
			}
		}
		System.out.print(s);
	}
}
public class AssignmentOnMethod {

	public static void main(String[] args) {
		
		methodass o=new methodass();
		System.out.println("byte array");
		byte x[]= {1,2,3,4,5,6};
		o.bytearray(x);
		
		
		System.out.println("short array");
		short y[]= {3,4,5,6,7,8};
		o.shortarray(y);
		
		
		System.out.println();
		System.out.println("int array");
		int s[]= {10,20,30,40,50,60};
		o.intarray(s);
		
		
		System.out.println();
		char g[]={'a','b','c'};
		char a[]= {'d','e','f'};
		o.concat(g,a);
		
		
		System.out.println("string array");
		String b[]= {"preeti","shruti","kavya","soumya"};
		o.stringarray(b);
		
		
		System.out.println();
		System.out.println("sum of elements");
		int c[]= {1,2,3,4,5};
		o.sumofelemnts(c);
		
		
		System.out.println("display only vowel");
		char n[]= {'c','d','e','z','i'};
		o.vowel(n);
		
		
		System.out.println("only last row");
		int d[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		o.readlastrow(d);
		
		System.out.println();
		int f[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
		o.sumoffirstrow(f);
		
		
		int p[][]={{10,11,12},
				{13,15,16},
				{17,18,19}};
		int e[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
		o.sutraction(p,e);
		
		int t[]={1,2,3};		
		o.squretheelements(t);
		
		String w[][]= {{"preeti","deepa"},
		             {"sneha","sandeep"}};
		o.sringconcatarray(w);
		
		
		
	}

}
