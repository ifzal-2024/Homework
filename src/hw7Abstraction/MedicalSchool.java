package hw7Abstraction;

public abstract class MedicalSchool {
	
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
