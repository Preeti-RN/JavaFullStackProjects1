package com.gentech.polymorphismdemo;
abstract class animals
{
	abstract void sound();
}
class dog extends animals
{
	void sound()
	{
		System.out.println("dog will bark");
	}
}
class cat extends animals
{
	void sound()
	{
		System.out.println("sound of cat is meow");
	}
}
class cow extends animals
{
	void sound()
	{
		System.out.println("sound of cow is moo");
	}
}
public class PolyDemo2 {

	public static void main(String[] args) {
		animals f=null;
		
		dog d=new dog();
		cat ca=new cat();
		cow co=new cow();
		
		f=d;
		f.sound();
		
		f=ca;
		f.sound();
		
		f=co;
		f.sound();


	}

}
