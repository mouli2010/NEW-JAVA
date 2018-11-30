package constructor;

public class A1 {
	static int i=10;
	int j=20;
	void m1()
	{
		System.out.println("m1-a");
	}
	public static void main(String[] args)
	{
		System.out.println(A1.i);
		A1 a=null;
		System.out.println(a.i);
		System.out.println(a.j);
		A1 a1=new A1();
		System.out.println(a1.i);
		System.out.println(a1.j);
	}

}
