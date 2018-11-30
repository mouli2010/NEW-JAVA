package constructor;

public class Employeee {
	private String ename;
	private int eid;
	 private int esalary;
	  
	
	 Employeee()
	{
		ename="raju";
		eid=101;
		esalary=2500;
	}
	Employeee(String name,int id ,int salary)
	{
		ename=name;
		eid=id; 
		esalary=salary;
	}
	Employeee(String name,int id)
	{
		ename=name;
		eid=id; 
	}
	void display()
	{
		System.out.println(ename+"  "+eid+"  "+esalary);
	}
	
}
