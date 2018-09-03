/**
 * 
 */
package CoreJavaDay3;

/**
 * @author Dell
 *
 */
public class stringHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chars[]= {'a','A','B','b','c','C'};
		String str= new String(chars);
		System.out.println(str);
		System.out.println(str.length());
		
		//creating string objects giving the name
		String str1= new String(chars,2,4);
		
		System.out.println(str1);
		System.out.println(str1.length());
		//Creating String giving object string as a parameter
		String str2= new String(str);
		
		System.out.println(str2);
		System.out.println(str2.length());
		byte ascii[]= {65,66,67,68,69,33,34,1,3,4,109,23,101};
		
		String s=new String(ascii);
		System.out.println(s);
		
		//Creating String using String Literal
		
		String value="JAVA Programming";
		System.out.println(value);
		
		System.out.println(value.length()-1);
		
		   int size=value.length()-1;
	        for(int i =0;i<size-4;i++)
	        {
	         value="#";
	        }
		
	        System.out.println(value);
		
		

	}

}
