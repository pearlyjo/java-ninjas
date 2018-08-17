import java.util.Scanner;
public class printnnumbers {
    
    static int x=0;
    public static int printy(int n)
    {
	
	if(n==1){
	    System.out.print(n + " ");
	    return 1;
	}
	x=printy(n - 1);
	System.out.print(n + " ");
	return x;
	

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the integer to be printed:");
	int input=scan.nextInt();
	printy(input);
	
    }

}
