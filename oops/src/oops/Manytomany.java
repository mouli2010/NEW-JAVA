package oops;
class Course
{
	String cid;
	String cname;
	int ccost;
	Course(String cid,String cname,int ccost)
	{
		this.cid=cid;
		this.cname=cname;
		this.ccost=ccost;
	}
}
class Stud
{
	String sid;
	String sname;
	String saddr;
	Course []crs;
	Stud(String sid,String sname,String saddr,Course []crs)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.crs=crs;
	}
	public void getstudentdetails()
	{
		System.out.println("student details");
		System.out.println("----------");
		System.out.println("student id:"+sid);
		System.out.println("student name:"+sname);
		System.out.println("student address:"+saddr);
		System.out.println("cid  cname  ccost");
		for (int i = 0; i < crs.length; i++)
		{
			Course c=crs[i];
			System.out.println(c.cid+"  "+c.cname+"  "+c.ccost);
		}
	}
}
public class Manytomany {       

	public static void main(String[] args) {
		Course c1=new Course("c-111","c lang",1000);
		Course c2=new Course("c-222","c++",2000);
		Course c3=new Course("c-333","java",100000);
		Course[] crs=new Course[3];
		crs[0]=c1;
		crs[1]=c2;
		crs[2]=c3;
		Stud std1=new Stud("s-111","aaa","hyd",crs);
		Stud std2=new Stud("s-222","bbb","sec",crs);
		Stud std3=new Stud("s-333","ccc","vizag",crs);
		std1.getstudentdetails();
		System.out.println();
		std2.getstudentdetails();
		System.out.println();
		std3.getstudentdetails();
		
	}

}
