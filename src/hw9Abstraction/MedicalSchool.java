package hw9Abstraction;

/* 
 * An Abstract Class can only inherit either one regular class  or another Abstract Class by extends keyword
 * An Abstract Class cannot inherit interface with extends keyword
 */

public abstract class MedicalSchool extends NursingSchool {

	// Yes we can create a default constructor inside Abstract Class.
	public MedicalSchool() {
		System.out.println("This is default constructor from MedicalSchool  Abstract Class ");
	}

	// Method Implemented
	// non - abstract method
	public void bioChemistryLab() {
		System.out.println(" This bioChemistryLab is a Non-abstract method and is from MedicalSchool Abstract Class");
	}

	// Medthod declared or defined
	// Abstract method
	public abstract void anatomyLab();

}
