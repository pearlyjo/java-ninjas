import java.util.Scanner;
public class howarraysarestored {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	

	System.out.print("Enter the size of array");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	long [] arr=new long[n];
	
	for (int i =0;i<arr.length;i++)
	{
	    arr[i]=i;
	    System.out.println(arr);
	}
    }

}
