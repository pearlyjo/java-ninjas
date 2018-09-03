package JavaCompleteReference;

class box9 {
	
	int height;
	int width;
	int depth;
	
	void setdimensions(int w,int h,int d)

	{
		height=h;
		width=w;
		depth=d;
	}
	
	void volume()
	{
		double volume=height*width*depth;
		System.out.println("The Volume is : " +volume);
	}
}

public class box4{
	


public static void main(String[] args)


{
	//Create a new object
	
	box9 b1= new box9();
	
	box9 b2=new box9();
	
	
	box9 b3=b2;
	//Using parameterized methods
	
	b1.setdimensions(23,1,3);
	b2.setdimensions(34, 10, 13);
	b3.setdimensions(323, 34,234);
	
	
	
	b1.volume();
	b3.volume();
	
	b2.volume();
	
}
}


