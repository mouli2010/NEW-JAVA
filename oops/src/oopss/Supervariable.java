package oopss;
class A4
{
	int i=10;
	int j=20;
	
}
class B4 extends A4
{
	int i=100;
	int j=200;
	B4(int i,int j)
	{
		System.out.println(i+" "+j);
		System.out.println(this.i+" "+this.j);
		System.out.println(super.i+"  "+super.j);
	}
}
public class Supervariable {

	public static void main(String[] args) {
		B4 b=new B4(50,60);

	}

}
