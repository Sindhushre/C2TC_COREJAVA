package access_modifiers_demo;

public class test0 {
	int i=10;
	void show() {
		 System.out.println("Hello world");
	}

	public static void main(String[] args) {
	  test0 t0 = new test0();
	  t0.show();
	  System.out.println(t0.i);

	}

}
