package constructor;

public class Staticmethod {
	int rollno;  
    String name;
    static String college = "ITS";
    
    static void change()
    {  
        college = "BBDIT"; 
        
    } 
    Staticmethod(int r, String n)
    {
    	 rollno = r;  
         name = n; 
    }
    void display() 
    { 
    	System.out.println(rollno+" "+name+" "+college);
    }
    public static void main(String args[])
    {  
    	Staticmethod.change();
    	Staticmethod s1 = new Staticmethod(111,"Karan");  
    	Staticmethod s2 = new Staticmethod(222,"Aryan");  
    	Staticmethod s3 = new Staticmethod(333,"Sonoo"); 
    	s1.display();  
        s2.display();  
        s3.display();
}
}
