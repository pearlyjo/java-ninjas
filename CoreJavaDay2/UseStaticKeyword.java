package CoreJavaDay2;
/**
 * Program to demostrate the use of static keyword.
 * 
 * when static is declared it can be accessed even before  creating object
 * @author Dell
 *
 */

public class UseStaticKeyword 
{
	static int a=10;
	static int b=3;
	
	static void meth(int i)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		System.out.println("The value of i is " +i);
	}
	
	static
	{
		System.out.println("Static Block intialized!! first");
		b*=23;
		System.out.println("The value of b is " +b);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Since its a static block need not create a object!!
		meth(324);
		System.out.println(a);
	}
}

