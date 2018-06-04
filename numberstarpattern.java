
import java.util.Scanner;
public class numberstarpattern {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	 Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      
	      int i=1;
	      
	      
	      while(i<=num)
	      {
	        
	        int j=num;
	        int c=0;
	        while (j>=1)
	        {
	          
	            if (j==i)
	            {
	              System.out.print("*");
	            }
	          else{
	            System.out.print(j);
	          }
	          j-=1;
	        }
	        System.out.println();
	        i+=1;
	      }
		}
	}
