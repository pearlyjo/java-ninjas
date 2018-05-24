package Pattern;

import java.util.Scanner;


public class pattern {

    public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	
	// TODO Auto-generated method stub
	int i =s.nextInt();
	int j=0;
	int temp=1;
	while (j<=i)
	{
	    int m=1;
	   
	    while(m<=j)
	    {
		
		int n;
		System.out.print(temp);
		temp+=1;
		m+=1;
	    }
	    System.out.println();
	    j+=1;
	}

	

    }

}
