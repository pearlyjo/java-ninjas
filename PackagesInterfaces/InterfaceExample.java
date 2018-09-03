package PackagesInterfaces;

/**
 * Example of Interfaces
 * 
 * @author Dell
 *
 */
interface callback
{
	void callback(int param);
}
 interface callmetoo
{ 
	void callme(int j);
	
}

class client implements callback,callmetoo
{
	//MEthod which us an interface should be always public!!
	public void callback(int p)
	{
		System.out.println("The Client is called with " +p);
	}
	public void callme(int h) {
		System.out.println("HEllo this is the implementation of second interface" +h);
	}
	
	void nonInterface()
	{
		System.out.println("Classes that implement interface may also have other methods as well" );
	}
}

class AnotherImplementation implements callback
{
	public void callback(int x)
	{
		System.out.println("This is an example of Client that implements example with anotheer class " +x);
		System.out.println("The square value is "+(x*x));
	}
}
public class InterfaceExample {

	public static void main(String[] args)
	{
		callback c = new client();
		c.callback(34783);
		
		System.out.println();
		callback c2 = new AnotherImplementation();
		callmetoo cg= new client();
		
	c.callback(56);
		
		c2.callback(45);
		System.out.println();
		System.out.println("To see the  memory location");
		System.out.println(c);
		System.out.println(c2);
	}
}
