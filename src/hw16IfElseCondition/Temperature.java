package hw16IfElseCondition;
// IfElseCondition
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please entyer Today's Temperature");
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println("Its Freesing outside");
		} else if (todaysTemperature < 55) {
			System.out.println("Its pleasant outside");
		} else if (todaysTemperature < 73) {
			System.out.println("Its getting warmer outside");
		} else if (todaysTemperature < 101) {
			System.out.println("Its hot outside");
		} else if (todaysTemperature >= 101) {
			System.out.println("Its very hot outside");
		} else {
			System.out.println("Please put a valid temperature");
		}

		scanner.close();
	}

}
