package com.sgtesting.recursion;
class Arrayrev
{
	//2D 3*3 char array in reverse order
	static char[][] reverse(char x[][])
	{
		char y[][] = new char[x.length][x[0].length];
		for (int i = 0; i <x.length; i++) 
		{
			for (int j = 0; j <x[0].length; j++)
			{
				y[i][j] = x[x.length - i - 1][x[0].length - j - 1];
			}
		}
		return y;
	}
	static String concat(char x[][]) //return concatenation result of 2D 3*3 char array
	{
		

		System.out.println("concat string");
		String s=" ";
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				s=s+x[i][j];
			}
		}
		
		return s;
	}
	static char[] FirstRow(char x[][]) //return the 1st row of elements from 2D 3*3 char array
	{
		char y[]=new char[x[0].length];
		for (int i=0;i<x[0].length;i++) {
			y[i]=x[0][i];
		}
		return y;
	}

	static String Alphabets() //return 26 upper case alphabets
	{
		char[] alphabet = new char[26];
		int k=0;
		for (char i = 'A'; i <='Z'; i++) {
			alphabet[k] = i;
			k++;;
		}
		return new String(alphabet);
	}
	static String FirstHalfUppercaseAlphabets()//return 1st half of the upper case alphabets
	{
		char[] result = new char[13]; 
		int k=0;
		for (char i='A';i<='M';i++) {
			result[k]=i;
			k++;
		}
		return new String(result);
	}
	static String SecondHalfUppercaseAlphabets() {
		char[] a = new char[13];
		int k=0;
		for(char i='N';i<='Z';i++)
		{
			a[k]=i;
			k++;
		}
		return new String(a);
	}
	static char[] LowerCaseAlphabetsReverse()
	{
		char x[]=new char[26];
		int k=0;
		for(char i='z';i>='a';i--)
		{
			x[k]=i;
			k++;
		}
		return x;
		
	}
	//Prime numbers between 1 to 50
	
	static boolean isprime1(int num) {
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)
			return true;
		else

			return false;
	}
	
	
	static int sumofprimes(int start, int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(isprime1(i)==true)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	static int countofprimes(int start, int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(isprime1(i)==true)
			{
				count=count+1;
			}
		}
		return count;
	}

	
	static char[] ThirdRow(char x[][]) //return the 1st row of elements from 2D 3*3 char array
	{
		char y[]=new char[x[0].length];
		for (int i=0;i<x[2].length;i++) {
			y[i]=x[2][i];
		}
		return y;
	}
	
	//div by 25 num between 250 to 500
	
	static boolean divbyetwentyfive(int num)
	{
		int flag=0;
		for(int i=250;i<=500;i++)
		{
			if(i%25==0)
			{
				flag+=1;
				break;
			}	
		}
		if(flag==0)
		{
			return true;
		}
		else
			return false;
		
	}
	//Secondhalf elements from 1D
	static String[] secondhalfelements(String[] str)
	{
		String s[]=new String[str.length/2];
		int k=0;
		for(int i=str.length/2;i<str.length;i++)
		{
			s[k]=str[i];
			k=k+1;
		}
		return s;
	}
}
public class StaticReturn {

	public static void main(String[] args) {
		
		Arrayrev o=new Arrayrev();
		char[][] s={{'a', 'b', 'c'},
				{'d', 'e', 'f'}, 
				{'g', 'h', 'i'}};
		char z[][]=o.reverse(s);
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[i].length;j++)
			{
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		

		char[][] a={{'a', 'b', 'c'},
				   {'d', 'e', 'f'}, 
				   {'g', 'h', 'i'}};
		String  c=Arrayrev.concat(a);
		System.out.println("concatenation: ");
		System.out.print(c); 
		System.out.println("-----------------------------------------------");
		
		
		
		
		
		char[][] d = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'}};
		System.out.println("1st row of elements: ");
		char[] fr = Arrayrev.FirstRow(d);
		for (char e : fr) {
			System.out.print(e+" ");
		}
		System.out.println();
		  System.out.println("-----------------------------------------------");
		  
		  
		  
		  
		  
		  String alphabets = Arrayrev.Alphabets();
		  System.out.println("26 upper case alphabets: ");
		  System.out.println(alphabets+" ");
		  System.out.println("-----------------------------------------------");
		  
		  
		  
		  String firstHalf = Arrayrev.FirstHalfUppercaseAlphabets();
		  System.out.println("1st half of the uppercase alphabets: ");
		  System.out.println(firstHalf);
		  System.out.println("-----------------------------------------------");
		  
		  
		  String secondHalf = Arrayrev.SecondHalfUppercaseAlphabets();
		  System.out.println("2nd half of the upper case alphabets: ");
		  System.out.println(secondHalf);
		  System.out.println("-----------------------------------------------");
		  
		  
		  
		  System.out.println("lower case alphabets in reverse order: ");
		  char rev[]=o.LowerCaseAlphabetsReverse();
		  for(int i=0;i<rev.length;i++)
		  {
			  System.out.print(" "+rev[i]);
		  }
		  System.out.println();
		 
		  System.out.println("---------------");
		  
		  
		  
		  
		  
		  System.out.println("sum of prime num from 1to 50");
		  for(int i=1;i<=50;i++)
		  {
			  if(o.isprime1(i)==true)
			  {
				  System.out.println(i+" ");
			  }
		  }
		  System.out.println("-----------------------------------------------");
		  
		  
		  
		  System.out.println("sum of prime no.s from 1 to 100: ");
		  int gg=o.sumofprimes(1,100);
		  System.out.println(gg+" ");
		  System.out.println("-----------------------------------------------");
		  
		  
		  
		  int cc=o.countofprimes(1, 200);
		  System.out.println("count of prime from 1 to 200:"+cc);
		  System.out.println("------------------------");
		  
		  
		  
		  System.out.println("3rd row elements: ");
		  char[][] y = {
		    {'a', 'b', 'c'},
		    {'d', 'e', 'f'},
		    {'g', 'h', 'i'}
		  };
		  char[] h = o.ThirdRow(y);
		  for (char e : h) {
		   System.out.print(e+" ");
		  }
		  
		  
		  
		  
		  System.out.println("250 to 500 div by 25");
		  for(int i=250;i<=500;i++)
		  {
			  if(o.divbyetwentyfive(i)==true)
			  {
				  System.out.println(i+" ");
			  }
		  }
		  
		  
		  
          System.out.println("second half elements");
		  String p[]= {"preeti","sapna","anand","swati"};
		  String l[]=o.secondhalfelements(p);
		  for(String u:l)
		  {
			  System.out.print(u+" ");
		  }
	}

}
