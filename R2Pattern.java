//R2 -- PATTERN
//Take as input N, a number. Print the pattern like this.
//
//for N = 5
//
//5
//
//3
//
//1
//
//2
//
//4
package Pattern;
import java.util.Scanner;

public class R2Pattern {

    public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int x=num,y=1;
	while(x>=0)
	{
	    if (x%2!=0)
	    {
		System.out.println(x);
	    }
	    
	    
	    x--;
	    
	}
	
	while(y<=num)
	{
	    if (y%2==0)
	    {
		System.out.println(y);
	    }
	    y+=1;
	
    }

}
}
