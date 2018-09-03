/**
 * Methos Overriding exhibits run time polymorphism
 * 
 */

package MethodOverridingExample;


class Figure
{
	double dim1;
	double dim2;
	 
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	//creating a overriding class
	double area()
	{
		System.out.println("The figure has no area");
		return 0;
	}
}//end of class Figure

class rectangle extends Figure
{
	rectangle(double x,double y)
	{
		super(x,y);//calling the Figure constructor
	}
	
	double area()
	{
		System.out.println("The value of area inside rectangle ");
		return dim1*dim2;//to compute the area of a rectangle
		
	}
}//end of class rectangle

class triangle extends Figure
{
	triangle(double c , double h)
	{
		super(c,h);
	}
	//creating a overriding class
	double area()
	{
		System.out.println("The value of area inside triangle ");
		return (dim1*dim2)/2;
	}
}
public class ApplyingOverridenMethods {
	
	
	public static void main(String[] args)
	{
		Figure f = new Figure(8,3);
		rectangle r=new rectangle(f.dim1,5);
		triangle t= new triangle(3,2);
		
		Figure value;//Value with data type figure
		
		value=f;
		
		
		System.out.println("Area is " +value.area());
		
		value=r;
		
		
		System.out.println("Area is " +value.area());
		value=t;
		
		
		System.out.println("Area is " +value.area());
	}

}//end of ApplyingOverriden methods
