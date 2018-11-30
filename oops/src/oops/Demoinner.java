package oops;

public class Demoinner {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.docheck();
		//Outer.inner in=o.new inner();
	

	}

}
class Outer
{
	int x;
	public void disp()
	{
		
	}
	public void docheck()
	{
		inner obj=new inner();
		obj.disp();
	}
	class inner{
		int x=20;
		public void disp()
		{
			System.out.println(x);
			System.out.println(Outer.this.x);
		}
	}
}