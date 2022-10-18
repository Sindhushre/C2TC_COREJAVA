
public class Student {
	int rollno;
	String name;
	void insertRecord(int r, String n) {
		rollno=r;
		name=n;
	
	}
	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}
 class main {
	 public static void main(String[] args) {
		 
		 Student S1 = new Student ();
		 Student S2 = new Student ();
		 S1.insertRecord(111, "karan");
		 S2.insertRecord(222, "Arya");
		 S1.displayInformation();
		 S2.displayInformation();
	 
}

}
