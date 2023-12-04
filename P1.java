class P1
{
	public static void main(String ar[])
	{
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s+"=="+s1+" : "+(s==s1));
		System.out.println(s1+"=="+s2+" : "+(s1==s2));
	}
}