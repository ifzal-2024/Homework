package hw10Abstraction;

/* 
 * A Regular Class can only inherit either one regular class  or another Abstract Class by extends keyword
 * Only one keyword"extends" is used to inherit another  Class by a regular Class.
 * ColumbiaUniversity is a Regular Class and MedicalSchool is an Abstract Class. ColumbiaUniversity inherits MedicalSchool
 * with extends keyword
 * A regular Class cannot inherit interface with extends keyword
 * A regular class can inherit Interface by "implements" keyword
 * A regular class can inherit more than one interfaces separated by comma using implements Keyword.
 * Regular Class ColumbiaUniversity inherits interfaces University and VocationalSchool with implements Keyword
 * In short a regular class utilizes single inheritance using "extends" keyword to inherit either a regular or abstract class 
 * and utilizes multiple inheritance using "implements" keyword to inherit interface.
 * 
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// Non Abstract Implemented Method
	public void biology() {
		System.out.println("I am a non-abstract method from Columbia University Regular Class");

	}

	// Abstract method in Regular Class is not possible.
	// public abstract void chemistry();

	// Yes it is possible to declare a default Constructor inside Regular Class
	public ColumbiaUniversity() {
		System.out.println("I am Constructor from Columbia University Regular Class");
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SurgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public String teacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
