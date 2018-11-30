package oops;

public class Demoanno {
	

	public static void main(String[] args) {
	X obj=new X()
			{
		public void disp(){
			System.out.println(i);
			System.out.println("hello");
		}
		public void show(){
			System.out.println(i);
		}
			};
			obj.disp();
			//obj.show();

	}

}
class X
{
	int i=10;
	public void disp()
	{
		class Testo{
			int y=10;
			
		}
		Testo obj=new Testo();
		System.out.println(obj.y);
		System.out.println(i);
	}
} 
