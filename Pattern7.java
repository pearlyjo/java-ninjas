//Pattern7
//12345
//1234
//123
//12
//1
package Pattern;
import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in);
    	
    	// TODO Auto-generated method stub
    	int num =s.nextInt();
    	int i =1;
        
    	while (num>=i)
    	    
    	{
    	    int j=num;
    	    while (j<=i)
    	    {
    	    System.out.print(num);
    	    j+=1;
    	    }
    	    num-=1;
    	System.out.println();
    	    
    	}
	
	// TODO Auto-generated method stub

    }

}
