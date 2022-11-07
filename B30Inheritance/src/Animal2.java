
 class Animal2 
 {
	 String color="white";
 }
 class Dog extends Animal
 {
	 String color ="black";
	 void printcolor() {
		 System.out.println(color);
	 }
	 }
 class Demo
 {
	 
	 
	 public static void main(String[] args) 
	 {
		 Dog d=new Dog();
		d.printcolor();
		

	}

}
