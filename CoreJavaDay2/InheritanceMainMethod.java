package CoreJavaDay2;
/**
 * Demonstrates the use of inhertance of the two classes writteb earliar
 * @author Dell
 *
 */

public class InheritanceMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceBoxExample objsuper = new InheritanceBoxExample();
		
		InheritanceBoxExample objsuper1 = new InheritanceBoxExample(34);
		
		InheritanceBoxExample objsuper2 = new InheritanceBoxExample(34,23,4);
		
		InheritanceBoxExampleSubclass objsub1 = new InheritanceBoxExampleSubclass(34,23,34,4);
		
		InheritanceBoxExampleSubclass objsub2 =new InheritanceBoxExampleSubclass(22,2,4,23);

		//using methods of the super class
		
		double value=objsub1.volume();
		System.out.println("The value is " +value);
		System.out.println("The weight of my box is " +objsub1.weight);
		
		//using methods of the super class
		double value2=objsub2.volume();
		System.out.println("The value is " +value2);
		System.out.println("The weight of my box is " +objsub2.weight);
		

		double value4=objsuper.volume();
		objsub1.sum();
		System.out.println("The value is " +value4);
		
		
		//objsuper2=objsub2;
		System.out.println(objsuper2);
		System.out.println(objsub2);
		}

}
