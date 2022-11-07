
 class A {
	 void message()
	 {
		 System.out.println("class a");
	 }
	 
	 }
 class B
 {
	 void message()

	 {
		 System.out.println("class B");
	 }
	 }
 class C extends A,B{
	 
	public static void main(String[] args) {
		C obj=new C();
		obj.msg();
		

	}

}
