package PackagesInterfaces;

/**
 * Example of partial implementation of Interface
 * @author Dell
 * 
 * Program will error out as the partial implementation is a 
 * abstract class;
 *
 */
abstract class partial implements callback
{
	int a,b;
	void show(int a,int d)
	{
		System.out.println("The value of a and b is  " + a +b);
	}
	
	public void callback(int a)
	{
		System.out.println("The value of a is  "+a);
	}
	
}

public class PartialImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cannot instantiate partial class as its abstract
		callback b =  new partial();
		
		b.callback(34);
				

	}

}
