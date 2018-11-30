package strings;
class Myclass
{
	int x;
	Myclass(int x)
	{
		this.x=x;
		
	}
}
class name
{
	static  void print(Object obj)
	{
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
}

public class Demoobject {
	

	public static void main(String[] args) {
		Myclass obj=new Myclass(10);
	name.print(obj);

	}

}
