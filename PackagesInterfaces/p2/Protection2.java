package PackagesInterfaces.p2;

public class Protection2  extends PackagesInterfaces.AccessModifier.Protection{
	
	Protection2()
	{
		System.out.println("This is a different package constructor");
		//Default n value will not be visible s the default access does not grant permission.
		//Private variable wont be visible as its visible only within the class
//		System.out.println("The value of n is " +Protection2.n);
//		System.out.println("The value of n_pri is "+Protection2.n_pri);
		System.out.println("The value of n_pro is "+n_pro);
		System.out.println("The value of n_pub is " +n_pub);
	}

}
