package PackagesInterfaces.AccessModifier;

public class Derived extends Protection {
	
	Derived()
	{
		System.out.println("This is a Derived constructor");
		System.out.println("The value of n is " +n);
		//Private variable wont be visible as its visible only within the class
		
		//System.out.println("The value of n_pri is "+n_pri);
		System.out.println("The value of n_pro is "+n_pro);
		System.out.println("The value of n_pub is " +n_pub);
	}
	

}
