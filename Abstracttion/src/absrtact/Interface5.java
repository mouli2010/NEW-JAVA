package absrtact;
class Afive
{
	void m1()
	{
		System.out.println("m1-a");
	}
}
interface Ifive
{
	void m2();
}
class Bfive extends Afive implements Ifive
{
	public void m2()
	{
		System.out.println("m2-b");
	}
}
public interface Interface5 {
public static void main(String[] args) {
	Afive a=new Bfive();
	a.m1();
	Ifive i=new Bfive();
	i.m2();
	Bfive b=new Bfive();
	b.m1();
	b.m2();
}
}
