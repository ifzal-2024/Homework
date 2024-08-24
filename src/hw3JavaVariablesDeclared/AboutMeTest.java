package hw3JavaVariablesDeclared;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe ifzal = new AboutMe(); // Constructor is initialized here
		// variables are initialized below
		ifzal.myName = "Muhammad A Mughnee";
		ifzal.myAge = 44;
		ifzal.myCarPayment = 600;
		ifzal.myHousePayment = 3142;
		ifzal.myEmployeeNumber = 19135778l;
		ifzal.myHeight = 5.6f;
		ifzal.myGrade = 3.894562;
		ifzal.myShirtSize = 'M';
		ifzal.uSCitizen = true;
		ifzal.aboutMe(); // Method is initialized here

		System.out.println("\n-----------------------------------------------------------------------\n");

		AboutMe alex = new AboutMe();// Constructor is initialized here
		// variables are initialized below
		alex.myName = "Alex Rodriguez";
		alex.myAge = 55;
		alex.myCarPayment = 900;
		alex.myHousePayment = 46523;
		alex.myEmployeeNumber = 2356983l;
		alex.myHeight = 6.2f;
		alex.myGrade = 3.4562;
		alex.myShirtSize = 'L';
		alex.uSCitizen = false;
		alex.aboutMe(); // Method is initialized here
		// Test 

	}

}
