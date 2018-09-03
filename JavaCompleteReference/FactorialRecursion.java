package JavaCompleteReference;

import java.util.Scanner;

class fact{
	long facto(long a)
	{
		if(a==1)
			return 1;
		else
		{
			
			return facto(a-1)*a;
		}
		
	}
}
public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fact value = new fact();
		System.out.println("Please Enter the value :");
		Scanner s= new Scanner(System.in);
		long g=s.nextLong();
		long value1=value.facto(g);
		System.out.println("The value of factorial of the given number "+value1);

	}

}
