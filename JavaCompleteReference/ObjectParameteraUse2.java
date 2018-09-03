package JavaCompleteReference;

public class ObjectParameteraUse2 {
	double width;
	double height;
	double depth;
	
	ObjectParameteraUse2(ObjectParameteraUse2 ob1)
	{
		width=ob1.width;
		height=ob1.height;
		depth =ob1.depth;
		
		
	}

	ObjectParameteraUse2()
	{
		width=-100;
		height=-100;
		depth =-100;
	}
	
	ObjectParameteraUse2(double a,double b,double c)
	{

		width=a;
		height=b;
		depth =c;
		
	}
	
	void volume()
	{
		double volume=width*height*depth;
		System.out.println("The volume is " +volume);
	}
	
}
