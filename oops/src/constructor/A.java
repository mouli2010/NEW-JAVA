package constructor;

public class A {
	A getA(){  
		return this;  
		}  
		void msg(){System.out.println("Hello java");}  
	

		public static void main(String args[]){  
			new A().getA();
		new A().msg();  
		} 

}
