package constructor;

public class This3 {
	
		This3()
		{  
		this(5);  
		System.out.println("hello a");  
		}  
		This3(int x){  
		System.out.println(x);  
		}  
		
		public static void main(String args[]){  
			This3 a=new This3();  
		}
}
