package CoreJavaDay2;


	
	//Create a superClass
	
	class A{
		int i,j;
		
		void showij()
		{
			System.out.println("The values of i and j are: " +i +"  "+ +j);
		}
	}
	
	//Creating subclass extending A
	
	class B extends A{
		int k;
		void showk()
		{
		System.out.println("The value of i j and k is : " + i +" " +j+" "+k);
		System.out.println("The value of k is :  " +k);
		}
		
		void sum()
		{
			int r=i+j+k;
			
			System.out.println("The value of i j and k is : " + i +" " +j+" "+k);
			System.out.println("The sum is : " +r);
		}
	}
	
	public class Inheritance {
		
		public static void main(String [] args)
		{
			A superob1 = new A();
			B subob1 =new B();
			
			System.out.println("Contents of Super class A");
			superob1.i=23;
			superob1.j=232;
			
			superob1.showij();
			
			System.out.println("Contents of subclass B");
			
			subob1.k=5637;
			subob1.showk();
			subob1.i=34;
			subob1.j=343244;
			subob1.sum();
			
		}

}
