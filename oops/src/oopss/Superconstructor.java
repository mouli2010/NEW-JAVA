package oopss;
class A5
{
	A5()
	{
		System.out.println("a -con");
	}
	A5(int i)
	{
		System.out.println("parameter constructor");
	}
}
class B5 extends A5
{
	B5()
	{  
		super(10);
		System.out.println("b -con");
	}

}
public class Superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B5 b=new B5();
	}

}
