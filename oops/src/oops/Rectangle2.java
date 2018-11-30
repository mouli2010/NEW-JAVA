package oops;
/*class TestRectangle {
	 int length;
	 int width;
	 
	  void insert(int l,int w)
	  {
		  length=l;
		  width=w;
	  }
	void display()
	{
		System.out.println("area of rectangle:"+(length*width));
		System.out.println("perimeter of a rectangle:"+(2*(length+width)));
		
	}

}*/

public class Rectangle2 {
	public static void main(String [] args)
	 {
		 TestRectangle tr1=new TestRectangle(),tr2=new TestRectangle();
		 tr1.insert(5, 8);
		 tr1.display();
		 tr2.insert(7, 5);
		 tr2.display();
}
}