package oopss;
class A6{
	void m1()
	{
		System.out.println("m1-a");
	}
}
class B6 extends A6
{
	void m2()
	{
		System.out.println("m2-b");
		m1();
		this.m1();
		super.m1();
	}
	void m1()
	{
		System.out.println("m1-b");
	}
}
public class Supermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B6 b=new B6();
		b.m2();
	}

}
