package com.gentech.programs;

public class traffic {

	public static void main(String[] args) {
		String a=args[0];
		switch(a) {
		case "Red":case "red":case "RED":
			System.out.println("red for stop");
			break;
		case "Yellow":
			System.out.println("yellow for ready to go");
			break;
		case "Green":
			System.out.println("green for go");
			break;
		default:
			System.out.println("invalid");
			break;
		
		}

	}

}
