
public class arrayisstored {
    
    public static void increment(int nums[])
    {
	nums=new int[5];
	for(int i=0;i<nums.length;i++)
	{
	    nums[i]++;
	    System.out.print(nums);
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int arr[]= {3,23,4,13,4,233};
	increment(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr);
}
}

}
