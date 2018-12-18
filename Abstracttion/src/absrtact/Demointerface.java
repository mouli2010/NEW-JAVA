package absrtact;
interface I
{
	int a=10;
	void m1();
	void m2();
	void m3();
}
class  A1 implements I
{
	public void m1()
	{
		System.out.println("m1-a");
	}
	public void m2()
	{
		System.out.println("m2-a");
	}
	public void m3()
	{
		System.out.println("m3-a");
	}
	public void m4()
	{
		System.out.println("m4-a");
	}
}
public interface Demointerface {
	public static void main(String[] args) {
		I i=new A1();
		System.out.println(i.a);
		System.out.println(I.a);
		System.out.println(A1.a);
		i.m1();
		i.m2();
		i.m3();
		A1 a=new A1();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		
		
	}

}
