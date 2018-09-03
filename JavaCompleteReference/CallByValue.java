//Example of Call by value
package JavaCompleteReference;

class test{
	int i;
	int j;
	void func(int a,int b)
	{
		System.out.println("Value of a and b inside method before operation "+a+" "  +b);
		a*=10;
		b/=10;
		
		System.out.println("Value of a and b end of operation in  method "+a+" "  +b);
	}
}
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test obj1 = new test();
	
		int a=100;
		int b=324;
		System.out.println("Value of a and b before passing "+a+" "  +b);
		
		obj1.func(a,b);
		
		System.out.println("Value of a and b after passing "+a+" "  +b);
		
		
		
	}

}
