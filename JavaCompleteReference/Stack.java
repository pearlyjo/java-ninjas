package JavaCompleteReference;

public class Stack {
	
	int stk[] =new int[1000];
	int tos;
	
	//initialize top of stack
	
	Stack()
	{
		tos=-1;
	}
	
	void push(int item)
	{
		if(tos==999)
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
		if(tos<0)
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		else
		{
			return stk[tos--];
		}
		
	}

}
