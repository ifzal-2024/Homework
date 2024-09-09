package hw9Abstraction;

/*
 Inside Interface we can only use one keyword  i.e. extends
 Interface cannot inherit regular Class or abstract class with extends keyword
 An Interface can inherit more than one interfaces (separated by comma) by extends keyword. In this case College and Hospital 
 are super interface or parent Interfaces and University is child Interface.
 */

public interface University extends College, Hospital {

	// Interface cannot have constructor because we cannot instantiate them.

	/*
	 * public University() { }
	 */

	public void classSize();

	public abstract void playGround();

	public String teacher();

	public static void library() {
		System.out.println("I am a static method\"library\" inside Interface University");

	}

	public default void gymnasium() {
		System.out.println("I am a default method\"gymnasium\" inside Interface Univeristy");
	}
}
