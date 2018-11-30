package strings;

class Employee implements Cloneable
{
	int id;
	String name;
Employee(int id,String name)
{
	this.id=id;
	this.name=name;
	
}
void getData()
{
	System.out.println("id="+id);
	System.out.println(("name="+name));
}
public Object myclone()throws CloneNotSupportedException
{
	//return clone();
	 return super.clone();
}
/*protected Object clone()throws CloneNotSupportedException
{
	return super.clone();
}
}*/
}

public class Clonedemo {

	public static void main(String[] args)throws CloneNotSupportedException
	{
		Employee e1=new Employee(10,"srinivas");
		System.out.println("original object");
		e1.getData();
		Employee e2=(Employee)e1.myclone();
		//Employee e2=(Employee)e1.clone();
		System.out.println("cloned object");
		e2.getData();

	}

}
