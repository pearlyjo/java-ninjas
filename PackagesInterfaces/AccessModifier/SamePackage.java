package PackagesInterfaces.AccessModifier;

public class SamePackage {
	
	public SamePackage()
	{
		Protection p = new Protection();
		System.out.println("This is inside this samePackage constructor");
		//Private variable wont be visible as its visible only within the class
		System.out.println("The value of n is " +p.n);
//		System.out.println("The value of n_pri is "+p.n_pri);
		System.out.println("The value of n_pro is "+p.n_pro);
		System.out.println("The value of n_pub is " +p.n_pub);
	}

}
