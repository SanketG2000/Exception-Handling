package ExceptionHandling;

public class TryCatchCatch {

	public static void main(String[] args) {
		try
		{
			int [] a={10,20,30};
			//int data=a[4]/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("Cant divided by zero");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Calculation Completed");
	}
}
