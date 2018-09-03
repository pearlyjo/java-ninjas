package JavaCompleteReference;

class BoxUse
{
	int depth;
	int width;
	int breadth;
}

public class DeclaringObjects {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * To declare a object in two step process
		 * 
		 * 
		 * Declare reference to the objects
		 * allocates a box object.Mybox holds the reference to the object.
		 */
		
		BoxUse mybox3;
		mybox3 = new BoxUse();
		//Does not allocate memory for mybox4.mybox3 and mybox4 
		//refers to the same object.
		//any changes in mybox4 will reflect in mybox3 as well.
		
		BoxUse mybox4 = mybox3;
		//Hence prints the reference address
		
		//mybox4=mybox3;
		mybox3.width=0;
		mybox3.breadth=3;
		mybox4.width=1;
		mybox4.breadth=34;
		System.out.println(mybox3.width);
		System.out.println(mybox3.breadth);

	}

}
