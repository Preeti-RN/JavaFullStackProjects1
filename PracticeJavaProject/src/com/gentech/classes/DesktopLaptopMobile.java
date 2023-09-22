package com.gentech.classes;
/*
11
hp
200
8
3
++++++++++
11
hp
200
8
3
++++++++++
12
oneplus
126
8
10
 */
class Desktop
{
	int desktopid;
	String Desktopname;
	int  version;
	int noofdesktops;
	int ram;
	int storage;
	
}
class Laptop
{
	int laptopid;
	String Laptopname;
	int version;
	int nooflaptops;
	int ram;
	int storage;	
}
class Mobiledevices
{
	int mobileid;
	String mobilename;
	int version;
	int noofmobiles;
	int ram;
	int storage;
}
public class DesktopLaptopMobile {

	public static void main(String[] args) {
		
		Desktop desktops=new Desktop();
		desktops.desktopid=11;
		desktops.Desktopname="hp";
		desktops.storage=200;
		desktops.ram=8;
		desktops.version=3;
		System.out.println(desktops.desktopid);
		System.out.println(desktops.Desktopname);
		System.out.println(desktops.storage);
		System.out.println(desktops.ram);
		System.out.println(desktops.version);
		System.out.println("++++++++++");
		Laptop lap=new Laptop();
		lap.laptopid=11;
		lap.Laptopname="hp";
		lap.storage=200;
		lap.ram=8;
		lap.version=3;
		System.out.println(lap.laptopid);
		System.out.println(lap.Laptopname);
		System.out.println(lap.storage);
		System.out.println(lap.ram);
		System.out.println(lap.version);
		System.out.println("++++++++++");
		Mobiledevices mobile=new Mobiledevices();
		mobile.mobileid=12;
		mobile.mobilename="oneplus";
		mobile.storage=126;
		mobile.ram=8;
		mobile.version=10;
		System.out.println(mobile.mobileid);
		System.out.println(mobile.mobilename);
		System.out.println(mobile.storage);
		System.out.println(mobile.ram);
		System.out.println(mobile.version);
		

	}

}
