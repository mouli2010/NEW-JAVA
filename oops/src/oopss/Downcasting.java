package oopss;
class Super
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
class Sub extends Super
{
	public void show()
	{
		System.out.println("i am in sub show");
	}
	public void disp()
	{
		System.out.println("i am in sub disp");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		
		Super a=new Sub();
        Sub b =(Sub)a;
        b.disp();
       b.show();
      a.showone();
	}

}
