package oopss;
class A2
{
	static 
	{
		System.out.println("sb-a");
	}
	static int i=m1();
	static int m1()
	{
		System.out.println("m1-a");
		return 10;
	}
}
class B2 extends A2
{
	static int j=m2();
	static 
	{
		System.out.println("sb-b");
	}
	static int m2()
	{
		System.out.println("m2-b");
		return 20;
	}
	
}
class C2 extends B2
{
static int m3()
{
	System.out.println("m3-c");
	return 30;
}
static 
{
	System.out.println("sb-c");
	
}
static int k=m3();
}
public class Inheritence2 {

	public static void main(String[] args) {
		C2 c=new C2();

	}

}
