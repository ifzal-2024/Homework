package hw17UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Hemoglobin A1C value below");
		double hbA1c = scanner.nextDouble();

		// Checks if person is Diabetic or Not
		if (hbA1c > 6.4) {
			System.out.println("I am diabetic");
		} else {
			System.out.println("Congratulations! You are not a diabetic patient");
			// Nested if Checks if pre-diabetic or Healthy
			if (hbA1c >= 5.7) {
				System.out.println("But you are  pre-diabetic. Please watch your diet.");
			} else if (hbA1c < 5.7) {
				System.out.println("You are a healthy person");
			}

		}

		scanner.close();
	}
}