/**
 * Program is an example of nested Interface!!
 * 
 * to implement nested interface Baseclassname.Interfacename
 */
package PackagesInterfaces;

class A
{
	public interface NestedInterface3
	{
		boolean isNotNegative(int x);
	}
}

class B implements A.NestedInterface3
{
	public boolean isNotNegative(int j) 
		
	
	{
		if(j<0)
		{
			return true;
		}
		return false;
		
	}
}
public class NestedInterface {
	
	public static void main(String[] args)
	{
	
	A.NestedInterface3 n = new B();
	boolean h=n.isNotNegative(-89);
	
	System.out.println(h);
	}

}
