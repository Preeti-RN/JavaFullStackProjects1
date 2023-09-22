package com.gentech.parameterizedconstructor;
/*
desk top id:11
desk top name:hp
storage is :3
RAM:8
version:200
++++++++++
laptop id:12
laptop name:hp
storage:2
RAm:7
version:300
++++++++++
mobile id :12
mobile name:oneplus
storage is:200
RAM:126
version is:5

 */
class Desktop
{
	
	Desktop(int desktopid,String Desktopname,int  version,int noofdesktops,int ram,int storage)
	{
		
		System.out.println("desk top id:"+desktopid);
		System.out.println("desk top name:"+Desktopname);
		System.out.println("storage is :"+storage);
		System.out.println("RAM:"+ram);
		System.out.println("version:"+version);
		System.out.println("++++++++++");
	}
}
class Laptop
{
	
	Laptop(int laptopid,
	String Laptopname,
	int version,
	int nooflaptops,
	int ram,
	int storage)
	{
		
		System.out.println("laptop id:"+laptopid);
		System.out.println("laptop name:"+Laptopname);
		System.out.println("storage:"+storage);
		System.out.println("RAm:"+ram);
		System.out.println("version:"+version);
		System.out.println("++++++++++");
	}
}
class Mobiledevices
{
	
	Mobiledevices(int mobileid,
	String mobilename,
	int version,
	int noofmobiles,
	int ram,
	int storage)
	{
		
		System.out.println("mobile id :"+mobileid);
		System.out.println("mobile name:"+mobilename);
		System.out.println("storage is:"+storage);
		System.out.println("RAM:"+ram);
		System.out.println("version is:"+version);

	}
}
public class LaptopDesktop {

	public static void main(String[] args) {
        Desktop desktops=new Desktop(11,"hp",200,12,8,3);
		
		Laptop lap=new Laptop(12,"hp",300,11,7,2);
		
		Mobiledevices mobile=new Mobiledevices(12,"oneplus",5,10,126,200);
	}

}
