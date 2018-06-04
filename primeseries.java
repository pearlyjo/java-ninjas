import java.util.Scanner;
public class primeseries {

    public static void main(String[] args) {
	// TODO Auto-generated method stub



	Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int flag=0;
for(int i=2;i<=num;i++)
{
for(int j=2;j<i;j++)
{
   
    
 if (i%j==0)
 {
   flag=1;
   break;
 }
 else
 {
   flag=0;
 }
}


if (flag==0)
{
System.out.println(i);
}
}
}
}