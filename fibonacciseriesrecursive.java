import java.util.Scanner;

public class fibonacciseriesrecursive {

    public static int nthfibonaccinumber(int n)
    {
	if((n==0)||(n==1))
	{
	    return n;
	}
	return nthfibonaccinumber(n-1)+nthfibonaccinumber(n-2);
	
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the integer:");
	int input=scan.nextInt();
	int nth=nthfibonaccinumber(input);
	System.out.println("Nth fibonacci number is:" +nth );
	

    }

}
