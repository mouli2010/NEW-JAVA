package oops;
import java.text.*;
public class Areaofcircle {

	public static void main(String[] args) {
		final double pi=(double)22/7;
		double r=15.5;
		double area=pi*r*r;
		System.out.println("Area="+area);
		NumberFormat obj=NumberFormat.getNumberInstance();
		obj.setMaximumFractionDigits(3);
		obj.setMinimumIntegerDigits(5);
		String str =obj.format(area);
		System.out.println("formatted area="+str);
		

	}

}
