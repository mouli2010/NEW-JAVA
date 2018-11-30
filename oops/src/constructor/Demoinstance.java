package constructor;

import java.util.Scanner;

public class Demoinstance {
	public static void main(String ...args)
	{
		Scanner sc=new Scanner(System.in);
	 System.out.println("pls enter a num1");
	 int n=sc.nextInt();
	 System.out.println("pls enter a num2");
	 int n1=sc.nextInt();
		Add obj=new Add(n,n1);
		obj.add();
	}

}
class Add
{
	private int n;
	private int n1;
	Add()
	{
	}
	Add(int n,int n1)
	{
		this.n=n;
		this.n1=n1;
	}
	void add()
	{
		System.out.println("sum of n&n1 is:"+(n+n1));
	}
}
