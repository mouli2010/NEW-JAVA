package constructor;

public class DemoSetter {

	public static void main(String[] args) {
		Stud ram=new Stud();
		ram.setId(420);
		ram.setName("ramesh");
		System.out.println(ram.getName());
		System.out.println(ram.getId());
  
	}

}
class Stud
{
	private String name;
	private int id;
	//setters
	public void setName(String name)
	{
		this.name=name;
				
	}
	public void setId(int id)
	{
		this.id=id;
				
	}
	//getters
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
}
