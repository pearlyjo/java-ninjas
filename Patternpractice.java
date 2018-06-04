////
////
////  *******
////   ******
////    *****
////     ****
////      ***
////       **
//        
package Pattern;

import java.util.Scanner;
public class Patternpractice {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	      int i=1;
	      
	      int b=0;
	      
	      while(i<=num)
	      {
		  int j=0,s=1;
		  while(s<=i)
		  {
		      System.out.print(" ");
		      s+=1;
		  }
	      
	        while(j<=num-i)
	        {
	          System.out.print("*");
	            
	            j+=1;
	          
	        }
	        System.out.println();
	        i+=1;
	       
	      }
	      

		}

	}

