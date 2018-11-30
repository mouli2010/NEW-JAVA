package constructor;

public class Callbyvalue2 {

	public static void main(String[] args) {
		Operation2 op=new Operation2();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(op);//passing object  
		   System.out.println("after change "+op.data); 

	}

}
class Operation2{  
	 int data=50;  
	  
	 void change(Operation2 op){  
	 data=data+100;//changes will be in the instance variable  
	 }  
}
