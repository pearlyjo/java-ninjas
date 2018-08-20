import java.util.Scanner;

public class inputOutput {
	
	public static int[] input()
	{
	
	System.out.println("Please enter the size of the array");
	Scanner sc= new Scanner (System.in);
	int size=sc.nextInt();
	
	System.out.println("Enter the array to be sorted");
	
	int arr[]=new int[size];
	for(int k=0;k<size;k++)
	{
		arr[k]=sc.nextInt();
	}
	return arr;
	}
	
	public static void output(int [] nums)

	{
		
		for (int n=0;n<nums.length;n++)
		{
			System.out.print(nums[n] + " ");
		}
	}
	
	
	
	// TODO Auto-generated method stub

}

