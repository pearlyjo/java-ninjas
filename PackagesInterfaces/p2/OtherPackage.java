package PackagesInterfaces.p2;

public class OtherPackage {
	OtherPackage()
	{
 PackagesInterfaces.AccessModifier.Protection pm =  new  PackagesInterfaces.AccessModifier.Protection();
			
 System.out.println("This is a other Packge ");
 System.out.println("The value of n_pub is " +pm.n_pub);

//Private,DEfault and Protected wont work

//System.out.println("The value of n is " +Protection2.n);
//System.out.println("The value of n_pri is "+Protection2.n_pri);
//System.out.println("The value of n_pro is "+p4.n_pro);

}
}

