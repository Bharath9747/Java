class P7{
	public static void main(String ar[])
	{
		double a1=3.4,b1=50.2,c1=44.5,a2=2.1,b2=.55,c2=5.9;
		double det = a1*b2 - a2*b1;
		if(det==0)
			return;
		else{
		double x = (c1*b2-c2*b1)/det;
		double y = (a1*c2-a2*c1)/det;
		System.out.println(x+" "+y);
		}
	}
}