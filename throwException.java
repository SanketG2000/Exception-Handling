package ExceptionHandling;

import java.util.*;

public class throwException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		if(age<0)
		{
			throw new ArrayIndexOutOfBoundsException("Inavlid Age");
		}
		else
		{
			System.out.println("Age Stored");
		}
	}
}
