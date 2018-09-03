/**
 * Demonstrates method overloading
 */
package JavaCompleteReference;

public class methodOverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloading m1 =new methodOverloading();
		
		m1.test();
//Invoking first method		
		int y=m1.test(323);
		
		//invoking calling the method .even if the method is overloaded!!
		System.out.println("The value of y is" +y);
		
		int x=m1.test(21,12);
		
		System.out.println(x);
		
		double n=90.0;
		
		double g= m1.test(n);
		System.out.println(g);
		
		int k=m1.test(56,455 , 899);
		System.out.println(k);
		
	}


}
