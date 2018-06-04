import java.util.Scanner;
public class APSeries {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      
	  
	      int x=1;
	      
	      int count=0;
	      
	     for (x=0;x<=1000;x++)
	    
	     {
     
		 int m=(3*x)+2;
	       if((m%4==0)||(m<=2))
	       {
		   continue;
	       }
	       else if (m%4!=0) 
	       {
	
		   count+=1;
		   System.out.print(m);
		   System.out.print(" ");
      
	       
		   if (count==num)
    		   {
    		       break;
    		   }
	       	}  

	       
	      }
      
	     }
	      
	  
	      
		
	}
