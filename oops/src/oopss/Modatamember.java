package oopss;
class Bike1{  
	 int speedlimit=90;  
	}  
	class Honda3 extends Bike1{  
	 int speedlimit=150;
	}
public class Modatamember {

	public static void main(String[] args) {
		 Bike1 obj=new Honda3();  
		  System.out.println(obj.speedlimit);

	}

}
