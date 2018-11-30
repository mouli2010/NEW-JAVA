package oopss;
class Sample
{
	String name;
	public  Sample(String name)
	{
		this.name=name;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Sample other = (Sample) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	/*@Override
	public String toString() {
		return  name ;
	}*/



	
}
public class Demoobjectclass {

	public static void main(String[] args) {
		String nam=new String("rajamouli");
		System.out.println(nam);
		//System.out.println(nam.toString());
		Sample obj=new Sample("rajamouli");
		System.out.println(obj.toString());
		Sample obj2=new Sample("rajamouli");
		System.out.println(obj2);
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
