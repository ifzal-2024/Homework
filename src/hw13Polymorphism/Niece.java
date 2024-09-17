package hw13Polymorphism;

/*
 * What is Method Overriding?
 * When different methods exist with the same method name with same parameters or signature 
 * but with different syntax or logic, it is called method overriding. Method Overriding occurs during run time.
 * 
 */

public class Niece extends Sister {
//	Void type non Parameterized method  implemented

	@Override
	public void sister() {
		System.out.println("This is void type method from Sister Class");
		System.out.println("Void method from Niece Class");
	}

	@Override
//	void type parameterized method  implemented
	public void sister(int age1, int age2) {
		int total1 = age1 * 2 + (age2 + 2);
		System.out.println("Total age from Sister: " + total1);

	}

	@Override
	// return type parameterized method (3) implemented
	public int sister(int age1, String age2, int age3) {
		int total2 = (age1 + 1) + Integer.parseInt(age2) / 2 + (age3 - 1);
		System.out.println("Total age from Sister: " + total2);
		return total2;
	}

	/*
	 * Static method cannot be overridden // because static is a local member method
	 * of Sister class
	 * 
	 * @Override public static void sister(int age4, int age5, int age6, int age7) {
	 * int toal3 = age4 + age5 + age6 + age7;
	 * System.out.println("Total age from Static void type method  Sister is: " +
	 * toal3); }
	 */

	/*
	 * // Static return type parameterized method implemented
	 * 
	 * @Override public static int sister(String age12,int age13) { int total5=
	 * Integer.parseInt(age12) + age13;
	 * System.out.println("Total age from  static return type Sister is: " + total5
	 * ); return total5; }
	 */

	/*
	 * Final type method cannot be Overridden // Final void type method
	 * 
	 * @Override public final void sister(int age14,String age15) { int total6=
	 * age14 + Integer.parseInt(age15);
	 * System.out.println("The Total age from final void type method Sister is: "+
	 * total6); }
	 */

	/*
	 * @Override public final int sister(int age9, int age10, float age11) { int
	 * total4 = age9+age10+(int) age11;
	 * System.out.println("Total age from Final method of Sister Class is: " +
	 * total4);
	 * 
	 * return total4; }
	 */

}
