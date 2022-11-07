
 abstract class Animal
 {
	 abstract void eat();
 }
 class Herbivores extends Animal
 {
	 void eat()
	 {
		 System.out.print("I am a vegetarian");
	 }
	 }
 class carnivores extends Animal {
	 void eat()
	 {
		 System.out.print("I am non-vegetarian");
	 } 	
	 }
 class omnivores extends Animal
 {
	 void eat()
	 {
		 System.out.println("I will eat  both veg and non-veg");
	 }
public static void main(String[] args) {
		Animal goat = new Herbivores();
		Animal tiger = new carnivores();
		Animal bear = new omnivores();
		goat.eat();
		tiger.eat();
		bear.eat();

	}

}
