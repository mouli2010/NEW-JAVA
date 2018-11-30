package constructor;

public class Callbyvalue {
	 public static void main(String args[]){  
		 Testcallbyvalue obj  =new  Testcallbyvalue();  
		  
		   System.out.println("before change "+obj.data);  
		   obj.change(500);  
		   System.out.println("after change "+obj.data);  
	 }  
}
	 class Testcallbyvalue
	 {
	int data=50;
	void change(int data)
	{  
		 data=data+100;

     }
	 }
	
