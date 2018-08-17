import java.util.*;
public class binarySearch {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int arr[]= {23,44,55,67,89,1010,13232};
	System.out.println("Enter Element to be binary searched");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int end=arr.length;
	int start=0;
	int count=0;
	int temp=n;
	
	
	
	while(start<end)
	    
	{
	    int midIndex=(end+start)/2;
	   // System.out.println(start);
	    if(arr[midIndex]==n)
	    {
		temp=arr[midIndex];
		count+=1;
		break;
		
		
	    }
	    else if(arr[midIndex]<n)
	    {
		start=midIndex+1;
		count=0;
	    }
	    else
	    {
		end=midIndex-1;
		count=0;
	    }
	
	    
	    
	    
	}
	if(count==1)
	{
	    System.out.println(temp  +"\t Element is present");
	}

	else
	{
	    System.out.println("Element not present in the array");
	}

    }

}
