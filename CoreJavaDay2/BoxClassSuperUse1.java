package CoreJavaDay2;

public class BoxClassSuperUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tofindBoxWeight mybox1= new tofindBoxWeight(23,2,2,3);
		
		tofindBoxWeight mybox2 =new tofindBoxWeight(3,23,4,1);
		tofindBoxWeight mybox3=new tofindBoxWeight();
		tofindBoxWeight mybox4 =new tofindBoxWeight(3,12);
		tofindBoxWeight myclone =new tofindBoxWeight(mybox1);
		
		double volume;
		
		
		tofindBoxWeight mybox12 =new tofindBoxWeight(3,2,24,11);
		tofindBoxWeight mybox13=new tofindBoxWeight();
		tofindBoxWeight mybox14 =new tofindBoxWeight(13,11);
		tofindBoxWeight myclone1 =new tofindBoxWeight(mybox12);
		
		 mybox12.volume();
		 mybox14.volume();
		 
		 
	}

}
