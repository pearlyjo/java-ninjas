
//Prints the below output
////5
////*0000*0000*
////0*000*000*0
////00*00*00*00
////000*0*0*000
////0000***0000

import java.util.Scanner;
public class zerosandstarspattern {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	 Scanner sc = new Scanner(System.in);
	      int num=sc.nextInt();
	      int number=2*num;
	      int i=0;
	        int x=number;
	      int c=0;
	      
	             

	      
	      while(i<num)

	      {
	        int j=number;
	        
	        int p=number-c;
	        int v=0;
	        
	      
	        while(j>=0)
	        {
	          if (j==(number/2)||((j==p)&&(j>number/2))||(j==i))
	          {
	            System.out.print("*");
	          }
	  
	          else
	          {
	          System.out.print(v);
	          }
	          
	          j-=1;
	          
	          
	        }
	        System.out.println();
	        i+=1;
	        c+=1;
	      }
		}	


	}


