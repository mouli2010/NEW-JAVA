package absrtact;
interface Drawable
{
	void draw();
	static int cube(int x)
	{
		return x*x*x;
	}
	default void msg()
	{
		System.out.println("default method");
	}
}
class Rectangle implements Drawable
{
	public void draw(){
		System.out.println("drawing rectangle");
	}
}
public interface Interface6 {
	public static void main(String[] args) {
		Drawable d=new Rectangle();
		d.draw();
		d.msg();
		
		System.out.println(Drawable.cube(3));
	}

}
