
//Calculate Power
//Send Feedback
//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
//Do this recursively.

public class power {
    
    public static int power1(int x, int n) {
	       
	
	      if (n==0)
	      {
	        return 1;
	      }
	      else
	      {
	        n=n-1;
	        return x*power1(x,n);
	      }
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
System.out.println(power1(3,4));
    }

}
