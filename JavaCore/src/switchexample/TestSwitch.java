package switchexample;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter a suit: ");
		String card=scn.next();
		scn.close();
		switch (card) {
		case "club":
			System.out.println("you got a club");
			break;
		case "diamond":
			System.out.println("you got a diamond");
			break;
		case "spade":
			System.out.println("you got a spade");
			break;
		case "heart":
			System.out.println("you got a heart");
			break;
		default :
			System.out.println("Not a valid card");

		}

	}

}
