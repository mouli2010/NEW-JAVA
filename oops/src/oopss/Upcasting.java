 package oopss;
class Aone
{
	public void showone()
	{
		System.out.println("i am in super show one");
	}
	public void disp()
	{
		System.out.println("i am in super disp");
	}
}
class Btwo extends Aone
{
	public void show()
	{
		System.out.println("i am in sub show");
		
	}
	@Override
	public void disp(){
		
		System.out.println(" i am in sub disp");
	
		
	}
}
public class Upcasting {

	public static void main(String[] args) {
		Aone a=new Btwo();
		a.disp();
		a.showone();
	new Btwo().disp();
	new Btwo().showone();

	}

}
