package hw14Abstraction;

/* 
 * An Abstract Class can only inherit either one regular class  or another Abstract Class by extends keyword
 * Only one keyword"extends" is used to inherit another Abstract Class by an Abstract Class.
 * Abstract Class Medical School inherits Abstract class Nursing school with Extends Keyword
 * An Abstract Class cannot inherit interface with extends keyword
 * An Abstract class can inherit Interface by "implements" keyword
 * An Abstract class can inherit more than one interfaces separated by comma using implements Keyword.
 * Abstract Class Medical School inherits interface Lawschool with Implements keyword.
 * In short Abstract class utilizes single inheritance using "extends" to inherit either a regular or abstract class 
 * and utilizes multiple inheritance using "implements" keyword to inherit interface.
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	// Yes we can create a default constructor inside Abstract Class.
	public MedicalSchool() {
		System.out.println("This is default constructor from MedicalSchool  Abstract Class ");
	}

	// Method Implemented
	// non - abstract method
	public void bioChemistryLab() {
		System.out.println("This bioChemistryLab is a Non-abstract method and is from MedicalSchool Abstract Class");
	}

	// Medthod declared or defined
	// Abstract method
	public abstract void anatomyLab();

}
