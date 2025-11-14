interface int1
{
	void m1();
}
interface int2
{
	void m2();
}
class Parent
{
	Parent()
	{
		System.out.println("Parent Class constructor");
	}
}
class Child extends Parent implements int1,int2	//SingleInheritance MultilpleInterface
{
	@Override
	public void m1()
	{
		System.out.println("Overriding Interface-1 method");
	}
	@Override
	public void m2()
	{
		System.out.println("Overriding Interface-2 method");
	}
	public static void main(String args[])
	{
		Child child=new Child();
		child.m1();
		child.m2();
	}
}