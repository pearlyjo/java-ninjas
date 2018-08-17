
public class factorial {
    
    public static long fact(long n)
    {
	
	if (n==0)
	{
	    return 1;
	}
	else
	{
	long r= fact(n-1);
	System.out.println(n);
	return n*r;
	}

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	long n =5;
	long ans=fact(n);
	System.out.println(ans);
	
	
	
    }

}
