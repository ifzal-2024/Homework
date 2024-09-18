package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public Boolean usCitizenBoolean;
	public String familyName;

	public Father() {
		System.out.println("This is a default Constructor from Father(Parent) Class");
	}

	public Father(String name, int age, char sex, Boolean usCitizenBoolean) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizenBoolean = usCitizenBoolean;

		System.out.println("Father Name is: " + name + ". His age is: " + age + ". His Gender is: " + sex
				+ ". Is he US Citizen?  " + usCitizenBoolean + ".");
	}

	public void father() {
		System.out.println("This is a void type method from Father(Parent) Class");
	}

	public void fatherInfo(String name, int age, char sex, Boolean usCitizenBoolean) {

		System.out.println("Father Name is: " + name + ". His age is: " + age + ". His Gender is: " + sex
				+ ". Is he US Citizen?  " + usCitizenBoolean + ".");
	}

}
