package oopss;
class A1
{
	static
	{
		System.out.println("sb-a");
	}
}
class B1 extends A1
{
	static {
		System.out.println("sb-b");
		
	}

}
class C extends B1
{
	static 
	{
		System.out.println("sb-c");
	}
}
public class Inheritence1 {

	public static void main(String[] args) {
		C c=new C();

	}

}
