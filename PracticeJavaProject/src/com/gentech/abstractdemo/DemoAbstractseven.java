package com.gentech.abstractdemo;
abstract class college7
{
	college7(String Name)
 {
 
 }
}
class depart extends college7
{
 int did;
 depart(String Name,int id)
 {
  super(Name);
  this.did=id;
  System.out.println("the college name is:"+ Name);
  System.out.println("the college id is:" +id);
  
 }
}
class library7 extends depart
{
 String bookname;
 library7(String Name,int id,String bookname)
 {
  super(Name,id);
  this.bookname=bookname;
  System.out.println("the bookname is:" +bookname);
 }
}

public class DemoAbstractseven {

	public static void main(String[] args) {
		library7 obj1=new library7("Appa college",6784,"OOPs");	
	}

}
