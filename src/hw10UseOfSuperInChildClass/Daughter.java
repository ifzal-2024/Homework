package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birtMonth;
	public int age;

	public Daughter() {
		System.out.println("The default constructor is from Daughter (child) Class");
	}

	public Daughter(String birtMonth, int age) {
		// super(); Constructor cannot be called 2 times
		super("Abdur Rahim", 65, 'M', true);
		this.birtMonth = birtMonth;
		this.age = age;
		super.father();
		super.fatherInfo("Abdur Rahim", 65, 'M', true);
		super.familyName = "Rahim Family";
		System.out.println("The Family Name is: " + familyName);
		System.out.println("The daugter was born in: " + birtMonth + ". Her age is: " + age);

	}

	public void daughter() {
		System.out.println("This void type method is from Daughter (child) Class");
	}

	public void daughterInfo(String birtMonth, int age) {
		// super("Abdur Rahim", 65, 'M', true); We can't call Constructor inside method.
		this.birtMonth = birtMonth;
		this.age = age;
		super.father();
		super.fatherInfo("Abdur Rahim", 65, 'M', true);
		super.familyName = "Rahim Family";
		System.out.println("The Family Name is: " + familyName);
		System.out.println("The daugter was born in: " + birtMonth + ". Her age is: " + age);

	}

}
