class Parent
{
	String m1()
	{
		return "Parent Method";
	}
}
class Child extends Parent
{
	public static void main(String args[])
	{
		Child c=new Child();
		System.out.println(c.m1());
	}
	String m1()
	{
		return "Child Method";
	}
}