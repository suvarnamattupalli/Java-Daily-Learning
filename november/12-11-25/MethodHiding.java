class MethodHiding
{
	public static void main(String args[])
	{
		Parent p=new Child();
		System.out.println(p.m1());
		System.out.println(p.m2());

	}
}
class Parent
{
	static int x;
	static String m1()
	{
		return "Parent Method";
	}
	static int m2()
	{	
		x=100;
		return x;
	}
	
	
}
class Child extends Parent	//Child Methods are hided,not overriden bcoz we used static.
{
	static String m1()
	{
		return "Child method";
	}
	static int m2()
	{	
		x=1000;
		return x;
	}
}