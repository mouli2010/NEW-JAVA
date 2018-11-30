package oops;

 class TestRectangle {
	 int length =6;
	 int width=5;
	 
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

}
 public class Rectangle
 {
	 public static void main(String [] args)
	 {
		 TestRectangle tr=new TestRectangle();
		 tr.insert(5, 8);
		 tr.display();
	 }
 }
