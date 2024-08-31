package hw5JavaMethods;

public class MyFamily {
	public int child1Age = 10;
	protected int child2Age = 7;
	int child3Age = 3;

	public int sumAge() {
		int sum = child1Age + child2Age + child3Age;
		System.out.println("The Sum of my children's age is: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		MyFamily myFam = new MyFamily();
		myFam.sumAge();

	}

}
