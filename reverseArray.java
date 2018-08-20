
class reverseArray {
	
	public static void reverse(int[] nums)
	{
		int start=0;
		int value=0;
		
		int largest=nums.length-1;
		int a[]=new int[largest-1];
while(start<largest)
{
	value=nums[start];
	nums[start]=nums[largest];
	nums[largest]=value;
	start++;
	largest--;
}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputOutput k= new inputOutput();
		int ar[]=k.input();
		reverse(ar);
		
		System.out.println("The Reversed Array is:");
		k.output(ar);

	}

}
