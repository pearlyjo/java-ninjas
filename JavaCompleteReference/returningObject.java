package JavaCompleteReference;

class testing{
	
	int a;
	testing(int b)	
	{
	a=b;	
	}
	testing function()
	{
		testing temp = new testing(a*100);
		return temp;
		
	}
	
}

public class returningObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testing obj1= new testing(4);
		System.out.println(obj1.a);
		//testing the return parameter of objects
		
		testing obj2=obj1.function();
		
		//the value of obj2 changes,Meanwhile value of object 1 a remains the same
		
		System.out.println(obj2.a);
		obj2=obj2.function();
		System.out.println(obj2.a);
		
	}

}
