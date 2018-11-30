package constructor;
//Java Program to demonstrate the use of static variable  
public class Staticvariable 
{
//Java Program to demonstrate the use of static variable  
 
 int rollno;//instance variable  
 String name;  
 static String college;//static variable  
 //constructor  
 Staticvariable (int r, String n){  
 rollno = r;  
 name = n;  
 }  
 //method to display the values  
 void display (){System.out.println(rollno+" "+name+" "+college);
 }  
//}  
//Test class to show the values of objects  
//public class TestStaticVariable1
//{  
public static void main(String args[]){  
	Staticvariable  s1 = new Staticvariable (111,"Karan");  
	Staticvariable  s2 = new Staticvariable (222,"Aryan");  
//we can change the college of all objects by the single line of code  
//Student.college="BBDIT";  
s1.display();  
s2.display(); 
Staticvariable.college="ITS";
s2.display();
}  
}  



