
 class A1
 {
	 A1()
	 {
		 System.out.println("animal is created");
	 }
	 }
 class Dog extends A1
 {
	 Dog()
	 {
		 super();
		 System.out.println("dog is created");
	 }
	 
	 }
 class Demo
 {
	 

	public static void main(String[] args) {
		Dog d=new Dog();

	}

}
