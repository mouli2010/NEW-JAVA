package oops;

class Branch
{
	String bid;
	String bname;
	Branch(String bid,String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}
}
class Studen
{
	String sid;
	String sname;
	String saddr;
	Branch branch;
	Studen(String sid,String sname,String saddr,Branch branch)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.branch=branch;
	}
	public void getstudentdetails()
	{
		System.out.println("student details");
		System.out.println("student id:"+sid);
		System.out.println("student name:"+sname);
		System.out.println("student address:"+saddr);
		System.out.println("branch details");
		System.out.println("branch id:"+branch.bid);
		System.out.println("branch name:"+branch.bname);
	}
}
public class Manytoone {

	public static void main(String[] args) {
		Branch branch=new Branch("B-111","ece");
		Studen std1=new Studen("S-111","aaa","hyd",branch);
		Studen std2=new Studen("S-222","bbb","sec",branch);
		Studen std3=new Studen("S-333","ccc","vizag",branch);
		std1.getstudentdetails();
		System.out.println();
		std2.getstudentdetails();
		System.out.println();
		std2.getstudentdetails();
		System.out.println();
	}

}
