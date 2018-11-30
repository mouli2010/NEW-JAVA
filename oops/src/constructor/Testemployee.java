package constructor;

public class Testemployee {

	public static void main(String[] args) {
		Employeee emp1=new Employeee();
		
		Employeee emp2=new Employeee("mouli",111,25000);
		Employeee emp3=new Employeee("hemanth",222);
		emp1.display();
		emp2.display();
		emp3.display();
	}

}
