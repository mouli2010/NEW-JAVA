package oops;

import java.util.Arrays;

public class Demostudent {

	public static void main(String[] args) {
		/*String s[]={"h","e"};
		int id[]={2,5};*/
		Student1[] s1=new Student1[5];
		s1[0]=new Student1("ravi",101);
		s1[1]=new Student1("raju",109);
		s1[2]=new Student1("ramu",103);
		s1[3]=new Student1("raj",105);
		s1[4]=new Student1("ram",101);
		
		
		for (Student1 student1 : s1) {
			student1.disp();
		}
	   
	/*for (int i = 0; i < s1.length; i++) {
		s1[i].disp();
	}*/ 
		
		Student1 temp;
		   for (int i = 0; i <s1 .length-1; i++)
		   {
		    for (int j = 0; j < (s1 .length-1)-i; j++) 
		    {
		     if (s1[j].getId() > s1 [j + 1].getId())
		     {
		      temp = s1[j];
		      s1[j] = s1[j + 1];
		      s1[j +1] = temp;
		     }
		    }
		   }
		   for (int i = 0; i < s1.length; i++) {
		     s1[i].disp();
		   }
		
}
}
class Student1
{
	private String name;
	private int id;
	Student1(String name,int id)
	{
		this.name=name;
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	void disp()
	{
		System.out.print(name);
		System.out.println(id);
	}

}