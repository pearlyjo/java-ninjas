package JavaCompleteReference;

public class ObjectParameterUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using the constructors

		ObjectParameteraUse2 o1 =new ObjectParameteraUse2();
		ObjectParameteraUse2 o2 =new ObjectParameteraUse2(23,23,124);
		//Creating a copy of o2
		ObjectParameteraUse2 o3 =new ObjectParameteraUse2(o2);
		
		//getting the volume of all the 3 boxes
		o1.volume();
		o2.volume();
		o3.volume();
		
		
	}

}
