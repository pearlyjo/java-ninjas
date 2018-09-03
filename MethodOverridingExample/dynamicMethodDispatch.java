package MethodOverridingExample;


class A
{
	void callme()
	{
		System.out.println("Inside Class A's");
	}
}

class B extends  A
{
	//Overriding Class A's ethos
	void callme()
	{
		System.out.println("Inside Class B's");
	}
}

class C extends B
{
	//Overriding class B's method
	void callme()
	{
		System.out.println("Inside Class C's");
	}
}
public class dynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating 3 objects for a b and c
		A a = new A();
		B b =new B();
		C c = new C();
		
		//creating r of type A as its a super class.This  is an example hw java implements run time polymorphism.
		A r;
		r=a;
		r.callme();//Calls A's version
		
		r=b;
		r.callme();//Calls B's version
		
		r=c;
		r.callme();//Calls C's version

	}

}
