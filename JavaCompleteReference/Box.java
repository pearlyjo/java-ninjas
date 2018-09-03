/**
 * Program that uses Box Class.
 * 
 */
package JavaCompleteReference;



	class Box1
	{
		int width;
		int height;
		int depth;
	}
	public class Box {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creating Object mybox
		 */
		Box1 mybox=new Box1();
		
		/**
		 * Creating a new Box2
		 */
		Box1 mybox1 = new Box1();
		
		mybox.width=112;
		mybox.depth=100;
		mybox.height=110;
		
		mybox1.width=12;
		mybox1.depth=10;
		mybox1.height=10;
		/**
		 * Computing the two volumes of both boxes
		 */
		double Volume=mybox.width*mybox.depth*	mybox.height;
		double Volume2=mybox1.width*mybox1.depth*mybox1.height;
		
		/*
		 * Displaying output and mybox1 and mybox
		 */
		
		System.out.println("Volume of the box is " +Volume);
		System.out.println("Volume of the box is " +Volume2);
		System.out.println("address of mybox " +mybox);
		System.out.println("address of mybox is " +mybox1);
		
		
		
		

	}

}
