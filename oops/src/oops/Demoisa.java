package oops;
class Address1{
	String sname;
	String addr;
	public Address1(String sname,String addr)
	{
		this.sname=sname;
		this.addr=addr;
		
	}
	public Address1()
	{
		System.out.println("in super deafult");
	}
	void dispAddress1()
	{
		System.out.println(sname);
		System.out.println(addr);
	}
}
class Studenttwo extends Address1
{
	private String name;
	Studenttwo()
	{
		System.out.println("default");
	}
	Studenttwo(String name,String addr,String sname)
	{
		super(sname,addr);
		this.name=name;
	}
	Studenttwo(String name)
	{
		System.out.println("i am in para");
		this.name=name;
	}
	void show()
	{
		System.out.println(name);
		super.dispAddress1();
	}
	
}
public class Demoisa {

	public static void main(String[] args) {
		Studenttwo ram=new Studenttwo("ramesh","banglore","mhalli");
ram.show();
	}

}
