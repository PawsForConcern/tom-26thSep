package conditions;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = scn.next();
		System.out.print("Please enter your city: ");
		String city = scn.next();
		scn.close();
		if (city.equals("London")) {
			System.out.println("Hello "+name+", you are British");
		}
		else if (city.equals("NewYork")) {
			System.out.println("Hello, "+name+", you are American");
		}
		else {
			System.out.println("Hello, "+name+", I've never heard of "+city+" before.");
		}
	}
}
