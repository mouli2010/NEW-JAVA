package constructor;

public class This2 
{
	This2()
	{
		System.out.println("hello a");
		}  
	This2(int x)
	{  
	this();  
	System.out.println(x);  
	}  
	 
	public static void main(String args[])
	{  
		This2 a=new This2(10);  
	}

}
