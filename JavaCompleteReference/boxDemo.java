package JavaCompleteReference;

public class boxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		box3 mybox5=new box3();
		box3 mybox6 = new box3();
		//Creating the object with reference to class box3.
		mybox5.width=9;
		mybox5.depth=100;
		mybox5.heigth=9;
		

		mybox6.width=94;
		mybox6.depth=120;
		mybox6.heigth=49;
		
		//Display the volume of the 1st and 2nd box .
		
		double value1=mybox5.volume();
		double value2=mybox6.volume();
		
		System.out.println("The Volume of 1st box is: " +value1);
		
		System.out.println("The Volume of 2nd box is :" +value2);

	}

}
