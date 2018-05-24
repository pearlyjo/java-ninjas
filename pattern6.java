package Pattern;   
import java.util.Scanner;



public class pattern6 {
   


     public static void main(String[] args) {
    	
    	Scanner s= new Scanner(System.in);
    	
    	// TODO Auto-generated method stub
    	int i =s.nextInt();
    	int j=1;
       int temp=1;
       
       
       
    	while (j<=i)
    	{
    	    
         	int m=1;
          int val=j;
          
          
    	   
    	    while(m<=j)
    	    {
         	
    		System.out.print(val);
              
             
              m+=1;
              val+=1;
        
    		
    		
    	    }
          
          
    	    System.out.println();
    	    j+=1;
    	}

    	

        }

    }


