package com.gentech.constuctorchaining;
//f is alfabet
class Alfabet
{
	Alfabet(char ch)
	{ 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+" is alfabet");
		}
		else
		{
			System.out.println("not alfabet");
		}
		
	}
}
public class AlfabetOrNot {

	public static void main(String[] args) {
		
     Alfabet obj=new Alfabet('f');
	}

}
