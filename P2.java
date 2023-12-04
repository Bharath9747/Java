package Shape;

class P2
{
	public static void main(String ar[])
	{
		Rectangle r = new Rectangle();
		r.setL(5);
		r.setH(4);
		Shapes s[] = {new Triangle(3,4),r,new Circle(5)};

		for(Shapes e:s)
		System.out.println(e.area());
	}
}