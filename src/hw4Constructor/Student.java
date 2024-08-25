package hw4Constructor;

public class Student {
	public String stdName;
	public int stdId;
	public char stdGender;
	public float stdGrade;
	public boolean isProgrammer;
	
	public Student() {
		System.out.println("This is all about Student");
	}

	public Student(String stdName, int stdId, char stdGender, float stdGrade, boolean isProgrammer) {
		super();
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdGender = stdGender;
		this.stdGrade = stdGrade;
		this.isProgrammer = isProgrammer;
		System.out.println("Student Name: "  + stdName + ", ID: " + stdId + ", Gender: " + stdGender + ", Grade: " + stdGrade +  ", and Java Programmer? " + isProgrammer );
	}
	
	
	
	

}
