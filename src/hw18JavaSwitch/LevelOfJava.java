package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Write about your Java level");
		String myLevel = scanner.nextLine();

		switch (myLevel) {
		case "Beginner":
			System.out.println("I am at the beginning Level");
			break;

		case "Intermediate":
			System.out.println("I am at the Intermediate Level");
			break;

		case "Expert":
			System.out.println("I am at the Expert Level");
			break;

		case "Excellent":
			System.out.println("I have a Java Certification from Oracle");
			break;

		default:
			System.out.println("I am a drop out");
			break;
		}
		scanner.close();
	}

}
