import java.util.Scanner;

public class integralsquareroot {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int i=1,j=0;
	int x=0;
	int r=0;
	int v =(int)Math.sqrt(num);
	System.out.println(v);
	
	
	while(x<=num)
	{
	    int mid = (x+num)/2;
	    System.out.print(mid);
	   
	    int value =mid*mid;
	    System.out.print(value);
	    if (value==num)
	    {
		System.out.println(value);
		break;
	    }
	     if(num>value)
	    {
		x =mid+1;
		r=mid;
	
		
	    }
	    else
	    {
		num=mid-1;
		
	    }
	    
	}
    }
}

