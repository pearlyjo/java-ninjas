package CoreJavaDay2;

public class InheritanceBoxExampleSubclass extends InheritanceBoxExample {

	double weight;
	//constructor for box weight
	
	InheritanceBoxExampleSubclass(int w,int d,int h,int we)
	{
		width=w;
		depth=d;
		height=h;
	    weight=we;
	}
	void sum()
	{
		System.out.println(+width +depth +height +weight);
	}

}
