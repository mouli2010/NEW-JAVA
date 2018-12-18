package absrtact;
interface Demoz
{
	int x=10;
	int add(int x,int y);
	default public void show()
	{
		System.out.println("hello i am in demoz deafult show");
	}
}
interface Demoy
{
	int x=20;
   void disp();
   
	default public void show()
	{
		System.out.println("hello i am in demoy deafult show");
	}
}
class DemoAimpl implements Demoz,Demoy
{

	@Override
	public void disp() {
	   System.out.println("hello i am in disp");
		
	}

	@Override
	public int add(int x, int y) {
		return x+y;

	}

	@Override
	public void show() {
		Demoz.super.show();
	}
	
}
public interface Demointerface3 {
public static void main(String[] args) {
	

	Demoz a=new DemoAimpl();
	Demoy b=(Demoy)a;
	int x=a.add(20, 30);
	System.out.println(x);
	a.show();
	b.disp();
	b.show();
	System.out.println(a.x);
	System.out.println(b.x);

}
}
