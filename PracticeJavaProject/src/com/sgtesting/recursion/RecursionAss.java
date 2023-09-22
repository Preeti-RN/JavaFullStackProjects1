package com.sgtesting.recursion;

class recursiondemo {
	// Display odd numbers between 20 to 40
	// static int x=20;
	static void oddnum() {

		for (int i = 40; i >= 20; i--) {
			if ((i % 2) == 1) {
				System.out.print(i);
				break;
			}

		}
		
		oddnum();
	}
	// Display Even number between 20 to 1
	/*
	 * static int y=20; static void evennum() { if(y>=1) { if(y%2==0) {
	 * System.out.println(y); } y--; evennum(); } } //Display number divisible by 8
	 * static int num=1; static void numbers() {
	 * 
	 * if(num<=100) { if(num%8==0) { System.out.println(num); } num++; numbers(); }
	 * } //Display count of numbers divisible by 10 static int count=0; static int
	 * n=100; static int countnum() { if(n<=200) { if(n%10==0) { count=count+1; }
	 * n++; countnum(); } return count;
	 * 
	 * } //sum of first 20 num static int sum=0; static int a=1; static int sumnum()
	 * { if(a<=20) { sum=sum+a; a++; sumnum(); }
	 * 
	 * return sum; } // Display Tenth Table static int j=1; static void Tentable() {
	 * if(j<=10) { System.out.println("10*"+j+"="+10*j); j++; Tentable(); }
	 * 
	 * } static int k=10; static void FifthTable() { if(k>=1) {
	 * System.out.println("5*"+k+"="+5*k); k--; FifthTable(); } }
	 */

}

public class RecursionAss {

	public static void main(String[] args) {

		System.out.println("odd num-------------");
		recursiondemo.oddnum();
		/*
		 * System.out.println("even num-----------"); recursiondemo.evennum();
		 * System.out.println("div by 8------------"); recursiondemo.numbers(); int
		 * a=recursiondemo.countnum(); System.out.println("count is:"+a); int
		 * b=recursiondemo.sumnum(); System.out.println("sum is:"+b);
		 * System.out.println(); System.out.println("Tenth table-----------");
		 * recursiondemo.Tentable(); System.out.println();
		 * System.out.println("Fifth table-----------"); recursiondemo.FifthTable();
		 */

	}

}
