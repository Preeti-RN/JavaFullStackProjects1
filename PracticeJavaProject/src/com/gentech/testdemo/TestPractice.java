package com.gentech.testdemo;
//1
class strarray
{
	String arry()
	{
		String a[]= {"apple","mango","orange","banana"};
		return a[0];
	}
}
//2
class intarray
{
	int[][] intarr()
	{
		int a[][]= {{1,2,3,},
				   {4,5,6}};		
		return a;
	}
	
}

//3
class areaofcircle
{
	double circle(int r)
	{
		double a=3.14*r*r;
		return a;
	}
}

//4
class nativeplace
{
	String place() 
	{
		String nativ="Mashal";
		return nativ;
	}
}


//5
class cubenum
{
	int cuben(int n)
	{
		int a=n*n*n;
		return a;
	}
}

//6
class notebook
{
	static int book()
	{
		int a=120;
		return a;
		
	}
}

//7
class summofelem
{
	static int summ()
	{
		int a[]= {2,4,6,8,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
		
	}
}

//8
class countnum
{
	static int countt()
	{int count=0;
		for(int i=40;i<=80;i++)
		{
			if(i%3==0)
			{
				count++;
			}
		}
		return count;
	}
}

//9
class inttochar
{
	char charrr(int n)
	{
	   char a=(char)n;
	   return a;
	}
}

//10
class twodchar
{
	static char[][] charrarray()
	{
		char a[][]= {{'a','b','c'},
				{'d','e','f'}};
		return a;
	}
}

//11
class chartoint
{
	static int intt(char a)
	{
		int b=(int)a;
		return b;
	}
}

//12
class threehobby
{
	static String[] hobbies()
	{
		String a[]= {"playing","singing","drawing"};
		return a;
	}
}

//13
class avrg
{
	static double averageofnum()
	{
		int sum=0;
		double avg;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		avg=sum/10;
		return avg;
	}
}

//14
class factorial
{
	int factorl(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

//15
class divofnum
{
	static int divnum(int a,int b)
	{
		int div=a/b;
		return div;
	}
}

//16
class evennum
{
	static int[] evennumber()
	{
		int a[]= {10,12,14,16,18,20};
		return a;
	}
}

//17
class oddnum
{
	static int[] firstfive()
	{
		int a[]= {2,3,5,7,11};
		return a;
	}
}

//18
class sumof
{
	static int sumofnum()
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}

//19
class multipl
{
	int mult(int a,int b,int c)
	{
		int res=a*b*c;
		return res;
	}
}

//20
class charone
{
	static char[] charoned()
	{
		char a[]= {'a','b','c'};
		return a;
	}
}

//21
class fourfriends
{
	String[] bestfriends()
	{
		String a[]= {"preeti","sapna","vaish","ravi","vishal"};
		return a;
	}
}

//22
class booleanone
{
	boolean[] boned()
	{
		boolean a[]= {true,true,false};
		return a;
	}
	
	
	//24
	byte[] byteoned()
	{
		byte[] a= {1,2,3,4};
		return a;
	}
	
	//25
	String[] strarr()
	{
		String[] a= {"preeti","prashant","talle"};
		return a;
	}

}


public class TestPractice {

	public static void main(String[] args) {
		strarray o=new strarray();
		String x=o.arry();
		System.out.println(x+" is first element");
		System.out.println();
		
		
		//2
		System.out.println("int array");
		intarray o1=new intarray();
		int[][] y=o1.intarr();
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//3
		System.out.println("Area of circle");
		areaofcircle o2=new areaofcircle();
		double z=o2.circle(2);
		System.out.println(z);
		System.out.println();
		
		
		//4
		System.out.println("Native place");
		nativeplace o4=new nativeplace();
		String a=o4.place();
		System.out.println(a+" is my native");
	    System.out.println();
	     
	     //5
	    System.out.println("cube of agiven number");
	    cubenum o5=new cubenum();
	    int b=o5.cuben(4);
	    System.out.println(b);
	    System.out.println();
	    
	    //6
	    System.out.println("price of note book ");
	    //notebook o6=new notebook();
	    int c=notebook.book();
	    System.out.println(c);
	    
	    //7
	    System.out.println("sum of elements in a array");
	    int d=summofelem.summ();
	    System.out.println(d);
	    
	    //8
	    System.out.println("count of numbers between 40 to 80 div by 3 ");
	    int e=countnum.countt();
	    System.out.println(e);
	    System.out.println();
	    
	    //9
	    System.out.println("int to char");
	    inttochar o9=new inttochar();
	    char f=o9.charrr(4);
	    System.out.println(f);
	    System.out.println();
	    
	    //10
	    System.out.println("2-D char array");
	    char[][] g=twodchar.charrarray();
	    for(int i=0;i<g.length;i++)
	    {
	    	for(int j=0;j<g[i].length;j++)
	    	{
	    		System.out.print(g[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	    
	    
	    //11
	    System.out.println("char to int");
	    int h=chartoint.intt('s');
	    System.out.println(h);
	    System.out.println();
	    
	    //12
	    System.out.println("Three hobbies");
	    String[] j=threehobby.hobbies();
	    for(int i=0;i<j.length;i++)
	    {
	    	System.out.print(j[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    
	    //13
	    System.out.println("average of first ten numbers");
	    double k=avrg.averageofnum();
	    System.out.println(k);
	    
	    //14
	    System.out.println("factorial of a given number");
	    factorial o14=new factorial();
	    int l=o14.factorl(5);
	    System.out.println(l);
	    System.out.println();
	    
	    //15
	    System.out.println("div of two given num");
	    int m=divofnum.divnum(8, 2);
	    System.out.println(m);
	    System.out.println();
	    
	    //16
	    System.out.println("even num btw 10 to 20");
	    int[] n=evennum.evennumber();
	    for(int i=0;i<n.length;i++)
	    {
	    	System.out.print(n[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //17
	    System.out.println("first five odd num");
	    int p[]=oddnum.firstfive();
	    for(int i=0;i<p.length;i++)
	    {
	    	System.out.print(p[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //18
	    System.out.println("sum of first five num");
	    int q=sumof.sumofnum();
	    System.out.println(q);
	    System.out.println();
	    
	    //19
	    System.out.println("multiplication of given three num");
	    multipl o19=new multipl();
	    int r=o19.mult(2,3,2);
	    System.out.println(r);
	    System.out.println();
	    
	    //20
	    System.out.println("one D char array");
	    char[] s=charone.charoned();
	    for(int i=0;i<s.length;i++)
	    {
	    	System.out.print(s[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //21
	    System.out.println("four best friends name");
	    fourfriends o21=new fourfriends();
	    String[] t=o21.bestfriends();
	    for(int i=0;i<t.length;i++)
	    {
	    	System.out.print(t[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    
	    //22
	    System.out.println("boolean one D array");
	    booleanone o22=new booleanone();
	    boolean u[]=o22.boned();
	    for(int i=0;i<u.length;i++)
	    {
	    	System.out.print(u[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    
	    //23
	    System.out.println("max element form given one d array");
	    
	    
	    //24
	    System.out.println("one D byte array");
	    byte[] xx=o22.byteoned();
	    for(int i=0;i<xx.length;i++)
	    {
	    	System.out.print(xx[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //25
	    System.out.println("string one d array");
	    String yy[]=o22.strarr();
	    for(int i=0;i<yy.length;i++)
	    {
	    	System.out.print(yy[i]+" ");
	    }
	    System.out.println();
	    
	    
	    
	   
	}

}
