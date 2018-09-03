package PackagesInterfaces;

import PackagesInterfaces.AccessModifier.Protection;

/**
 * Example for Packages and Interfaces
 * @author Dell
 *
 */


class Balance
{
	String name;
	double num;
	
	Balance(String s,double n)
	{
		name=s;
		num=n;
	}
	
	void show()
	{
		if(num>0)
		{
			System.out.println("Balance is " +num);
		}
		else
		{
			System.out.println("This person has zero balance"+num);
		}
	}
}
public class PackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Balance current []= new Balance[3];
		
		current[0]=new Balance("Pearly",2438324);
		current[1]=new Balance("Vani",243834);
		current[2]=new Balance("Pavithra",0);
		
		for(int i =0;i<current.length;i++)
		{
			current[i].show();
		}
		Protection p = new Protection();
	
		
		
		
		

	}

}
