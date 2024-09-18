package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println("-----------------Below from Father(Parent)----------------");
		Father father = new Father();
		Father father2 = new Father("Abdur Rahim", 65, 'M', true);
		father2.father();
		father2.fatherInfo("Abdur Rahim", 65, 'M', true);

		System.out.println("\n------------------Below  from Daughter(child Class)-----------");
		Daughter daughter = new Daughter();
		Daughter daughter2 = new Daughter("January", 38);
		daughter2.daughter();
		daughter2.daughterInfo("January", 38);

	}

}
