package Shape;

import Shape.Shapes;

public class Triangle implements Shapes
{
	private int l;
	private int h;
	Triangle(int l,int h)
	{
		this.l=l;
		this.h=h;
	}
	@Override
	public double area()
	{
		return 0.5f*this.l*this.h;
	}
}