package constructor;

public class VarargsExample1 {
	
static void display(String...values)
{
	System.out.println("display method is invoked");
	for (String s:values)
{
	System.out.println(s);
}
}
	public static void main(String []args)
	{
		display();
		display("hello");
		display("hi","raj","kumar");
	}
}
