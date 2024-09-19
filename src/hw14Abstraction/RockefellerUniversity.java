package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("I am maths method from RockefellerUniversity Regular Class");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo from AeronauticalSchool Interface");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method from EngineeringSchool Abstract Class.");
	}
}
