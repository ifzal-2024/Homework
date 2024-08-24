package hw2JavaVariablesInitialized;

public class AboutMe {

	// variable Declared.
	public String myClassBatch;

	// variables Initialized
	public String myName = "Muhammad Ifzal";
	public int myAge = 44;
	public float myGrade = 3.543f;
	public char myGender = 'M';
	public boolean UsCitizen = true;

	// Constructor Declared.
	public AboutMe() {
		System.out.println(":---------This is all about Myself----------------:");

	}

	// method Implemented
	public void aboutMe() {
		System.out.println("My Name: " + myName + ", My Age: " + myAge + ", My Grade: " + myGrade + ", My Gender: "
				+ myGender + ", US Citizen? " + UsCitizen);
	}

	public static void main(String[] args) {

		AboutMe ifzal = new AboutMe(); // Constructor Initialized
		ifzal.aboutMe(); // method initialized

	}

}
