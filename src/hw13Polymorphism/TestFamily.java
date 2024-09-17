package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println("------------------Sister----------------");
		Sister sis = new Sister();
		sis.sister();
		sis.sister(3, 4);
		sis.sister(4, "5", 6);
		Sister.sister(2, 6, 8, 1);
		Sister.sister("8", 9);
		sis.sister(12, "15");
		sis.sister(12, 13, 14.6f);

		System.out.println("\n---------Niece------------------------- ");
		Niece ne = new Niece();
		ne.sister();
		ne.sister(3, 4);
		ne.sister(4, "5", 6);

	}

}
