package constructor;

public class Student1 {
	String name;
	int id;
	static int marks=10;
	public Student1(String name,int id)
	{  
		this.name=name;
		this.id=id;
		
	}
       void disp()
       {
    	   System.out.println(this.name);
    	   System.out.println(id);
    	   System.out.println(marks);
       }
       static void show()
       {
    	   System.out.println(marks);
    	   Student1.showone();
       }
	static void showone()
	{
		System.out.println(marks);
	}
	
}
