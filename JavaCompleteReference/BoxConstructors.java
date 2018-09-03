package JavaCompleteReference;

class ConstructorBox
{
	int width;
	int height;
	int depth;
	
	//creating a constructor.Constructor should have the same name as that of the 
	//class.
	int count=1;
	ConstructorBox()
	{
		System.out.println("Constructing a Box" +count);
		width=10;
		depth=10;
		height=120;
		count++;
	}
	void volume()
	{
		System.out.println("The Volume is : " +width*height*depth);
	}
}

public class BoxConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorBox b1= new ConstructorBox();
		ConstructorBox b2 = new ConstructorBox();
		
//		System.out.println(b2);
//		
		b1.volume();
		b2.volume();

	}

}
