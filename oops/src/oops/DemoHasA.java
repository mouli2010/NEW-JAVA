package oops;

public class DemoHasA {

	public static void main(String[] args) {
		Address ad=new Address("marthahalli","bengulore");
		Studentone ram=new Studentone(ad,"ramesh");
		ram.show();
		
	}
	}
class Studentone{
	private Address address;
	private String name;
	public Studentone(Address address,String name)
	{
		this.address=address;
		this.name=name;
	}
	void show()
	{
		System.out.println(name);

		System.out.println(address.getAddr());
		System.out.println(address.getSname());
	}
	
}
class Address
{
private String sname;
 private String addr;
public Address(String sname,String addr)
{
	this.sname=sname;
	this.addr=addr;
}
void disp()
{
	System.out.println(sname);
	System.out.println(addr);
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}

}

