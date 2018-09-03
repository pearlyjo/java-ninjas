package JavaCompleteReference;

public class stackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1= new Stack();
		Stack s2=new Stack();
		System.out.println("Stack Use:My Stack1");
		for(int i=0;i<10;i++)
		{
			s1.push(i);
		}
		for(int i=30;i<50;i++)
		{
			s2.push(i);
		}

		//POP numbers from the class
		
		for(int i=0;i<10;i++)
		{
			int x=s1.pop();
			
			System.out.println(x);
			
		}
		System.out.println();
		System.out.println("Stack Use:My Stack2");
		
		for(int i=0;i<=20;i++)
		{
			int y=s2.pop();
			System.out.println(y);
			
		}
		
	
	}

}
