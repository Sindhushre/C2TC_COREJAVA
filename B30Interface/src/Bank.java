
interface Bank {

}
class SBi implements Bank{
	public float rateofInterest()
	{
		return 9.15f;
	}
	
	}
class HDFC implements Bank{
	public float rateofInterest()
	{
		return 9.7f;
	}
	public static void main(String[] args) {
		Bank b = new SBI ();
		System.out.println("ROI: + b.rateOfInterest());
	
	}
}
	
