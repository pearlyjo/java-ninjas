package JavaCompleteReference;

public class OverLoadingConstructorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking all 3 overloaded constructors
		
		overLoadingConstructors c1= new overLoadingConstructors();
		overLoadingConstructors c2 = new overLoadingConstructors(324,13,43);
		overLoadingConstructors c3 = new overLoadingConstructors(34.24);
		
		//Volume of 1st box
		c1.Volume();
		//Volume of 2nd box
		c2.Volume();
		//Volume of 3rd box
		c3.Volume();

	}

}
