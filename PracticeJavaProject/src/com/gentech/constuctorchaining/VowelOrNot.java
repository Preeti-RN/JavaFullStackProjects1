package com.gentech.constuctorchaining;
class Vowel
{
	Vowel(char ch)
	{
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
}
public class VowelOrNot {

	public static void main(String[] args) {
		Vowel obj=new Vowel('x');

	}

}
