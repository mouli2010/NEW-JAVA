package oops;
class Employ
{
	String eid;
	String ename;
	String addr;
Employ(String eid,String ename,String addr)
{
	this.eid=eid;
	this.ename=ename;
	this.addr=addr;
}
}
class Department
{
	String did;
	String dname;
	Employ []emps;
	Department(String did,String dname,Employ []emps)
	{
		this.did=did;
		this.dname=dname;
		this.emps=emps;
	}
	public void getdeptdetails()
	{
		System.out.println("department details");
		System.out.println("department id:"+did);
		System.out.println("department name:"+dname);
		System.out.println("-------------");
		System.out.println("eid    ename     eaddr");
		System.out.println("-------------");
		for (int i = 0; i < emps.length; i++) 
		{
			Employ e=emps[i];
			System.out.println(e.eid+" "+e.ename+" "+e.addr);
		}
		
	}
}
public class Onetomany {

	public static void main(String[] args) {
	       
		Employ e1=new Employ("E-111","aaa","hyd");
		Employ e2=new Employ("E-222","bbb","sec");
		Employ e3=new Employ("E-333","ccc","vijayavada");
		Employ[] emps=new Employ[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		Department dept =new Department("D-111","admin",emps);
		dept.getdeptdetails();
	}

}
