package in.regnent.app;

public class Calculation {
public static void main(String[] args) {
	Mul.mul(2, 3);
	//Div.div(2, 2);
	//Add.addition(2, 3);
}
}
class Mul {
	public static void mul(int a, int b){
		System.out.println("a+b"+a*b);
	}
}

class Div {
	public static void div(int a, int b){
		System.out.println("a+b"+a/b);
	}
}

 class Add { 
	 public static void addition(int a, int b){
			System.out.println("a+b"+(a+b));
		}
	
}

