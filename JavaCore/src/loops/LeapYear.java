package loops;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter a year: ");
		int year = scn.nextInt();
		scn.close();
		System.out.print(year+" is ");
		if (year % 4 == 0) {
			if (year % 100 ==0) {
				if (year % 400!=0) {
					System.out.print("not ");
				}
			}
		}
		else {
			System.out.print("not ");
		}
		System.out.print("a leap year.");
	}
}
