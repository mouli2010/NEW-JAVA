package oopss;
class Adder
{
	//static int add(int x,int y)
	//{
		//return x+y;
	//}
	
	static int add(int x,int y,int z)
	{
		return x+y+z;
	}
	static double add(double x, double y)
	{
		return x+y;
    }
	static int add(int a,int b)
	{ 
		return a+b;
		//System.out.println(a+b);
		
	} 
}
public class Methodoverloding {

	public static void main(String[] args) {
	
//int x=Adder.add(10, 20);
int y=Adder.add(10, 20,20);
//System.out.println(x);
System.out.println(y);
System.out.println(Adder.add(12.3,12.6)); 
System.out.println(Adder.add(11,80));
	}

}
