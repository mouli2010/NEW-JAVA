package absrtact;
class A4
{
	void m1()
	{
		System.out.println("m1-a");
	}
}
abstract class B4 extends A4
{
	abstract void m2();
	
}
class C4 extends B4
{
	void m2()
	{
		System.out.println("m2-c");
	}
}
public class Abstract4 {

	public static void main(String[] args) {
	A4 a=new C4();
	a.m1();
	B4 b=new C4();
	b.m1();
	b.m2();
    

	}

}
