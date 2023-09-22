package com.sgtesting.recursion;
class primenumber1 
{
	void sumPrime(int x, int y) 
	{
		int sum = 0;
		for (int i = x; i <= y; i++) 
		{
			int k = 1;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) 
				{
					k = k + 1;
					break;
				}
			}
			if (k == 1) 
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}

class primenumber2
{
	void countPrimes(int a, int b) 
	{
		int count = 0;
		for (int i = a; i <= b; i++)
		{
			int flag=0;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) {
					flag+= 1;
					break;
				}
			}
			if (flag == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

class primenumber3{
	void isprime(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag+=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}

	}
}

class primenumber4
{
	void isprime(int a,int b)
	{
		for(int i=a;i>=b;i--)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag+=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}

public class VoidExamples {

	public static void main(String[] args) {
		System.out.println("100 to 200 prime no sum");
		primenumber1 o1 = new primenumber1();
		o1.sumPrime(100, 200);

		System.out.println("150 to 300 prime no count");
		primenumber2 o2 = new primenumber2();
		o2.countPrimes(150, 300);

		System.out.println("1 to 50 prime no");
		primenumber3 o3 = new primenumber3();
		o3.isprime(1,50);

		System.out.println("100 to 50 prime numbers");
		primenumber4 o4 = new primenumber4();
		o4.isprime(100,50);
	}

}
