
interface FirstInterface {
	public void myMethod();
}
interface SecondInterface {
	public void myOtherMethod();
}
class Democlass implements FirstInterface, SecondInterace {
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Democlass myObj = new Democlass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
