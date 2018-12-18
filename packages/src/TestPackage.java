
import org.shape.Circle;
import org.shape.Square;
import org.shape.Triangle;
import java.util.*;
public class TestPackage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter The side of the Square : ");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("perimeter of sqare is"+sq.perimeter());
		System.out.println("area of sqare is"+sq.area());
		System.out.println("Enter The radius of the Circle : ");
		int r=sc.nextInt();
		Circle ci=new Circle(r);
		System.out.println("Perimeter of Circle is " + ci.perimeter());
		System.out.println("Area of Circle is " + ci.area());
		System.out.println("Enter The Side1 of the Triangle : ");
		int s1=sc.nextInt();
		System.out.println("Enter The Side2 of the Triangle : ");
		int s2=sc.nextInt();
		System.out.println("Enter The Side3 of the Triangle : ");
		int s3=sc.nextInt();
		Triangle t=new Triangle(2,5,6);
		System.out.println("Perimeter of Triangle is " + t.perimeter());
		System.out.println("Area of Triangle is " + t.area());
	}

}
