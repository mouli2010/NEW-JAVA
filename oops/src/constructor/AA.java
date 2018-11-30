package constructor;

public class AA {
	AA getref()
	{
		return new AA();
	}
	AA getref1()
	{
		return this;
	}
public static void main(String []args)
{
AA a=new AA();
System.out.println(a);
System.out.println();
System.out.println(a.getref());
System.out.println(a.getref());
System.out.println(a.getref());
System.out.println();
System.out.println(a.getref1());
System.out.println(a.getref1());
System.out.println(a.getref1());
}
}
