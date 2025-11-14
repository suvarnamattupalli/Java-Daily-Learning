@FunctionalInterface
interface X
{
	public void m1();
}
class Child implements X
{
	public static void main(String args[])
	{
		Child child = new Child();
		child.m1();
	}
	public void m1()
	{
		System.out.println("Functional Interface, which has only 1 abstract method");
	}
}