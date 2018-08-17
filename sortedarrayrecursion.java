
public class sortedarrayrecursion {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	    
        int[] arr =new int[8];
          int a=0;
      
        for(int i =1;i<7;i++)
        {
           
          if((i%2!=0)&(i!=0))
          {
            i=arr[a];
           // System.out.print(i);
            
          }
       
          a++;
          System.out.print(arr[a]);
          
          

    }
       

}
}
