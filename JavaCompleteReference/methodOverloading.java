package JavaCompleteReference;

public class methodOverloading {
	
	void test()
	{
		System.out.println("No parameter:");
	}
	
	int test(int a)
	{
		System.out.println("The value of a: " +a);
		return a;
		
	}
	 
	int test(int a,int b)
	{
		System.out.println("Inside the method with 2 parameter");
		return a*b;
		
	}
 double test (double c)
	{
	 System.out.println("Inside the method with double type");
		return c*c;
	}
 
 int test (int a,int b,int c)
 {
	 System.out.println("Inside the method with 3 parameters");
	 return a+b+c;
 }
}
