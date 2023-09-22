package com.gentech.polymorphismdemo;
abstract class family
{
	abstract void Preeti();
}
class daughter extends family
{
	void Preeti()
	{
		String father="Revanasidda";
		System.out.println("Preeti is daughter of:"+father );
	}
}
class sister extends family
{
	void Preeti()
	{
		String bro="Anand";
		System.out.println("Preeti is sister of:"+ bro);
	}
}
class wife extends family
{
	void Preeti()
	{
		String H="Prashant";
		System.out.println("Preeti is wife of :"+H);
	}
}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		family f=null;
		
		daughter d=new daughter();
		sister s=new sister();
		wife w=new wife();
		
		f=d;
		f.Preeti();
		
		f=s;
		f.Preeti();
		
		f=w;
		f.Preeti();
	}

}
