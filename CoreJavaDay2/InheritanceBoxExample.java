package CoreJavaDay2;

public class InheritanceBoxExample {

	double width;
	double height;
	double depth;
	
	//constructor initialization
	
	InheritanceBoxExample()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	InheritanceBoxExample(double i,double j,double k)
	{
		width=i;
		depth=j;
		height=k;
	}
	InheritanceBoxExample(double len)
	{
		width=depth=height=len;
	}
	
	double volume()
	{
		return width*height*depth;
		
	}
}
