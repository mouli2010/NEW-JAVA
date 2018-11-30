package constructor;

public class Passbyref2 {
	public static void main(String []args)
	{
		Test t=new Test(20);
		Test t1=new Test(30);
		System.out.println(t.x+"\t"+t1.x);
		swap(t1);
		swap(t,t1);
		System.out.println(t.x+"\t"+t1.x);
	}
	static void swap(Test t)
	{
		t.x=50;
	}
 static void swap(Test t,Test t1)
 {
	 int temp=0 ;
	 temp=t.x;
	 t.x=t1.x;
	 t1.x=temp;
 }
}

class Test
{
	int x;
	public Test(int x)
	{
		this.x=x;
	}
}