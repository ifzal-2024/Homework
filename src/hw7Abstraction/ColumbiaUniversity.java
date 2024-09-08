package hw7Abstraction;

public class ColumbiaUniversity {
	
	// Non Abstract Implemented Method
	public void biology() {
		System.out.println("I am a non-abstract method from Columbia University Regular Class");
		
	}
	
	// Abstract method in Regular Class is not possible.
	//public abstract void chemistry();

	// Yes it is possible to declare a default Constructor inside Regular Class
public ColumbiaUniversity() {
	System.out.println("I am Constructor from Columbia University Regular Class");
}


}
