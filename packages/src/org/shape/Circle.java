package org.shape;

public class Circle { 
	private int radious;
	public Circle(int s)
	{
		radious=s;
	}
	public double perimeter()
	{
	return (2*3.14*radious);
	}public double area()
	{
		return (3.14*radious*radious);
	}
}
