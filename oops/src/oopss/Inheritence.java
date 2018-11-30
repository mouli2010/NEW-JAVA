package oopss;
class A
{
	int i=10;
	void m1()
	{
		System.out.println("m1.a");
		
	}
}
class B extends A
{
	int j=20;
	void m2()
	{
		System.out.println("m2.b");
		System.out.println(i);
	}
}
public class Inheritence {

	public static void main(String[] args) {
		
A a=new A();
System.out.println(a.i);
a.m1();
B b=new B();
System.out.println(b.i);
System.out.println(b.j);
b.m1();
b.m2();
	}

}
