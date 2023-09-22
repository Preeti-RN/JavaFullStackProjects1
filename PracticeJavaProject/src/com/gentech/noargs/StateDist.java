package com.gentech.noargs;
/*
country name:india
population is :1236000000
no of states:32
language:Hindi
++++++++++++
state name:Karnataka
no of dist:27
population:60000000
language:kannada
++++++++++
district name:gulbarga
no of mandals :19
population is:24000000
language:kannada

 */

class Country
{
	String countryname;
	int  noofstates;
	long population;
	String language;
	Country()
	{
	countryname="india";
	population=1236000000;
	noofstates=32;
	language="Hindi";
	System.out.println("country name:"+countryname);
	System.out.println("population is :"+population);
	System.out.println("no of states:"+noofstates);
	System.out.println("language:"+language);
	System.out.println("++++++++++++");
	}
}
class State
{
	String statename;
	int noofdistricts;
	int population;
	String language;
	State()
     {  
		statename="Karnataka";
		noofdistricts=27;
		language="kannada";
		population=60000000;
		System.out.println("state name:"+statename);
		System.out.println("no of dist:"+noofdistricts);
		System.out.println("population:"+population);
		System.out.println("language:"+language);
		System.out.println("++++++++++");
	}
}
class District
{
	String Districtname;
	int population;
	String language;
	int noofmandals;
	District()
	{
		Districtname="gulbarga";
		noofmandals=19;
		population=24000000;
		language="kannada";
		System.out.println("district name:"+Districtname);
		System.out.println("no of mandals :"+noofmandals);
		System.out.println("population is:"+population);
		System.out.println("language:"+language);
	}
}
public class StateDist {

	public static void main(String[] args) {
		
		Country countries=new Country();
		
		State states=new State();
		
		District dist=new District();
		
	}

}
