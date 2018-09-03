package CoreJavaDay2;

class BoxClassSuperUse {
	
	private double width;
	private double depth;
	private double height;
	
	//Constructor when to clone an object
	
	BoxClassSuperUse (BoxClassSuperUse ob)
	{
		width=ob.width;
		depth=ob.depth;
		height=ob.height;
	}
	
	//Constructor when no parameters are specified
	BoxClassSuperUse ()
	{
		width=-1;
		depth=-1;
		height=-1;
	}
	//Constructor when all parameters are given	
	BoxClassSuperUse (double w,double h,double d)
	{
		width=w;
		depth=h;
		height=d;
	}
	
	//Constructor when for using a cube
	BoxClassSuperUse (double x)
	{
		width=x;
		depth=x;
		height=x;
	}
	BoxClassSuperUse(double g,double y)
	{
		width=g;
		height=y;
				double test=g*y;
				
	}
	//Method to find the volume
	void volume()
	{
		double vol=width*depth*height;		
		System.out.println("The volume is  "+vol);
	}
	
}
//creating the second class
class tofindBoxWeight extends  BoxClassSuperUse
{
	double weight;

	//Creating the constructor with object parameter
	 tofindBoxWeight(tofindBoxWeight ob1)
	 {
		super(ob1);
		weight=ob1.weight;
		 
		 
	 }
	 
		//creating parameter with 4 parametes
	 tofindBoxWeight(double w,double h,double d,double we)
	 {
		super(w,h,d);
		weight=we;
		 
		 
	 }
	 //creating constructor with no parameters
	 tofindBoxWeight()
	 {
		 super();
		 weight=-1;
	 }
	 
	 //creating a constructor with 2 parameters
	 
	 tofindBoxWeight(double len ,double m)
	 {
		 super(len);
		 weight=m;
	 }
	
}

class Shipment extends tofindBoxWeight
{
	double  cost;
	
	Shipment(double x,double y,double z,double w)
	{
		super(x,y,z,w);
		cost=w;
	}
	
	Shipment(Shipment ob)
	{
		super(ob);
		cost=ob.cost;
		
	}
	Shipment(double f ,double j)
	{
		super(f,j);
	}
	
	
	
}


