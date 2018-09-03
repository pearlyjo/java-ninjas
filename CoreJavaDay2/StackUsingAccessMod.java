package CoreJavaDay2;

public class StackUsingAccessMod {
	/**
	 * Both the stk and tos is private this means this cannot be altered
	 * accidently.
	 */
	
	private int stk[];
	private int tos=-1;
	
	//Initializing the stack
	StackUsingAccessMod(int size)
	{
		stk=new int[size];
		tos=-1;	
	}
	//Enter elements into the stack
	void push(int item)
	{
	if(tos>stk.length)
	{
		System.out.println("Stack is full");
	}
	else
	{
		 stk[++tos]=item;
	}
	}
	int pop()
	{
		//Pop item from the stack
		if(tos<0) {
			System.out.println("Stack is underfull");
			return 0;
		}
		else
		{
			return stk[tos--];
		}
		
	}
	void print()
	{
		for (int i =0;i<stk.length;i++)
		{
			System.out.println(stk[i]);
		}
	}

}
