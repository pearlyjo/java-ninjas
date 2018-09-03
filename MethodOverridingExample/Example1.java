package MethodOverridingExample;

public class Example1 {
	
	int i,j;int k;
	
	Example1(int a,int b)
	{
		i=a;
		j=b;
		k=i+j;
	}
	
	void show()
	{
		System.out.println("Super Class: The value of i and j is " +i  +j);
	}
	
	void example()
	{
		System.out.println("The sum of i an j is " +k);
	}

}


class example2 extends Example1{

	int m;
	example2(int a, int b,int c) {
		super(a, b);
		m=c;
	}
	//overrides the show in the class Example1.
	void show()
	{
		//Without the super show when show is called only this method will be displ,ayed.
		
		
		super.show();//This calls A's show
		
		System.out.println("Sub Class: The value of c is " +m);
	}
	
	void example(String msg)
	{
		System.out.println(msg+m*i*j );
	}


	
	
}