package hw4Constructor;

public class StudentTest {
	public static void main(String[] args) {

		Student std = new Student();
		System.out.println("");
		Student fahim = new Student("Fahim Redwan", 123456, 'M', 3.45f, false);
		System.out.println("");
		Student mary = new Student("Mary Hernandez", 456378, 'F', 3.90f, true);
		System.out.println("");
		Student alex = new Student("Alex Rod", 1254789, 'M', 2.95f, false);
		System.out.println("");
		Student ifzal = new Student("Muhammad Ifzal", 452654, 'M', 3.253f, false);

	}

}
