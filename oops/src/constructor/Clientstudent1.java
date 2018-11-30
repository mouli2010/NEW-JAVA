package constructor;

public class Clientstudent1 {

	public static void main(String[] args) {
	
Student1 ram=new Student1("ramesh",420);
Student1 raj=new Student1("raj kumar",420); 
      ++ram.id;
     ++ram.marks;
      ram.disp();
      raj.disp();
	}

}
