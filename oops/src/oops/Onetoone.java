package oops;

class Accountone
{
	String accno;
	String accname;
	String acctype;
	Accountone(String accno,String accname,String acctype)
	{
		this.accno=accno;
		this.accname=accname;
		this.acctype=acctype;
	}
}
class Employeeone
{
	String eid;
	String ename;
	float esal;
	Accountone acc;
	Employeeone(String eid,String ename,float esal,Accountone acc)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.acc=acc;
	}
	public void getEmpdetails()
	{
		System.out.println("employee details");
		System.out.println("employee id:"+eid);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+esal);
		System.out.println();
		System.out.println("Accaount details");
		System.out.println("---------------");
		System.out.println("account number:"+acc.accno);
		System.out.println("account name:"+acc.accname);
		System.out.println("account type:"+acc.acctype);
		
		
	}
	
}
public class Onetoone {

	public static void main(String[] args) {
		Accountone acc=new Accountone("abc123","TCS","saving");
		Employeeone emp=new Employeeone("E-111","RAJAMOULI",50000.0f,acc);
		emp.getEmpdetails();

	}

}
