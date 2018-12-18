package absrtact;
interface I1
{
	void m1();
}
interface I2
{
	void m2();
}
interface I3
{
	void m3();
}
class Athree implements I1,I2,I3
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
public interface Interface3 {
	public static void main(String[] args) {
	I1 i1=new Athree();
	i1.m1();
	I2 i2=new Athree();
	i2.m2();
	I3 i3=new Athree();
	i3.m3();
	}
}
