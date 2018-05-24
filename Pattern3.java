//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//11
//111
//1111

package Pattern;
import java.util.Scanner;


public class Pattern3 extends Pattern2 {

    public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	int rows = s.nextInt();
	int temp=0;
	while (temp<=rows)
	{
	    int i =1;
	    int j =1;
	while (j<=temp)
	{
	    System.out.print(i);
	    j+=1;
	}
	
	System.out.println();
	temp+=1;
	}
	// TODO Auto-generated method stub
	
    }

}
