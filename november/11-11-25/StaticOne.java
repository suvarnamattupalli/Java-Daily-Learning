class StaticOne
{
	public static void main(String args[])
	{
		StaticOne s=new StaticOne();
		s.m1();
		m2();
	}
	int x=20;
	static int y=30;
	void m1()
	{
		System.out.println("Non static method - access via Object");
	}
	static void m2()
	{
		System.out.println("Static Method - access directly");
	}
}