//Passing object as an argument

package JavaCompleteReference;

class test2{
	int i;
	int j;
	test2(int a,int b)
	{
		i=a;
		j=b;
		
	}
	void func(test2 ob1)
	{
		ob1.i*=10;
		ob1.j/=10;
	}
}
public class CallbyReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		test2 o1=new test2(423,12);
		test2 o2=new test2(34,23);
		
System.out.println("Value of a and b before passing "+o2.i+" "  +o2.j);
		
o1.func(o2);
		System.out.println("Value of a and b after passing "+o2.i+" "  +o2.j);
		

		
	
		
		

	}

}
