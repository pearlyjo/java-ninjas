
public class sumofnnumbers {
    
    
    public static int sum(int n){
	
	if (n==1)
	{
	    return 1;
	}
	else
	{
	    int ans=sum(n-1);
	    //System.out.print(n);
	    return (ans+n);
	}
	
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	
	System.out.println(sum(4));
    }

}
