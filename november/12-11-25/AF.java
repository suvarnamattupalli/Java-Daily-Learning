abstract final class AF
{
	public static void main(String args[])
	{

	}
	abstract void m1();
}
class Child extends AF
{
	void m1()
	{
		System.out.println("Method");
	}
}
/*

AF.java:1: error: illegal combination of modifiers: abstract and final
abstract final class AF
               ^
AF.java:9: error: cannot inherit from final AF
class Child extends AF
                    ^
2 errors
*/