package oops;

 class Employeee {

	    int id;  
	    String name;  
	    float salary;  
	    void insert(int i, String n, float s) {  
	        id=i;  
	        name=n;  
	        salary=s;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+salary);}  
	}  
 
	public class Employee 
	{  
	public static void main(String[] args) {  
	    Employeee e1=new Employeee();  
	    Employeee e2=new Employeee();  
	    Employeee e3=new Employeee();  
	    e1.insert(101,"ajeet",45000);  
	    e2.insert(102,"irfan",25000);  
	    e3.insert(103,"nakul",55000);  
	    e1.display();  
	    e2.display();  
	    e3.display();  
	}  
	}  


