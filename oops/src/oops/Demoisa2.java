package oops;
class A
{
	int x=10;
	public A()
	{
		System.out.println("i am in super default");
	}
}
class B extends A
{
	int x=20;
	public B()
	{
		System.out.println("i am in sub deafult");
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Demoisa2 {

	public static void main(String[] args) {
		
	B b=new B();

	}

}
