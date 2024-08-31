package hw5JavaMethods;

public class FullName {

	public String fullName(String fName, String lName) {
		String fullName = fName + " " + lName;
		System.out.println("Family Member: " + fullName);
		return fullName;

	}

	public static void main(String[] args) {
		FullName fn = new FullName();
		fn.fullName("Samuel", "Adams");
		fn.fullName("Anthony", "Adams");
		fn.fullName("Samantha", "Adams");
	}

}
