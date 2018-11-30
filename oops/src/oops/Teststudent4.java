package oops;

public class Teststudent4  {
	private int id=111;
	private int sno=232;
	private String sname="vikram";
	private static String college="avrsvr";
void insertRecord(int no,String name)
	{
		id=no;
		sname=name;
	}
	
	//Teststudent4(int id ,int sno, String sname){
	 // this.  id=id;
	  // this. sno=sno;
		//this.sname=sname;
	//}
	void displayInformation()
	{
		System.out.println(id+" "+sname+" "+college+" "+sno);
	}

	public static void main(String[] args) 
	{
		Teststudent4 s1=new Teststudent4();
		Teststudent4 s2=new Teststudent4();
		//System.out.println(s1.id);
		
		//Teststudent4 obj= new Teststudent4(7,8,"hello");
		//Teststudent4 obj1= new Teststudent4(9,10,"hi");

		//System.out.println(obj.id);
s1.insertRecord(8, "hi");
s1.sname="veerendra";
s1.displayInformation();
s2.insertRecord(78, "hello");
s2.displayInformation();
//obj1.displayInformation();
	}

}
