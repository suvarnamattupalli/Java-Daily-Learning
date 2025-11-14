abstract class Parent
{
	void m1()
	{
		System.out.println("Implemented Method in abstract class");
	}
	abstract void m2();
}
class Child extends Parent
{
	@Override
	void m2()
	{
		System.out.println("Overriden Method in Child Class");
	}
	public static void main(String args[])
	{
		Child c= new Child();
		c.m1();
		c.m2();
		
	}
}
