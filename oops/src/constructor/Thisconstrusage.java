package constructor;

public class Thisconstrusage {
		int rollno;  
		String name,course;  
		float fee;  
		Thisconstrusage(int rollno,String name,String course)
		{  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		}  
		Thisconstrusage(int rollno,String name,String course,float fee)
		{  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
		}  
		void display()
		{
			System.out.println(rollno+" "+name+" "+course+" "+fee);
			}  
		public static void main(String args[])
		{  
			Thisconstrusage s1=new Thisconstrusage(111,"ankit","java");  
			Thisconstrusage s2=new Thisconstrusage(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
		}
}
