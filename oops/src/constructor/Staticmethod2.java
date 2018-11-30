package constructor;

public class Staticmethod2 {
	static int cube(int x)
	{
		return x*x*x;
	}
	public static void main( String[] args)
	{
		int result=Staticmethod2.cube(5);
		System.out.println(result); 
	}

}
