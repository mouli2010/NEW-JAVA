package constructor;

public class VarArgs {

	public static void main(String[] args) {
		int sum=add("raj",20,32,80);
		System.out.println(sum);

	}
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