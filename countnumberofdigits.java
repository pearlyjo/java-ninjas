import java.util.Scanner;

public class countnumberofdigits {
    
	public static int count(int n){
		if(n==0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns+1;
	}

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the integer :");
	int input=scan.nextInt();
	int output = count(input);
	System.out.print("The number of  digits:" +output);

    }

}
