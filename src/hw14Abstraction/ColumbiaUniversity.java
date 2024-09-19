package hw14Abstraction;

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
		System.out.println("CommonRoom method from College Interface ");

	}

	@Override
	public void laboratory() {
		System.out.println("laboratory method method from College Interface");

	}

	@Override
	public void languageClub() {
		System.out.println("language method from College Interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom method from Hospital Interface");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom method from Hospital Interface");
	}

	@Override
	public void cafeteria() {
		System.out.println("cafeteria method from Hospital Interface");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("covationalInfo from VocationalSchool Interface");

	}

	@Override
	public void classSize() {
		System.out.println("classSize method from University Interface");
	}

	@Override
	public void playGround() {
		System.out.println("playGround method from University Interface");
	}

	@Override
	public String teacher() {
		System.out.println("teacher method from University Interface");
		return null;
	}

	@Override
	public void lawInfo() {
		System.out.println("lawInfo method from LawSchool Interface");

	}

	@Override
	public void anatomyLab() {
		System.out.println("anatomyLab from MedicalSchool Abstract Class.");
	}

	@Override
	public void hygiene() {
		System.out.println("hygiende method from NursingSchool Abstract Class.");

	}

}
