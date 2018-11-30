package oopss;
class A3
{
	A3()
	{
		System.out.println("A-con");
	}
	int i=m1();
	{
		System.out.println("ib-a");
	}
	int m1()
	{
		System.out.println("m1-a");
		return 10;
	}
}
class B3 extends A3
{
	int m2()
	{
	System.out.println("m2-b");
	return 20;
	}
	B3()
	{
		
		System.out.println("b-con");
	}
	{
		System.out.println("ib-b");
	}
	int j=m2();
}
class C3 extends B3
{
	{
	System.out.println("ib-c");
}
int m3()
{
	System.out.println("m3-c");
	return 30;
}
int k=m3();
	C3()
	{
		System.out.println("C-con");
	}
}
public class Inheritence3 {

	public static void main(String[] args) {
		C3 c=new C3();

	}

}
