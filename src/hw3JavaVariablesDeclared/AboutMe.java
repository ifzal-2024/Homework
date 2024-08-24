package hw3JavaVariablesDeclared;

public class AboutMe {

	// variable Declared.
	public String myClassBatch;

	// variables Initialized
	public String myName;
	public byte myAge;
	public short myCarPayment;
	public int myHousePayment;
	public long myEmployeeNumber;
	public float myHeight;
	public double myGrade;
	public char myShirtSize;
	public boolean uSCitizen;

	// Constructor Declared.
	public AboutMe() {

		System.out.println(":---------This is all about Myself----------------:");

	}

	// method Implemented
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Car Payment: " + myCarPayment
				+ "\nMY House Payment: " + myHousePayment + "\nMy Employee Number " + myEmployeeNumber + "\nMY Height "
				+ myHeight + "\nMy Grade " + myGrade + "\nMy Shirt Size: " + myShirtSize + "\nUS Citizen? "
				+ uSCitizen);
	}

}
