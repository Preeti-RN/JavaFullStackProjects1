package com.sgtesting.integration;

class ass8 {
 String names;
 int rollno;
 int pincode;

 ass8(String name, int r, int pc) {
  names = name;
  rollno = r;
  pincode = pc;
  System.out.println("Super Class name : " + names);
  System.out.println("Roll no : " + rollno);
  System.out.println("College Code : " + pincode);
 }
}

class ass82 extends ass8 {
 String names;
 int rollno;
 int pincode;

 ass82(String name, int r, int pc) {
  super(name, r, pc);
  names = name;
  rollno = r;
  pincode = pc;
  System.out.println("Child Class 1 name : " + names);
  System.out.println("Roll no : " + rollno);
  System.out.println("College Code : " + pincode);
 }
}

class ass83 extends ass82 {
 String names = "";
 int rollno;
 int pincode;

 ass83(String name, int r, int pc) {
  super(name, r, pc);
  names = name;
  rollno = r;
  pincode = pc;
  System.out.println("Child Class 2 name : " + names);
  System.out.println("Roll no : " + rollno);
  System.out.println("College Code : " + pincode);
 }
}

class ass84 extends ass8 {
 String names = "";
 int rollno;   
 int pincode;

 ass84(String name,int r,int pc)
 {
  super(name,r,pc);
  names = name;
  rollno = r;
  pincode = pc;
  System.out.println("Child Class 3(simple) name : "+names);
  System.out.println("Roll no : "+rollno);
  System.out.println("College Code : " + pincode);
 }
}


public class EightAss {

	public static void main(String[] args) {
		ass83 obj = new ass83("Preeti ", 67, 585101);
		  ass84 obj2 = new ass84("Anand", 84, 560013);

	}

}
