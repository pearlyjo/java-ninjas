import java.util.Scanner;

public class binarydecimalconversion {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int digit =0;
	int n=0;
	int value=0;
	int sum = 0,binary=0;
	while(num!=0)
	{
	    
	    digit=num%10;
	    value=(int) Math.pow(2,n);
	    sum=value*digit;
	    
	    binary+=sum;
	    
            n++;
	    num=num/10;
	    
	}
	System.out.print(binary);
    }
    

}
