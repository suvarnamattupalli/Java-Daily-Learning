abstract class A
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
class B extends A
{
	@Override
	void m1()
		{System.out.println("m1");}
	@Override
	void m2()
		{System.out.println("m2");}
	@Override
	void m3()
		{System.out.println("m3");}
	public static void main(String args[])
	{	
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
	}
}