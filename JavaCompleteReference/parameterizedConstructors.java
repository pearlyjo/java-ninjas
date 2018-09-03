package JavaCompleteReference;

class parametersCons
{
	int height;
	int depth;
	int width;
	//declaring Constructors

	
	parametersCons(int h,int d,int w)
	{
		System.out.println("Constructing the box ");
	
		height=h;
		depth=d;
		width=w;
		
	}
	//computing Volume
	
	void Volume()
	{
		int volume=height*depth*width;
		System.out.println("The Volume of the Box is "+volume);
	}
	
}

public class parameterizedConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructing a constructor with the parameters as mentions
		parametersCons b1=new parametersCons(2,10,2);
	
		//Computing the volume of b1
		b1.Volume();
		parametersCons b2 =new parametersCons(2,10,10);
		
		//Computing the volume of b2
		b2.Volume();
	

	}

}
