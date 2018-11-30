package constructor;

public class Args {
	
	 static int add(String name,int  ...i)
	 {
		 System.out.println(name);
		 System.out.println(i[2]);
		 int temp=0;
		 for(int j:i)
		 {
			 temp+=j;
		 }
		 return temp;
	 }

}
