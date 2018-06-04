import java.util.Scanner;

public class decimaltobinary {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	long num=sc.nextInt();
	long digit =0;
	long n=0;
	long value=0;
	long product = 0;
	long decimal=0;
	while(num!=0)
	{
	    
	    digit=num%2;
	    value=(long) Math.pow(10,n);
	    product=value*digit;

	    
	    decimal+=product;
	    //stem.out.println(binary);
	    
            n++;
	    num=num/2;
	    
	}
	System.out.print(decimal);
    }
    



    }


