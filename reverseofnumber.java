import java.util.Scanner;

public class reverseofnumber {

    public static void main(String[] args) {
	// TODO Auto-generated method stub


	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int digit=0;
      int flag=1;
	while(num!=0)
	{
	   digit=num%10;
	    
         
         
	    System.out.print(digit);
	       if (digit==num)
	       {
	 	  System.out.print(num);
	       }
  
      num=num/10;
      else if(digit==0)
      {
	  
      }
      
      
	}
      if (digit==0)
      {
        System.out.print(0);
      }

    
    }

}
