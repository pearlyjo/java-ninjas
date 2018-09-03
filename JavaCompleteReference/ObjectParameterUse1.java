package JavaCompleteReference;

public class ObjectParameterUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 objectAsParameter1 ob1= new  objectAsParameter1(4,2);
		 
		 objectAsParameter1 ob2 = new  objectAsParameter1(42,212);
		 objectAsParameter1 ob3 = new  objectAsParameter1(4,2);
		 
		 //Executing the methods with objects as the parameters!!
		 
		 boolean value=ob1.equalTo(ob2);
		 boolean value1=ob1.equalTo(ob3);
		 
		 System.out.println("ob1==ob2 "+value);
		 System.out.println("ob1==ob3 " +value1 );

	}

}
