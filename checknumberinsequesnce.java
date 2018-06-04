import java.util.Scanner;
public class checknumberinsequesnce {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	 
	      Scanner sc = new Scanner(System.in);
	      int num=sc.nextInt();
	      int c=0,temp=0;
	      int flag=1;
	      int val1=0;
	      
	      
	      while(c<num)
	      {
		  int r=0;
	        int val=sc.nextInt();
	         temp =val;
	         r = temp;
	         c+=1;
	     
	         System.out.print(r);
	        if ((temp>val)||(temp<val))
	        {
	          flag=0;
	        }
	        else
	        {
	          flag=1;
	        }
	        
	      }
		if (flag==0)
	    {
	      System.out.print("true");
	    }
	      else
	      {
	        System.out.print("False");
	      }
	      
		}
	}
