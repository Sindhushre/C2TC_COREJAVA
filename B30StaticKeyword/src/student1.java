
 class student1 {
	 int rollno;
		String name;
		static String college= "ITS";
		static {
			college="ITIS";
		}
		student1 (int r, String n)
		{
			rollno = r;
			name = n;
		}
		static void change() {
				college = "BBDIT";
			}
			void display () {
				  System.out.println(rollno+ " " +name+ " " +college);
			}
		

	public static void main(String[] args) {
		student s1 = new student(111, "sindhu");
		student s2 = new student(222,"nikhil");
		change();
		s1.display();
		s2.display();
	

	}

}
