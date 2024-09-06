package hw7Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		System.out.println(" -------------- Animal Class-----------------------------------");
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("----------------Mammal Class ---------------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("-----------------Reptile Class----------------------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("---------------------------------Birds Class---------------------------");
		Birds birds = new Birds();
		birds.birdInfo();
		birds.animalInfo();

		System.out.println("---------------------------------Dog Class -------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("----------------------------------Snake Class-----------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("----------------------------------Robin Class-------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdInfo();
		robin.animalInfo();

		System.out.println("-----------------------------------Bull DOg CLass---------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("------------------------------------Cobra Class----------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		// BullDog extends Dog, Dog extends Mammal, Mammal extends Animal
		// Example of Multilevel Inheritance.

		// Mammal extends Animal, Reptile extends Animal, Birds extends Animal
		// Example of Hierarchical Inheritance.

	}

}
