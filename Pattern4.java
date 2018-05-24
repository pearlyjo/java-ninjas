//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//11
//202
//3003

package Pattern;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s= new Scanner(System.in);
	int rows = s.nextInt();
	
	int temp=0;
	int val=0;
	while (temp<=rows)
	{
	    int i =1;
	    int j =1;
	while (j<=temp)
	{
	    System.out.print(i+(i-j)*i+i);
	    j+=1;
	}
	
	System.out.println();
	temp+=1;
	}
	
	
    }

}
