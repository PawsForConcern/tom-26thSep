package temp;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name=scn.next();
		System.out.print("please enter the year of birth: ");
		int year=scn.nextInt();
		System.out.println("Hello "+name+", welcome to the world of java! You were born in "+year);
		
		System.out.print("Please enter your first name: ");
		String fName=scn.next();
		System.out.print("Please enter your last name: ");
		String lName=scn.next();
		System.out.println("Hello "+fName+" "+lName);
		scn.close();
	}

}
