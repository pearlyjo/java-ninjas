import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
        int n =s.nextInt();
    	int i=1;
       int temp=1;
       
       
       
       
    	while (i<=n)
    	{
    	int space = 1;
    	    
          
          while (space<=n-i)
          {
          System.out.print(" ");
          space+=1;
         
          }
          int m=1;
          int val=i;
          
    	   
    	    while(m<=i)
    	    {
         	
    		System.out.print(val);
              
             
              m+=1;
              val+=1;
        
    		
    		
    	    }
          
          
    	    System.out.println();
    	    i+=1;
    	}

    	

        }

    }


