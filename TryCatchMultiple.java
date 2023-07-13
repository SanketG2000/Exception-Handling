package ExceptionHandling;

public class TryCatchMultiple {

	public static void main(String[] args) {
		try
		{
			int [] a={10,20,30};
			int data =a[4]/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Out Of bounds");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Calculation Completed");
	}
}
