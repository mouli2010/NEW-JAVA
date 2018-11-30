package constructor;
public class Empravi
{
	public static void main(String []args)
	{
		Empravi1 E1=new Empravi1();
		
		
	}
}

 class Empravi1 {
	private String name;
	private int id;
	Empravi1()
	{
		this("ramesh",420);
		
		System.out.println("i am deafault");
		this.disp();
		
	}
	Empravi1(String name,int id)
	{
		this(name);
		System.out.println("i am parameterised ");
		this.id=id;
		 
	}
	Empravi1(String name)
	{
		this.name=name;
	}
	
	void disp()
	{
		System.out.println(name);
		System.out.println(id);
		show(10);
	}
	void show(int id)
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(this.id);
	}
	

}
