package absrtact;
interface Ione
{
	void m1();
}
interface Itwo
{
	void m2();
}

interface Ithre extends Ione,Itwo
{
	void m3();
}
class Athre implements Ithre
{
	public void m1()
	{
		System.out.println("m1-a");
	}
	public void m2()
	{
		System.out.println("m2-a");
	}
	
	public void m3(){
		System.out.println("m3-a");
	}
}
public interface Interface4 {
	public static void main(String[] args) {
		
	
	Ione i1=new Athre();
	i1.m1();
	Itwo i2=new Athre();
	i2.m2();
	Ithre i3=new Athre();
	i3.m1();
	i3.m2();
	i3.m3();
	}

}
