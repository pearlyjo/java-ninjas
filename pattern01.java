package Pattern;
import java.util.Scanner;
public class pattern01 {
  //Program for this below
  //1
  //11
  //121
  //1221
  //12221
public static void main(String[] args) {
  	// TODO Auto-generated method stub

  	// Write your code here
          Scanner sc = new Scanner(System.in);
          int num=sc.nextInt();
        	int i =1;
          int g =1;
        int f=2;
          while(i<=num)
          {
            int h=1;
            while(h<=i)
            {
              if ((i==1) || (i==2))
              {
                System.out.print(g);
              }
              else if (i>2)
              {
                if ((h==1)||(h==i))
                {
                  System.out.print(g);
                }
                else{
                  System.out.print(f);
                }
              }
                   
              h+=1;
            }
            System.out.println();
            i+=1;
          }
  	}
  }



