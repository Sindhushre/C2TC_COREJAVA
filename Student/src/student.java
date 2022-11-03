
public class student {
	int rollno ;
	String name;
	static String college;
	static {
	college = "siet";
	}
	student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	static void change() {
		college = "SIET";
	}
	void display ()
	{
		System.out.println(rollno+" "+name+" "+college);
		
	
	}

	public static void main(String[] args) {
		student s1 = new student(111, "sindhu");
		student s2 = new student(222, "nikhil");
		s1.display();
		s2.display();
		

	}

}
