
public class Employee {
	int id;
	String name;
	float salary;
	public void initialize(int i, String n, float s) {
		id=i;
		name=n;
		salary=s;
		System.out.println(id + " " + name + " " +salary);
	}
	void display () {
		System.out.println(id + " " + name + " " + salary);	}
	Employee(){
		System.out.println(" no value initializeed for this object");
	}
	
	Employee(int i, String n, float s){
		System.out.println("user defined no argument constructor");
	}

	public static void main(String[] args) {
		Employee e1=new Employee(101, "sindhu", 10.0f);
		Employee e2=new Employee();
		e1.display();
		e2.display();
	}

}
