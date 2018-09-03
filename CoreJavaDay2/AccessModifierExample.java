/**
 * Program to demonstrate difference between public and private keyword
 */
package CoreJavaDay2;

class Acess{
	private int a;
	public int b;
	int c;
	
	void seta(int i)
	{
		a=i;
		
	}
	int geta()
	{
		return a;
	}
}


public class AccessModifierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acess ab= new Acess();
		
		ab.seta(34);
		int x=ab.geta();
		
		ab.b=23;
		ab.c=223;
		
		System.out.println("The value of a(private) is :  "+x);
		System.out.println("The value of b(public) is :  "+ab.b);
		System.out.println("The value of c (default)is :  "+ab.c);
		

	}

}
