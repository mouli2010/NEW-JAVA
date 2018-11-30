package oopss;

class Sample1
{
	String name;
	int id;

	
	public  Sample1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	/*@Override
	public String toString() {
		return "Sample1 [name=" + name + ", id=" + id + "]";
	}*/


/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/


	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample1 other = (Sample1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class Demoobjectclass2 {

	public static void main(String[] args) {
		Sample1 obj=new Sample1("rajamouli",101);
		//System.out.println(obj.toString());
		Sample1 obj2=new Sample1("rajamouli",101);
		//System.out.println(obj2);
		if(obj.equals(obj2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		
		
		

	}

}
