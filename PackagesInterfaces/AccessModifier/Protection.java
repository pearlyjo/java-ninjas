package PackagesInterfaces.AccessModifier;

public class Protection {
	
	int n=1;
	private int n_pri=4;
	protected int n_pro=324;
	public int n_pub=324;
	
	//Creating a constructor
	
	public Protection()
	{
		System.out.println("This is the base Constructor");
		
		System.out.println("The value of n is "+n);
		System.out.println("The value of n_pri is "+n_pri);
		System.out.println("The value of n_pro is "+n_pro);
		System.out.println("The value of n_pub is " +n_pub);
		
	}

}
