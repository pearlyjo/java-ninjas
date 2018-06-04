////Write a program that asks the user for a number N and
//a choice C. And then give him the possibility to choose 
//between computing the sum and computing the product of 1 ,..., N.
////If user enters C is equal to -
//// 1 : Print sum of 1 to N numbers
//// 2 : Print product of 1 to N numbers
//// Any other number : print -1

import java.util.Scanner;
public class productsum {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	      int num=sc.nextInt();
	      int choice = sc.nextInt();
	      int temp=0;
	      int temp1=1;
	        int sum=0;
	      int product=1;
	        if (choice==1){
	          while (temp<=num)
	          {
	            sum+=temp;
	            temp++;
	          }
	          System.out.println(sum);
	        }
	      else if(choice==2)
	      {
	         while (temp1<=num)
	          {
	            product*=temp1;
	            //System.out.print(product);
	            temp1++;
	          }
	         System.out.println(product);
	        }
	      else{
	        System.out.println("-1");
	      }
	      }

		}


