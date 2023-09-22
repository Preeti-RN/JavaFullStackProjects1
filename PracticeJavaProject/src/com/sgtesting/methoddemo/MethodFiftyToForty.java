package com.sgtesting.methoddemo;
class demoforwhiledowhile
{
	void demofor()
	{
		System.out.println("for loop");
		for(int i=50;i>=40;i--)
		{
			
			System.out.println(i);
		}
	}
	void demowhile(int i)
	{
		System.out.println("while loop");
		i=50;
		while(i>=40)
		{
			
			System.out.println(i);
			i--;
		}
		
	}
	void demodowhile(int i)
	{
		System.out.println("dowhile loop");
		 i=50;
		do {
			
			System.out.println(i);
			i--;
		}while(i>=40);
	}
	
}
public class MethodFiftyToForty {

	public static void main(String[] args) {
		demoforwhiledowhile o=new demoforwhiledowhile();
		o.demofor();
		o.demowhile(50);
		o.demodowhile(50);
		
	}

}
