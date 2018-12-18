package absrtact;
interface A3
{
	void m1();
	void m2();
	void m3();
	void m4();
}
abstract class B3 implements A3
{
	public void m1()
	{
		System.out.println("m1-a");
	}
}
class M extends B3 
{
	public void m2(){
		System.out.println("m2-a");
	}
	public void m3(){
		System.out.println("m3-a");
	}
	public void m4(){
		System.out.println("m4-a");
	}
}
public interface Demointerface2 {
	public static void main(String[] args) {
		A3 a=new M();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		
	}

}
