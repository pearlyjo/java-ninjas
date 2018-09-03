package MethodOverridingExample;

public class ExampleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example2 n = new example2(2,3,1);
		
		Example1 n1= new Example1(3,3);
		
		//show invokes the method in the derived class.It does not show the 
		//method in the original class super class.
		n.show();
		
		n1.example();
		
		n.example("The product of all three is");
	}

}
