import java.util.Scanner;
public class lowercaseorupper {
    public static void main(String[] arg)
    {
	Scanner s = new Scanner(System.in);
	String str = s.next();
	char c = str.charAt(0);
	int i = c;
	
	
	if ((i >=97) && (i<=122))
	{
	    System.out.println("0");
	    
	}
	
	else if ((i>=65) && (i<=90))
	{
	    System.out.println("1");
	
	}
	else
	{
	    System.out.println("-1");
	}
	
    }

}
