//pROGRAM TO FIND THE BELOW PATTERN
//
//7
//1234567
//123456
//12345
//1234
//123
//12
//1
package Pattern;
import java.util.Scanner;
public class pattern02 {

    public static void main(String[] args) {
	// Write your code here

Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
int i=1;
while(i<=num)
{
int h=num;
int val=1;
while(h>=i)
{
  System.out.print(val);
  h-=1;
  val+=1;
}
i+=1;
System.out.println();
}

}
}

