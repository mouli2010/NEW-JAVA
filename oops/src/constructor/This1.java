package constructor;

public class This1 
{
	void m()
	{
		System.out.println("hello m");
		}  
	void n()
	{  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}  
	 
	public static void main(String args[])
	{  
		This1 a=new This1();  
		a.n();  
	}
}


