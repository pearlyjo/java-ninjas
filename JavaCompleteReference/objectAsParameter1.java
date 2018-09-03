package JavaCompleteReference;

public class objectAsParameter1 {
	
	int a;
	int b;
	
	
	 objectAsParameter1(int x,int y)
	 {
		 a=x;
		 b=y;
		 
	 }
	//Passing Object as  parameter
	
	
	
	boolean equalTo(objectAsParameter1 o1)
	{
		if(o1.a==a && o1.b==b)
			{return true;}
		
		else  {return false;}
		
	}

}
