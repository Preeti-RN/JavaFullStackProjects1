package com.gentech.practice;

import java.util.Scanner;

public class AlfabetsPatern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number:");
		int val=scanner.nextInt();
		int voteage=18;
		if(val>=voteage)
		{
			System.out.println(val+" eligible");
		}
		else
		{
			System.out.println(val+" fail");
		}

	}

}
