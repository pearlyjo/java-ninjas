
import java.util.Scanner;
public class celciustofahrenheit {

    public static void main(String[] args) {
	
   	Scanner s = new Scanner(System.in);
	int f = s.nextInt();
	int e = s.nextInt();
	int w = s.nextInt();
	int temp =0;
	while (f <=e)
      {
	    temp=w;
	    
	    int cel = (5*(f-32))/9;
	    System.out.print("\n" + f +"\t" + cel);
	    f+=temp;
        
      }
      
	

    }

}
