//Problem
//Arrange Numbers in Array
//Send Feedback
//Given a number n, put all elements from 1 to n in an 
//array in order - 1,3,.......4,2.
//Input Format :
// Integer n
//Output Format :
// Elements of the array separated by space.
//Sample Input 1 :
//6
//Sample Output 1 :
// 1 3 5 6 4 2
//Sample Input 2 :
//9
//Sample Output 2 :
// 1 3 5 7 9 8 6 4 2

import java.util.Scanner;
public class array {
 

    public static void main(String[] args){
	// TODO Auto-generated method stub
	Scanner sc=new Scanner (System.in);
	int n = sc.nextInt();
	int[] arr=new int[n];
	int i=0,j=n-1;
	int num =1;
	while(i<j)
	{
	    arr[i]=num;
	    i++;
	    num++;
	    arr[j]=num;
	    num++;
	    j--;
	    
	}
	if(i==j)
	{
	    arr[i]=num;
	}
	
	for (int x=0;x<arr.length;x++)
	{
	    System.out.print(arr[x] + "  ");
	    
	    
	}
    }
}
