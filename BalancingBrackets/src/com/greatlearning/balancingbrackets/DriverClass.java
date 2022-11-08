package com.greatlearning.balancingbrackets;

//import java.util.Scanner;

public class DriverClass {

	public static void main(String args[]) {
		driverMethod(" ");
		driverMethod("[]");
		driverMethod("([[{}]])");
		driverMethod("([[{}]]))");
		driverMethod("[]");
		driverMethod("[)");
		driverMethod("[[[]]]");
		driverMethod("(a+b)+[c*d]");
	}

	private static void driverMethod(String input_string) {
		BalancedBracketChecker balancedbracketchecker;
		balancedbracketchecker = new BalancedBracketChecker(input_string);
		if (balancedbracketchecker.bracketcheck()) {
			System.out.println("Bracket expression " + input_string + " is balanced");
		} else {
			System.out.println("Bracket expression " + input_string + " is NOT balanced");
		}
	}
}
