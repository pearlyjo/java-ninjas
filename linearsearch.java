import java.util.Scanner;
public class linearsearch {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
int arr[]= {32,4234,1,34,5,13,534,5234,24};
Scanner sc = new Scanner(System.in);
int count=0;
System.out.println("Enter the element to be searched:");
	int n =sc.nextInt();
	
	for (int i=0;i<arr.length;i++)
	{
	    if(arr[i]==n)
	    {
		count+=1;
		
	    }
	 
	}
	if(count==1)
	{
	    System.out.println("Element is present in the array!!");
	}
	else
	{
	    System.out.println("Element not present in the array!!");
	}

    }

}
