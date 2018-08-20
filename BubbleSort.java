import java.util.Scanner;

public class BubbleSort {
	
	public static void BubbleSorting(int[] nums)
	{
		int smallestValue=0;
		int min=1;
		int leng=nums.length;
		
		for (int i=0;i<leng-1;i++)
		{
			
			for(int j=0;j<leng-1;j++)
			{
				if(nums[j]>nums[j+1])

				{
//					System.out.print(nums[j]);
					smallestValue=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=smallestValue;
					
					
				}
				
			
				
			}
			}
		}
	
		
		
			


	public static void main(String[] args) {
	inputOutput ix= new inputOutput();
	int arr[]=ix.input();
	BubbleSorting(arr);
	
	System.out.println("The Bubble Sorted Array is:");
	 ix.output(arr);
	

	}

}
