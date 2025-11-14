interface Parent1
{
	public void m1();
}
interface Parent2
{
	public void m2();
}
class Child implements Parent1,Parent2
{
	public void m1()
	{
		System.out.println("Parent 1 Method");
	}
	public void m2()
	{
		System.out.println("Parent 2 Method");
	}
}
class Main
{
	public static void main(String args[])
	{
		Child c= new Child();
		c.m1();
		c.m2();
	}
}