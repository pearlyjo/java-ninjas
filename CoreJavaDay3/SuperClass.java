package CoreJavaDay3;

class A
{
	int i;
	
}

class B extends A
{
	private String j;

	B(int a,int b )
	{
		super.i=b;//I value will be updated in Class A
		int i=a;//I value will be updated in class B
	}
	
	void showi()
	{
		System.out.println("The value of i in Class A "+super.i);
		System.out.println("The value of i in Class B " +i);
	}
}

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A obj1=new A();
		B obj2 = new B(1,2);
	
		obj2.showi();

	}

}
