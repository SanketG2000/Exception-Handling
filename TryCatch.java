package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		try
		{
			int data=100/0;;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Calculation Completed");
	}
}
