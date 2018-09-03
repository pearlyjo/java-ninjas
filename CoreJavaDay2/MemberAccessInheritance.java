package CoreJavaDay2;

/**
 * THis program will not comile as int j is private.IT is just to demonstrate the use of access modifiers
 * 
 * 
 */

class A
{
	int i;
	private int j;
	
	
	void setij(int x;int y)
	{
		i=x;
		j=y;
	}
	void showij()
	{
		System.out.println("The values of i and j are: " +i +"  "+ +j);
	}
}

class B extends  A
{
	int total;
	
	void sum()
	{
		total=i+j;
	}
}

public class MemberAccessInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B subob = new B();
		B.sum();

	}

}
