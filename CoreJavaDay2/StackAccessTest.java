package CoreJavaDay2;

/**
 * Uses access modifiers and demonstrate the
 * use to create stacks with length;
 * @author Dell
 */
public class StackAccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingAccessMod stack=new StackUsingAccessMod(11);
		StackUsingAccessMod stack2=new StackUsingAccessMod(6);
		
		for(int i=1;i<10;i++)
		{			
		stack.push(i);
		}
		for(int i=55;i<60;i++)
		{			
		stack2.push(i);
		}
		
		//Creaing stack with dynamic lenght
		
		System.out.println("Elements of stack 1");
		System.out.println();
		for(int j=0;j<9;j++)
		{
			System.out.println(stack.pop());
		}
		System.out.println();
		System.out.println("Elements of stack 2");
		System.out.println();

		for(int j=11;j<16;j++)
		{
			System.out.println(stack2.pop());
			
		}
		
		
		
	}

}
