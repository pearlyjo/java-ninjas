import java.util.Scanner;
public class finduniquelement {
    
    public static void main(String[] args) {
    
    
    Scanner sc=new Scanner (System.in);
  int x = sc.nextInt();
  int [] arr=new int[x];
  int count =0;
  int y=0;
  
  for (int m=0;m<x;m++)
  {
      int c= sc.nextInt();
      arr[m]=c;
      //System.out.print(arr[m]);
  }
    
  int n =0;
  
  int i =0;
  while(i<(arr.length/2))
  {
     
      int temp=0;
    for (int j=i+1;j<arr.length;j++)
    {
   
      if(arr[i]!=arr[j])
      {
      y=1;
      }
  
      else
      {
	  y=0;
	  break;
      }
    }
    if(y==1) 
    {
        count++;
        System.out.print(arr[i]+" ");
    }

    i++;
    
  }

  
  
  


    }
   
 }


