package com.gentech.classes;
/*
 india
1236000000
32
Hindi
++++++++++++
Karnataka
27
60000000
kannada
++++++++++
gulbarga
19
24000000
kannada

 */
class Country
{
	String countryname;
	int  noofstates;
	long population;
	String language;
}
class State
{
	String statename;
	int noofdistricts;
	int population;
	String language;
}
class District
{
	String Districtname;
	int population;
	String language;
	int noofmandals;
}
public class CountryStateDist {

	public static void main(String[] args) {
		
		Country countries=new Country();
		countries.countryname="india";
		countries.population=1236000000;
		countries.noofstates=32;
		countries.language="Hindi";
		System.out.println(countries.countryname);
		System.out.println(countries.population);
		System.out.println(countries.noofstates);
		System.out.println(countries.language);
		System.out.println("++++++++++++");
		State states=new State();
		states.statename="Karnataka";
		states.noofdistricts=27;
		states.language="kannada";
		states.population=60000000;
		System.out.println(states.statename);
		System.out.println(states.noofdistricts);
		System.out.println(states.population);
		System.out.println(states.language);
		System.out.println("++++++++++");
		District dist=new District();
		dist.Districtname="gulbarga";
		dist.noofmandals=19;
		dist.population=24000000;
		dist.language="kannada";
		System.out.println(dist.Districtname);
		System.out.println(dist.noofmandals);
		System.out.println(dist.population);
		System.out.println(dist.language);
	}

}
