package calculator;

import java.util.Scanner;
public class Calculator {
	public static int add(int a, int b) {return a+b;}
	public static int subtract(int a, int b) {return a-b;}
	public static int divide(int a, int b) {return a/b;}
	public static int multiply(int a, int b) {return a*b;}
	public static int operations() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter the first number:");
		int a = scn.nextInt();
		System.out.print("Please enter the second number:");
		int b = scn.nextInt();
		System.out.print("Please enter the desired operation:");
		String op = scn.next();
		scn.close();
		switch (op) {
			case "add":
				return add(a,b);
			case "subtract":
				return subtract(a,b);
			case "divide":
				return divide(a,b);
			case "multiply":
				return multiply(a,b);
			default:
				System.out.println("Invalid operation");
				return 0;
		}
	}
}
