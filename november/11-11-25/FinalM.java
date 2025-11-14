class Child extends Parent
{
	public static void main(String args[])
	{
	
	}
	void m1()
	{
		System.out.println("Child");
	}
}
class Parent
{
	final void m1()
	{
		System.out.println("Parent");
	}
}

/*

Final.java:1: error: cannot inherit from final Parent
class Child extends Parent
                    ^
1 error

*/