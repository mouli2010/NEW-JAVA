package oopss;
class Vehicle
{ 
	
	  void run()
	  {
		  System.out.println("Vehicle is running");
	  }  
	}
class Bike extends Vehicle{
	void run(){
		 System.out.println("Bike is running safely");
		 super.run();
		 }
}
public class Methodoverriding {

	public static void main(String[] args) {
		Bike obj = new Bike();  
		   
		  obj.run();  

	}

}
