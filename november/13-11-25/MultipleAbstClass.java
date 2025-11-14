abstract class A
{
	abstract void m1();
	abstract void m2();
	abstract void m3();	
}
abstract class B extends A
{
	@Override
	void m1()	//Here only 1 method is overrided, so make this class as abstract and create child class for it to implement remaining methods.
		{System.out.println("m1");}
}
class C extends B
{
	@Override
	void m2()
		{System.out.println("m2");}
	@Override
	void m3()
		{System.out.println("m3");}
	public static void main(String args[])
	{	
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}