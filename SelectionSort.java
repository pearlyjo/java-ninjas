import java.util.Scanner;
public class SelectionSort {
	
	public static void SelectionSorting(int[] nums)
	{
		int Value=0;
		int smallestValue=0;
	
		
		for(int j=0;j<nums.length-1;j++)
		{
		
			for(int i=j+1;i<nums.length;i++)
			{
				if(nums[j]>nums[i])
				{
					smallestValue =nums[j];
					nums[j]=nums[i];
					nums[i]=smallestValue;
			
					//System.out.println(smallestValue)				
				}
			}
				
				
			
				
				
		}
			
		
		
		
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputOutput im= new inputOutput();
		int arr[]=im.input();
		SelectionSorting(arr);
		System.out.println("The Selection Sorted Array is:");
		 im.output(arr);
		 
		
		

	}

	

}
