package Pattern;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

		
	     
		Scanner s= new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int i =s.nextInt();
		int j=1;
		int val=1;
		while (j<=i)
		{
		    int space=1;
		    while (space<=i-j)
		    {
			System.out.print("  ");
			space+=1;
				
		    }
		    int m=1;
		    while (m<=j)
		    {
			System.out.print(m);
			m+=1;
			val+=1;
		    }
		    
		    System.out.println();
		    j+=1;
		    
		}

		

	    }



    }

