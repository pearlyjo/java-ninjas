package JavaCompleteReference;

public class overLoadingConstructors {
	
	double width;
	double height;
	double depth;
	
//	
//	Constructor 1 in described,with no parameters
	
	overLoadingConstructors()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	
	//Constructor 2 overloaded with 2 parameters
	
	overLoadingConstructors(int a,int b,int c)

	{
		width=a;
		height=b;
		depth=c;
	}
	
	overLoadingConstructors(double n)
	{
		width=2*n;
		depth=3*n;
		height=4*n;
	}
	
	void Volume()
	{
		double Volume=width*height*depth;
		System.out.println("The Volume is:" +Volume);
	}

}
