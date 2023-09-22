package com.sgtesting.integration;

class bank
{
 bank(String name)
 {
  System.out.println("bank name is:"+name);
  
 }
}
class branch extends bank
{
 String branch;
 branch(String n,String b)
 {
  super(n);
  this.branch=b;
  System.out.println("Branch name is:"+b);
  
 }
}
class accounts extends branch
{
 int total;
 accounts(String name,String branch,int totalaccounts)
 {
  super(name,branch);
  this.total=totalaccounts;
  System.out.println("total no of accounts:"+totalaccounts);
  
 }
}

public class MultiInheritanceSix {

	public static void main(String[] args) {
		accounts oo=new accounts("canera","PDA",700);
		  
	}

}
